package Task4_TransportationCompany.carrier.repo;

import Task4_TransportationCompany.common.business.repo.CommonRepo;

import java.util.List;

public interface CarrierRepo<Carrier extends Task4_TransportationCompany.carrier.domain.Carrier> extends CommonRepo<Carrier> {

    Carrier getByIdFetchingTransportations(long id);

    Carrier[] findByName(String name);

}