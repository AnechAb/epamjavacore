package Task4_TransportationCompany.cargo.repo;

import Task4_TransportationCompany.cargo.domain.Cargo;
import Task4_TransportationCompany.cargo.search.CargoSearchCondition;
import Task4_TransportationCompany.common.business.repo.CommonRepo;

import java.util.List;

public interface CargoRepo extends CommonRepo<Cargo, Long> {

    Cargo[] getByName(String name);

    List<Cargo> search(CargoSearchCondition cargoSearchCondition);

}