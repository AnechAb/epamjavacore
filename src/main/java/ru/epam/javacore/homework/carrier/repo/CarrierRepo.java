package main.java.ru.epam.javacore.homework.carrier.repo;

import main.java.ru.epam.javacore.homework.carrier.domain.Carrier;
import main.java.ru.epam.javacore.homework.common.business.repo.CommonRepo;

public interface CarrierRepo extends CommonRepo<Carrier, Long> {

  Carrier getByIdFetchingTransportations(long id);

  Carrier[] findByName(String name);

}
