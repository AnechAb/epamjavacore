package Task4_TransportationCompany.cargo.service;

import Task4_TransportationCompany.cargo.domain.Cargo;

import java.util.Objects;

public interface GettersCargo {
    int ARRAY_CAPACITY = 10;
    Cargo[] cargos = new Cargo[ARRAY_CAPACITY];

    static Cargo getCargoById(long id) {
        for (Cargo cargo : cargos) {
            if (cargo != null && Long.valueOf(id).equals(cargo.getId())) {
                return cargo;
            }
        }

        return null;
    }

    static Cargo[] getCargosByName(String name) {
        Cargo[] result = new Cargo[cargos.length];

        int curIndex = 0;
        for (Cargo cargo : cargos) {
            if (cargo != null && Objects.equals(cargo.getName(), name)) {
                result[curIndex++] = cargo;
            }
        }

        return result;
    }
}
