package Task4_TransportationCompany.cargo.service;

import Task4_TransportationCompany.cargo.domain.Cargo;
import Task4_TransportationCompany.common.business.service.CommonService;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public interface CargoService extends CommonService {
    void add(Cargo cargo);

    Cargo getById(Long id);

    List<Cargo> getAll();

    List<Cargo> getByName(String name);

}