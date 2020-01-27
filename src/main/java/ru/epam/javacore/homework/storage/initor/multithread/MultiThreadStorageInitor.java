package main.java.ru.epam.javacore.homework.storage.initor.multithread;

import main.java.ru.epam.javacore.homework.cargo.domain.Cargo;
import main.java.ru.epam.javacore.homework.carrier.domain.Carrier;
import main.java.ru.epam.javacore.homework.common.business.exception.checked.InitStorageException;
import main.java.ru.epam.javacore.homework.storage.initor.fileinitor.BaseFileInitor;
import main.java.ru.epam.javacore.homework.transportation.domain.Transportation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MultiThreadStorageInitor extends BaseFileInitor {

    @Override
    public void initStorage() throws InitStorageException {
        try {
            CargoParser cargoParser = new CargoParser();
            CarrierParser carrierParser = new CarrierParser();
            TransportationParser transportationParser = new TransportationParser();

            List<Thread> parsers = Arrays.asList(
                    new Thread(cargoParser),
                    new Thread(carrierParser),
                    new Thread(transportationParser)
            );

            startParseWithThreads(parsers);
            waitAllParserHaveFinished(parsers);

            boolean hasErrorWhileParseFile =
                    cargoParser.isHasError() && carrierParser.isHasError() && transportationParser
                            .isHasError();

            if (hasErrorWhileParseFile) {
                throw new Exception("Error while parse data!");
            }

            Map<String, Cargo> cargoMap = cargoParser.getCargoMap();
            Map<String, Carrier> carrierMap = carrierParser.getCarrierMap();
            List<ParsedTransportation> transportations = transportationParser.getTransportations();
            setReferencesBetweenEntities(cargoMap, carrierMap, transportations);

            persistCargos(cargoMap.values());
            persistCarriers(carrierMap.values());
            List<Transportation> transportationList = getTransportationsFromParsedObject(transportations);
            persistTransportations(transportationList);


        } catch (Exception e) {
            throw new InitStorageException(e.getMessage());
        }
    }

    private void startParseWithThreads(List<Thread> threads) {
        for (Thread thread : threads) {
            thread.start();
        }
    }

    private void waitAllParserHaveFinished(List<Thread> threads) throws InterruptedException {
        for (Thread thread : threads) {
            thread.join();
        }
    }
}