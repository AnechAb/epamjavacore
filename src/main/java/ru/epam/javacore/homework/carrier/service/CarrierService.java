package main.java.ru.epam.javacore.homework.carrier.service;

import main.java.ru.epam.javacore.homework.carrier.domain.Carrier;
import main.java.ru.epam.javacore.homework.common.business.service.CommonService;

import java.util.List;

public interface CarrierService extends CommonService<Carrier, Long> {

  Carrier getByIdFetchingTransportations(Long id);

  List<Carrier> findByName(String name);

}
