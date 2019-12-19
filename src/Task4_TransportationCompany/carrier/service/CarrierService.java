package Task4_TransportationCompany.carrier.service;

import Task4_TransportationCompany.carrier.domain.Carrier;
import Task4_TransportationCompany.common.business.service.CommonService;
import Task4_TransportationCompany.common.solutions.utils.ArrayUtils;

import java.util.List;

public interface CarrierService extends CommonService {
    void add(Carrier carrier);

    Carrier getById(Long id);

    List<Carrier> getByName(String name);

    List<Carrier> getAll();

}