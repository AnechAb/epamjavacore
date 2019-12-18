package Task4_TransportationCompany.carrier.repo.impl;

import Task4_TransportationCompany.carrier.domain.Carrier;
import Task4_TransportationCompany.storage.CollectionStorage;
import Task4_TransportationCompany.carrier.repo.CarrierCollectionRepo;
import Task4_TransportationCompany.storage.IdGenerator;

/*import static Task4_TransportationCompany.common.business.repo.CommonRepoHelper.findEntityIndexInCollectionStorageById;*/
import static Task4_TransportationCompany.storage.CollectionStorage.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrierCollectionRepoImpl implements CarrierCollectionRepo {
    private static int carrierIndex = 0;

    @Override
    public void add(Carrier carrier) {
        carrier.setId(IdGenerator.generateId());
        carriers.add(carrier);
        carrierIndex++;
    }

    @Override
    public Carrier getById(long id) {
        for (Carrier carrier : CollectionStorage.carriers) {
            if (carrier != null && Long.valueOf(id).equals(carrier.getId())) {
                return carrier;
            }
        }
        return null;
    }

    @Override
    public List<Carrier> getByName(String name) {
        List<Carrier> result = new ArrayList<>();
        Iterator<Carrier> iter = carriers.iterator();

        while (iter.hasNext()){
            Carrier value = iter.next();

            if (value.getName().equals(name)){
                result.add(value);
            }
        }
        return result;
    }

    @Override
    public boolean deleteById(long id) {
        for (Carrier carrier : CollectionStorage.carriers) {
            if (carrier != null && Long.valueOf(id).equals(carrier.getId())) {
                carriers.remove(carrier);
                return true;
            }
        }
        return false;
    }
}
