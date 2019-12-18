package Task4_TransportationCompany.transportation.repo.impl;

import Task4_TransportationCompany.transportation.domain.Transportation;
import Task4_TransportationCompany.storage.CollectionStorage;
import Task4_TransportationCompany.storage.IdGenerator;

import Task4_TransportationCompany.transportation.repo.TransportationCollectionRepo;

import static Task4_TransportationCompany.storage.CollectionStorage.transportations;

public class TransportationCollectionRepoImpl implements TransportationCollectionRepo {
    private static int transportationIndex = 0;

    @Override
    public void add(Transportation transportation) {
        transportation.setId(IdGenerator.generateId());
        transportations.add(transportation);
        transportationIndex++;
    }

    @Override
    public Transportation getById(long id) {
        for (Transportation transportation : CollectionStorage.transportations) {
            if (transportation != null && Long.valueOf(id).equals(transportation.getId())) {
                return transportation;
            }
        }
        return null;
    }


    @Override
    public boolean deleteById(long id) {
        for (Transportation transportation : CollectionStorage.transportations) {
            if (transportation != null && Long.valueOf(id).equals(transportation.getId())) {
                transportations.remove(transportation);
                return true;
            }
        }
        return false;
    }
}
