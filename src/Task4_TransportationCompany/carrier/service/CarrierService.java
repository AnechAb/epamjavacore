package Task4_TransportationCompany.carrier.service;

import Task4_TransportationCompany.carrier.domain.Carrier;
import Task4_TransportationCompany.common.business.service.CommonService;

import java.util.List;

public interface CarrierService<Carrier extends Task4_TransportationCompany.carrier.domain.Carrier> extends CommonService<Carrier> {

    Carrier getByIdFetchingTransportations(Long id);

    List<Carrier> findByName(String name);

}