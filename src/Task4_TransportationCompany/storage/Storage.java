package Task4_TransportationCompany.storage;

import Task4_TransportationCompany.cargo.domain.Cargo;
import Task4_TransportationCompany.carrier.domain.Carrier;
import Task4_TransportationCompany.transportation.domain.Transportation;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private static final int ARRAY_CAPACITY = 10;

    public static Cargo[] cargos = new Cargo[ARRAY_CAPACITY];
    public static Carrier[] carriers = new Carrier[ARRAY_CAPACITY];
    public static Transportation[] transportations = new Transportation[ARRAY_CAPACITY];

    public static List<Cargo> cargoCollection = new ArrayList<>();
    public static List<Carrier> carrierCollection = new ArrayList<>();
    public static List<Transportation> transportationCollection = new ArrayList<>();

}