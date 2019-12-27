package Task4_TransportationCompany.cargo.repo.impl;


import static Task4_TransportationCompany.common.business.repo.CommonRepoHelper.findEntityIndexInArrayStorageById;
import static Task4_TransportationCompany.storage.Storage.*;

import Task4_TransportationCompany.cargo.domain.Cargo;
import Task4_TransportationCompany.cargo.repo.CargoRepo;
import Task4_TransportationCompany.cargo.search.CargoSearchCondition;
import Task4_TransportationCompany.common.solutions.utils.ArrayUtils;
import Task4_TransportationCompany.common.solutions.utils.CollectionUtils;
import Task4_TransportationCompany.storage.IdGenerator;

import java.util.*;


public class CargoArrayRepoImpl extends CommonCargoRepo {
    private static int cargoIndex = 0;
    private static final Cargo[] EMPTY_CARGO_ARRAY = new Cargo[0];

    @Override
    public void add(Cargo cargo) {
        if (cargoIndex == cargos.length) {
            Cargo[] newCargos = new Cargo[cargos.length * 2];
            ArrayUtils.copyArray(cargos, newCargos);
            cargos = newCargos;
        }

        cargo.setId(IdGenerator.generateId());
        cargos[cargoIndex] = cargo;
        cargoIndex++;
    }

    @Override
    public Cargo getById(long id) {
        for (Cargo cargo : cargos) {
            if (cargo != null && Long.valueOf(id).equals(cargo.getId())) {
                return cargo;
            }
        }

        return null;
    }

    @Override
    public Cargo[] getByName(String name) {
        Cargo[] searchResultWithNullableElems = getByNameIncludingNullElements(name);
        if (searchResultWithNullableElems == null
                || searchResultWithNullableElems.length == 0) {
            return EMPTY_CARGO_ARRAY;
        } else {
            return excludeNullableElementsFromArray(searchResultWithNullableElems);
        }
    }

    @Override
    public List<Cargo> getAll() {
        return null;
    }

    private Cargo[] getByNameIncludingNullElements(String name) {
        Cargo[] result = new Cargo[cargos.length];

        int curIndex = 0;
        for (Cargo carrier : cargos) {
            if (carrier != null && Objects.equals(carrier.getName(), name)) {
                result[curIndex++] = carrier;
            }
        }

        return result;
    }

    /**
     * [A,B,C, null, null]
     * [A,B,C, null, null, null, D]
     * [A,B,C]
     * <p>
     * new String[3]
     */
    private Cargo[] excludeNullableElementsFromArray(Cargo[] cargos) {
        int sizeOfArrWithNotNullElems = 0;

        for (Cargo cargo : cargos) {
            if (cargo != null) {
                sizeOfArrWithNotNullElems++;
            }
        }

        if (sizeOfArrWithNotNullElems == 0) {
            return EMPTY_CARGO_ARRAY;
        } else {
            Cargo[] result = new Cargo[sizeOfArrWithNotNullElems];
            int index = 0;
            for (Cargo cargo : cargos) {
                if (cargo != null) {
                    result[index++] = cargo;
                }
            }

            return result;
        }
    }

    @Override
    public boolean deleteById(long id) {
        Integer indexToDelete = findEntityIndexInArrayStorageById(cargos, id);

        if (indexToDelete == null) {
            return false;
        } else {
            ArrayUtils.removeElement(cargos, indexToDelete);
            return true;
        }
    }

    @Override
    public void update(Cargo cargo) {

    }

    @Override
    public List<Cargo> search(CargoSearchCondition cargoSearchCondition) {
        List<Cargo> cargos = getAll();

        if (CollectionUtils.isNotEmpty(cargos)) {
            if (cargoSearchCondition.needSorting()) {
                cargos.sort(createCargoComparator(cargoSearchCondition));
            }
        }

        return cargos;
    }

}