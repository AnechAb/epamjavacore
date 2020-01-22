package main.java.ru.epam.javacore.homework.cargo.repo.impl;


import main.java.ru.epam.javacore.homework.cargo.domain.Cargo;
import main.java.ru.epam.javacore.homework.cargo.search.CargoSearchCondition;
import main.java.ru.epam.javacore.homework.common.solutions.utils.CollectionUtils;
import main.java.ru.epam.javacore.homework.storage.IdGenerator;
import main.java.ru.epam.javacore.homework.storage.Storage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class CargoCollectionRepoImpl extends CommonCargoRepo {

  @Override
  public Cargo getByIdFetchingTransportations(long id) {
    return findById(id);
  }

  @Override
  public Cargo[] findByName(String name) {
    List<Cargo> result = new ArrayList<>();

    for (Cargo carrier : Storage.cargoCollection) {
      if (Objects.equals(carrier.getName(), name)) {
        result.add(carrier);
      }
    }

    return result.toArray(new Cargo[0]);
  }

  @Override
  public List<Cargo> search(CargoSearchCondition searchCondition) {
    List<Cargo> cargos = getAll();

    if (CollectionUtils.isNotEmpty(cargos)) {
      if (searchCondition.needSorting()) {
        Comparator<Cargo> cargoComparator = createCargoComparator(searchCondition);
        cargos.sort(searchCondition.isAscOrdering() ? cargoComparator : cargoComparator.reversed());
      }
    }

    return cargos;
  }

  @Override
  public Cargo findById(Long id) {
    for (Cargo carrier : Storage.cargoCollection) {
      if (id != null && id.equals(carrier.getId())) {
        return carrier;
      }
    }

    return null;
  }

  @Override
  public void save(Cargo cargo) {
    cargo.setId(IdGenerator.generateId());
    Storage.cargoCollection.add(cargo);
  }

  @Override
  public boolean update(Cargo entity) {
    return true;
  }

  @Override
  public boolean deleteById(Long id) {
    Iterator<Cargo> iter = Storage.cargoCollection.iterator();

    boolean removed = false;
    while (iter.hasNext()) {
      if (id != null && id.equals(iter.next().getId())) {
        iter.remove();
        removed = true;
        break;
      }
    }

    return removed;
  }

  @Override
  public List<Cargo> getAll() {
    return Storage.cargoCollection;
  }

  @Override
  public int countAll() {
    return Storage.cargoCollection.size();
  }


}
