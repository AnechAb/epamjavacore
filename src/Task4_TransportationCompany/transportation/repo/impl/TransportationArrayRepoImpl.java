package Task4_TransportationCompany.transportation.repo.impl;

import Task4_TransportationCompany.common.solutions.utils.ArrayUtils;
import Task4_TransportationCompany.storage.IdGenerator;
import Task4_TransportationCompany.storage.Storage;
import Task4_TransportationCompany.transportation.domain.Transportation;
import Task4_TransportationCompany.transportation.repo.TransportationRepo;

import java.util.List;

public class TransportationArrayRepoImpl implements TransportationRepo {
    private static int transportationIndex = 0;
    @Override
    public void add(Transportation transportation) {
        if (transportationIndex == Storage.transportations.length) {
            Transportation[] newTransportations =
                    new Transportation[Storage.transportations.length * 2];
            ArrayUtils.copyArray(Storage.transportations, newTransportations);
            Storage.transportations = newTransportations;
        }

        transportation.setId(IdGenerator.generateId());
        Storage.transportations[transportationIndex] = transportation;
        transportationIndex++;
    }

    @Override
    public Transportation getById(long id) {
        for (Transportation transportation : transportationArray) {
            if (transportation != null && Long.valueOf(id).equals(transportation.getId())) {
                return transportation;
            }
        }

        return null;
    }

    @Override
    public List<Transportation> getAll() {
        return null;
    }

    @Override
    public boolean deleteById(long id) {
        return false;
    }

    @Override
    public void update(Transportation transportation) {

    }
}
