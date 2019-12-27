package Task4_TransportationCompany.carrier.repo;

import Task4_TransportationCompany.carrier.domain.Carrier;
import Task4_TransportationCompany.common.business.repo.CommonRepo;

public interface CarrierRepo extends CommonRepo<Carrier, Long> {

    Carrier getByIdFetchingTransportations(long id);

    Carrier[] findByName(String name);

}