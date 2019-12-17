package Task4_TransportationCompany.cargo.service;

import Task4_TransportationCompany.cargo.domain.Cargo;
import Task4_TransportationCompany.common.solutions.utils.ArrayUtils;

import static Task4_TransportationCompany.storage.Storage.cargos;

public class CargoServiceImpl implements CargoService {
    @Override
    public void add(Cargo cargo) {
        System.out.println("Begin tpo add cargo");
    }

    @Override
    public Cargo getById(Long id) {
        if (id != null) {

        }
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public void printAllCargos() {
        ArrayUtils.printArray(cargos);
    }
}