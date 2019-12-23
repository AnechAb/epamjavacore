package Task4_TransportationCompany.carrier.repo;

import Task4_TransportationCompany.carrier.domain.Carrier;
import Task4_TransportationCompany.common.business.repo.CommonRepo;

import java.util.List;

public interface CarrierRepo extends CommonRepo {

    void add(Carrier carrier);

    Carrier getById(long id);

    Carrier[] getByName(String name);

    List<Carrier> getAll();

    void update(Carrier carrier);

}