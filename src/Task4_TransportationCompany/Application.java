package Task4_TransportationCompany;

import Task4_TransportationCompany.common.utils.ArrayUtils;
import Task4_TransportationCompany.storage.Storage;
import Task4_TransportationCompany.storage.initor.InMemoryStorageInitor;
import Task4_TransportationCompany.storage.initor.StorageInitor;

import java.util.Arrays;

import static Task4_TransportationCompany.cargo.repo.GettersCargo.*;
import static Task4_TransportationCompany.carrier.repo.GettersCarrier.*;


public class Application {

    private static final String SEPARATOR = "--------------";

    public static void main(String[] args) {
        StorageInitor storageInitor = new InMemoryStorageInitor();
        storageInitor.initStorage();
        printStorageData();
        doSearchOperations();
    }

    private static void printStorageData() {
        System.out.println("ALL CARGOS");
        Storage.printAllCargos();
        printSeparator();

        System.out.println("ALL CARRIERS");
        Storage.printAllCarriers();
        printSeparator();

        System.out.println("ALL TRANSPOORTATIONS");
        Storage.printAllTransportations();
        printSeparator();
    }

    private static void doSearchOperations() {
        System.out.println("SEARCH CARGO BY ID = 1");
        System.out.println(getCargoById(1L));
        printSeparator();

        System.out.println("SEARCH CARRIER BY ID = 8");
        System.out.println(getCarrierById(8L));
        printSeparator();

        System.out.println("SEARCH CARGOES BY NAME = 'Clothers_Name_1'");
        System.out.println(Arrays.toString(getCargosByName("Clothers_Name_1")));
        printSeparator();

        System.out.println("SEARCH CARRIERS BY NAME = 'Carrier_Name'");
        ArrayUtils.printArray(getCarriersByName("Carrier_Name"));
    }

    private static void printSeparator() {
        System.out.println(SEPARATOR);
    }

}