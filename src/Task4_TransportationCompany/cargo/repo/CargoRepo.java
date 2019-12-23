package Task4_TransportationCompany.cargo.repo;

import Task4_TransportationCompany.cargo.domain.Cargo;
import Task4_TransportationCompany.cargo.search.CargoSearchCondition;
import Task4_TransportationCompany.common.business.repo.CommonRepo;

import java.util.List;

public interface CargoRepo extends CommonRepo {

    void add(Cargo cargo);

    Cargo getById(long id);

    Cargo[] getByName(String name);

    List<Cargo> getAll();

    List<Cargo> search(CargoSearchCondition cargoSearchCondition);

    void update(Cargo cargo);
}