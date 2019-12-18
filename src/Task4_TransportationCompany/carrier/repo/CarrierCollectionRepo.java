package Task4_TransportationCompany.carrier.repo;

import Task4_TransportationCompany.carrier.domain.Carrier;
import Task4_TransportationCompany.common.business.repo.CommonCollectionRepo;

import java.util.List;

public interface CarrierCollectionRepo extends CommonCollectionRepo {
    void add(Carrier carrier);

    Carrier getById(long id);

    List<Carrier> getByName(String name);
}
