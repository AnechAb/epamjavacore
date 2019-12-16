package Task4_TransportationCompany.transportation.repo;

import Task4_TransportationCompany.transportation.domain.Transportation;

public interface GettersTransportation {
    int ARRAY_CAPACITY = 10;
    Transportation[] transportations = new Transportation[ARRAY_CAPACITY];

    static Transportation getTransportationById(long id) {
        for (Transportation transportation : transportations) {
            if (transportation != null && Long.valueOf(id).equals(transportation.getId())) {
                return transportation;
            }
        }

        return null;
    }
}
