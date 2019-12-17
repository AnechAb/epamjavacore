package Task4_TransportationCompany.cargo.service;

import Task4_TransportationCompany.cargo.domain.Cargo;
import Task4_TransportationCompany.common.business.service.CommonService;

public interface CargoService extends CommonService {
    void add(Cargo cargo);

    Cargo getById(Long id);

    void printAllCargos();
}