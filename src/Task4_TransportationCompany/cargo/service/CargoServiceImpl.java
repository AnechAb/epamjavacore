package Task4_TransportationCompany.cargo.service;

import Task4_TransportationCompany.cargo.domain.Cargo;

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
}