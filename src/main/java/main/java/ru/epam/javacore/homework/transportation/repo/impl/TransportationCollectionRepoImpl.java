package main.java.ru.epam.javacore.homework.transportation.repo.impl;


import static main.java.ru.epam.javacore.homework.storage.Storage.transportationCollection;

import main.java.ru.epam.javacore.homework.transportation.domain.Transportation;
import main.java.ru.epam.javacore.homework.storage.IdGenerator;
import main.java.ru.epam.javacore.homework.transportation.repo.TransportationRepo;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class TransportationCollectionRepoImpl implements TransportationRepo {

  @Override
  public void save(Transportation transportation) {
    transportation.setId(IdGenerator.generateId());
    transportationCollection.add(transportation);
  }

  @Override
  public Optional<Transportation> findById(Long id) {
    for (Transportation transportation : transportationCollection) {
      if (transportation.getId().equals(id)) {
        return Optional.of(transportation);
      }
    }

    return Optional.empty();
  }

  @Override
  public List<Transportation> getAll() {
    return transportationCollection;
  }

  @Override
  public boolean update(Transportation transportation) {
    return true;
  }

  @Override
  public boolean deleteById(Long id) {
    boolean deleted = false;

    Iterator<Transportation> iter = transportationCollection.iterator();
    while (iter.hasNext()) {
      if (iter.next().getId().equals(id)) {
        iter.remove();
        deleted = true;
        break;
      }
    }
    return deleted;
  }

  @Override
  public int countAll() {
    return transportationCollection.size();
  }
}
