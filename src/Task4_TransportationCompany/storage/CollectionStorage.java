package Task4_TransportationCompany.storage;

import Task4_TransportationCompany.cargo.domain.Cargo;
import Task4_TransportationCompany.carrier.domain.Carrier;
import Task4_TransportationCompany.common.business.domain.BaseEntity;
import Task4_TransportationCompany.transportation.domain.Transportation;

import java.util.ArrayList;
import java.util.List;

public class CollectionStorage {

    public static List<Cargo> cargos = new ArrayList<>();
    public static List<Carrier> carriers = new ArrayList<>();
    public static List<Transportation> transportations = new ArrayList<>();

}
