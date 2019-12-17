package Task4_TransportationCompany.transportation.service;

import Task4_TransportationCompany.common.solutions.utils.ArrayUtils;

import static Task4_TransportationCompany.storage.Storage.transportations;

public class TransportationServiceImpl implements TransportationService {

    @Override
    public void printAllTransportations() {
            ArrayUtils.printArray(transportations);
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}
