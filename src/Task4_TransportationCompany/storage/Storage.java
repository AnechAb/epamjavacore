package Task4_TransportationCompany.storage;

import Task4_TransportationCompany.cargo.domain.Cargo;
import Task4_TransportationCompany.carrier.domain.Carrier;
import Task4_TransportationCompany.common.utils.ArrayUtils;
import Task4_TransportationCompany.transportation.domain.Transportation;

public class Storage {

    private static final int ARRAY_CAPACITY = 10;

    private static Cargo[] cargos = new Cargo[ARRAY_CAPACITY];
    private static int cargoIndex = 0;

    private static Carrier[] carriers = new Carrier[ARRAY_CAPACITY];
    private static int carrierIndex = 0;

    private static Transportation[] transportations = new Transportation[ARRAY_CAPACITY];
    private static int transportationIndex = 0;

    public static void addCargo(Cargo cargo) {
        cargo.setId(IdGenerator.generateId());
        cargos[cargoIndex] = cargo;
        cargoIndex++;

        if (cargoIndex == cargos.length) {
            Cargo[] newCargos = new Cargo[cargos.length * 2];
            ArrayUtils.copyArray(cargos, newCargos);
            cargos = newCargos;
        }
    }

    public static void printAllCargos() {
        ArrayUtils.printArray(cargos);
    }


    public static void addCarrier(Carrier carrier) {
        carrier.setId(IdGenerator.generateId());
        carriers[carrierIndex] = carrier;
        carrierIndex++;

        if (carrierIndex == carriers.length) {
            Carrier[] newCarriers = new Carrier[carriers.length * 2];
            ArrayUtils.copyArray(carriers, newCarriers);
            carriers = newCarriers;
        }
    }

    public static void printAllCarriers() {
        ArrayUtils.printArray(carriers);
    }

    public static void addTransportation(Transportation transportation) {
        transportation.setId(IdGenerator.generateId());
        transportations[transportationIndex] = transportation;
        transportationIndex++;

        if (transportationIndex == transportations.length) {
            Transportation[] newTransportations = new Transportation[transportations.length * 2];
            ArrayUtils.copyArray(transportations, newTransportations);
            transportations = newTransportations;
        }
    }

    public static void printAllTransportations() {
        ArrayUtils.printArray(transportations);
    }

}