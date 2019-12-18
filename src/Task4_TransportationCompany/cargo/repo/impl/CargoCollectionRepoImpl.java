package Task4_TransportationCompany.cargo.repo.impl;

import Task4_TransportationCompany.cargo.domain.Cargo;
import Task4_TransportationCompany.cargo.repo.CargoCollectionRepo;
import Task4_TransportationCompany.common.business.domain.BaseEntity;
import Task4_TransportationCompany.storage.CollectionStorage;
import Task4_TransportationCompany.storage.IdGenerator;

/*import static Task4_TransportationCompany.common.business.repo.CommonRepoHelper.findEntityIndexInCollectionStorageById;*/
import static Task4_TransportationCompany.storage.CollectionStorage.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class CargoCollectionRepoImpl implements CargoCollectionRepo {
    private static int cargoIndex = 0;

    @Override
    public void add(Cargo cargo) {
        cargo.setId(IdGenerator.generateId());
        cargos.add(cargo);
        cargoIndex++;
    }

    @Override
    public Cargo getById(long id) {
        for (Cargo cargo : CollectionStorage.cargos) {
            if (cargo != null && Long.valueOf(id).equals(cargo.getId())) {
                return cargo;
            }
        }
        return null;
    }

    @Override
    public List<Cargo> getByName(String name) {
        List<Cargo> result = new ArrayList<>();
        Iterator<Cargo> iter = cargos.iterator();

        while (iter.hasNext()){
            Cargo value = iter.next();

            if (value.getName().equals(name)){
                result.add(value);
            }
        }
        return result;
    }

    @Override
    public boolean deleteById(long id) {
        for (Cargo cargo : CollectionStorage.cargos) {
            if (cargo != null && Long.valueOf(id).equals(cargo.getId())) {
                cargos.remove(cargo);
                return true;
            }
        }
        return false;
    }
}
