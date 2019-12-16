package Task4_TransportationCompany.carrier.service;

import Task4_TransportationCompany.carrier.domain.Carrier;

import java.util.Objects;

public interface GettersCarrier {
    int ARRAY_CAPACITY = 10;
    Carrier[] carriers = new Carrier[ARRAY_CAPACITY];

    static Carrier getCarrierById(long id) {
        for (Carrier carrier : carriers) {
            if (carrier != null && Long.valueOf(id).equals(carrier.getId())) {
                return carrier;
            }
        }

        return null;
    }

    static Carrier[] getCarriersByName(String name) {
        Carrier[] result = new Carrier[carriers.length];

        int curIndex = 0;
        for (Carrier carrier : carriers) {
            if (carrier != null && Objects.equals(carrier.getName(), name)) {
                result[curIndex++] = carrier;
            }
        }

        return result;
    }

}
