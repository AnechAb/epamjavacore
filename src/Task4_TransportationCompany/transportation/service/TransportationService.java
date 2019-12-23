package Task4_TransportationCompany.transportation.service;

import Task4_TransportationCompany.common.business.service.CommonService;
import Task4_TransportationCompany.common.solutions.utils.ArrayUtils;
import Task4_TransportationCompany.transportation.domain.Transportation;

import java.util.List;

public interface TransportationService extends CommonService {

    void add(Transportation transportation);

    Transportation getById(Long id);

    List<Transportation> getAll();

    void update(Transportation transportation);
}
