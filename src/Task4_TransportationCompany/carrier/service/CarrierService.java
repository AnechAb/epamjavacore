package Task4_TransportationCompany.carrier.service;

import Task4_TransportationCompany.carrier.domain.Carrier;
import Task4_TransportationCompany.common.business.service.CommonService;

import java.util.List;

public interface CarrierService extends CommonService<Carrier, Long> {

    Carrier getByIdFetchingTransportations(Long id);

    List<Carrier> findByName(String name);

}