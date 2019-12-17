package Task4_TransportationCompany.transportation.repo;

import Task4_TransportationCompany.common.business.repo.CommonRepo;
import Task4_TransportationCompany.transportation.domain.Transportation;

public interface TransportationRepo extends CommonRepo {
    void add(Transportation transportation);

    Transportation getById(long id);
}