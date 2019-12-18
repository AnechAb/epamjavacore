package Task4_TransportationCompany.cargo.repo;

import Task4_TransportationCompany.cargo.domain.Cargo;
import Task4_TransportationCompany.common.business.repo.CommonCollectionRepo;

import java.util.List;

public interface CargoCollectionRepo extends CommonCollectionRepo {
    void add(Cargo cargo);

    Cargo getById(long id);

    List<Cargo> getByName(String name);
}
