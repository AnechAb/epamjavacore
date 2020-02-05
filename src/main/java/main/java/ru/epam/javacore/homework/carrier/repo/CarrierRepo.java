package main.java.ru.epam.javacore.homework.carrier.repo;

import main.java.ru.epam.javacore.homework.carrier.domain.Carrier;
import main.java.ru.epam.javacore.homework.common.business.repo.CommonRepo;

import java.util.Optional;

public interface CarrierRepo extends CommonRepo<Carrier, Long> {

  Optional<Carrier> getByIdFetchingTransportations(long id);

  Carrier[] findByName(String name);

}
