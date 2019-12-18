package Task4_TransportationCompany.transportation.repo;

import Task4_TransportationCompany.common.business.repo.CommonCollectionRepo;
import Task4_TransportationCompany.transportation.domain.Transportation;

public interface TransportationCollectionRepo extends CommonCollectionRepo {
    void add(Transportation transportation);

    Transportation getById(long id);
}
