package Task4_TransportationCompany.cargo.service;

import Task4_TransportationCompany.cargo.domain.Cargo;
import Task4_TransportationCompany.cargo.search.CargoSearchCondition;
import Task4_TransportationCompany.common.business.service.CommonService;

import java.util.List;

public interface CargoService<Cargo extends Task4_TransportationCompany.cargo.domain.Cargo> extends CommonService<Cargo> {

    List<Cargo> getAll();

    List<Cargo> findByName(String name);

    List<Cargo> search(CargoSearchCondition cargoSearchCondition);
}