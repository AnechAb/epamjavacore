package Task4_TransportationCompany.carrier.service;

import Task4_TransportationCompany.common.solutions.utils.ArrayUtils;

import static Task4_TransportationCompany.storage.Storage.carriers;

public class CarrierServiceImpl implements CarrierService{

    @Override
    public boolean deleteById(Long id) {
        return false;
    }


    @Override
    public void printAllCarriers() {

        ArrayUtils.printArray(carriers);

    }

}
