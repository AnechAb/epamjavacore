package Task4_TransportationCompany.transportation.service;

import Task4_TransportationCompany.common.solutions.utils.ArrayUtils;
import Task4_TransportationCompany.transportation.domain.Transportation;
import Task4_TransportationCompany.transportation.repo.TransportationRepo;

import java.util.List;

import static Task4_TransportationCompany.storage.Storage.transportations;

public class TransportationServiceImpl implements TransportationService {

    private TransportationRepo transportationRepo;

    public TransportationServiceImpl(
            TransportationRepo transportationRepo) {
        this.transportationRepo = transportationRepo;
    }

    @Override
    public boolean deleteById(Long id) {
        return transportationRepo.deleteById(id);
    }

    @Override
    public void printAll() {
        List<Transportation> allTransportations = transportationRepo.getAll();
        for (Transportation transportation : allTransportations) {
            System.out.println(transportation);
        }
    }

    @Override
    public void add(Transportation transportation) {
        transportationRepo.add(transportation);
    }

    @Override
    public Transportation getById(Long id) {
        return transportationRepo.getById(id);
    }

    @Override
    public List<Transportation> getAll() {
        return transportationRepo.getAll();
    }

    @Override
    public void update(Transportation transportation) {

    }
}
