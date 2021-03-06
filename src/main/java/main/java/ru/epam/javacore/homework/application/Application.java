package main.java.ru.epam.javacore.homework.application;

import static java.util.Collections.singletonList;
import static main.java.ru.epam.javacore.homework.cargo.domain.CargoField.NAME;
import static main.java.ru.epam.javacore.homework.cargo.domain.CargoField.WEIGHT;
import static main.java.ru.epam.javacore.homework.common.solutions.search.OrderType.ASC;
import static main.java.ru.epam.javacore.homework.common.solutions.search.OrderType.DESC;
import static main.java.ru.epam.javacore.homework.storage.initor.StorageInitorFactory.getStorageInitor;

import main.java.ru.epam.javacore.homework.application.serviceholder.ServiceHolder;
import main.java.ru.epam.javacore.homework.application.serviceholder.StorageType;
import main.java.ru.epam.javacore.homework.transportation.service.TransportationService;
import main.java.ru.epam.javacore.homework.cargo.domain.Cargo;
import main.java.ru.epam.javacore.homework.cargo.domain.CargoField;
import main.java.ru.epam.javacore.homework.cargo.search.CargoSearchCondition;
import main.java.ru.epam.javacore.homework.cargo.service.CargoService;
import main.java.ru.epam.javacore.homework.carrier.service.CarrierService;
import main.java.ru.epam.javacore.homework.common.business.exception.checked.InitStorageException;
import main.java.ru.epam.javacore.homework.common.business.exception.checked.ReportException;
import main.java.ru.epam.javacore.homework.common.solutions.search.OrderType;
import main.java.ru.epam.javacore.homework.common.solutions.utils.CollectionUtils;
import main.java.ru.epam.javacore.homework.reporting.ReportDefaultService;
import main.java.ru.epam.javacore.homework.reporting.ReportService;
import main.java.ru.epam.javacore.homework.storage.initor.InitStorageType;
import main.java.ru.epam.javacore.homework.storage.initor.StorageInitor;

import java.util.*;

public class Application {

  private static final String SEPARATOR = "--------------";
  private static CargoService cargoService;
  private static CarrierService carrierService;
  private static TransportationService transportationService;

  public static void main(String[] args) {
    try {
      ServiceHolder.initServiceHolder(StorageType.COLLECTION);
      cargoService = ServiceHolder.getInstance().getCargoService();
      carrierService = ServiceHolder.getInstance().getCarrierService();
      transportationService = ServiceHolder.getInstance().getTransportationService();

      StorageInitor storageInitor = getStorageInitor(InitStorageType.MULTI_THREAD);
      storageInitor.initStorage();

      printStorageData();
      demoSearchOperations();
      demoSortOperations();
      demoExceptions();

      demoReportService();
    } catch (InitStorageException e) {
      e.getCause().printStackTrace();
    }catch (Exception e){
      e.printStackTrace();
    }
  }

  private static void demoSearchOperations() {
    System.out.println("SEARCH CARGO BY ID = 1");
    System.out.println(cargoService.findById(1L));
    printSeparator();

    System.out.println("SEARCH CARRIER BY ID = 8");
    System.out.println(carrierService.findById(8L));
    printSeparator();

    System.out.println("SEARCH CARGOES BY NAME = 'Clothers_Name_1'");
    CollectionUtils.printCollection(cargoService.findByName("Clothers_Name_1"));
    printSeparator();

    System.out.println("SEARCH CARRIERS BY NAME = 'Carrier_Name'");
    CollectionUtils.printCollection(carrierService.findByName("Carrier_Name"));
  }

  private static void printStorageData() {
    System.out.println("ALL CARGOS");
    cargoService.printAll();
    printSeparator();

    System.out.println("ALL CARRIERS");
    carrierService.printAll();
    printSeparator();

    System.out.println("ALL TRANSPOORTATIONS");
    transportationService.printAll();
    printSeparator();
  }

  private static void printSeparator() {
    System.out.println(SEPARATOR);
  }

  private static void demoSortOperations() {
    demoCargoSorting(singletonList(NAME), ASC);
    demoCargoSorting(singletonList(NAME), DESC);

    demoCargoSorting(singletonList(WEIGHT), ASC);
    demoCargoSorting(singletonList(WEIGHT), DESC);

    demoCargoSorting(Arrays.asList(NAME, WEIGHT), ASC);
    demoCargoSorting(Arrays.asList(NAME, WEIGHT), DESC);
  }

  private static String getOrderingConditionsAsString(CargoSearchCondition condition) {
    StringBuilder result = new StringBuilder();
    result.append(" ORDER BY ");

    Iterator<CargoField> iter = condition.getSortFields().iterator();
    while (iter.hasNext()) {
      CargoField fld = iter.next();
      result.append(fld);

      if (iter.hasNext()) {
        result.append(",");
      }
    }

    result.append(" ").append(condition.getOrderType());

    return result.toString();
  }

  private static void demoCargoSorting(Collection<CargoField> sortFields, OrderType orderType) {
    CargoSearchCondition cargoSearchCondition = new CargoSearchCondition();
    cargoSearchCondition.setOrderType(orderType);
    cargoSearchCondition.setSortFields(new LinkedHashSet<>(sortFields));
    System.out.println(
            "---------Sorting '" + getOrderingConditionsAsString(cargoSearchCondition) + "'------");
    cargoService.search(cargoSearchCondition);
    cargoService.printAll();
    System.out.println();
  }

  private static void demoExceptions() {
    System.out.println("------Demo  exceptions------------");
    Long firstCargo = cargoService.getAll().get(0).getId();
    Optional<Cargo> cargoOptional = cargoService.getByIdFetchingTransportations(firstCargo);

    if (cargoOptional.isPresent()) {
      Cargo cargo = cargoOptional.get();

      System.out.println("Try to delete cargo");
      System.out.println("Cargo details:");
      System.out.println("id: " + cargo.getId());
      System.out.println("name: " + cargo.getName());
      System.out.println("total transportations: " + (cargo.getTransportations() != null ? cargo
              .getTransportations().size() : 0));
      System.out.println();
      try {
        cargoService.deleteById(cargo.getId());
      } catch (Exception e) {
        System.out.println("OOPS, something went wrong!");
        System.out.println(e.getMessage());
      }
    }
  }

  private static void demoReportService() throws ReportException {
    System.out.println("----------Demo report service ---------------");
    ReportService reportService = new ReportDefaultService(
            cargoService, carrierService, transportationService
    );
    reportService.exportData();
  }
}