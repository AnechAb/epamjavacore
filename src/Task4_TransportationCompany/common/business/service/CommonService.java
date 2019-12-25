package Task4_TransportationCompany.common.business.service;

import Task4_TransportationCompany.cargo.domain.Cargo;
import Task4_TransportationCompany.common.business.domain.BaseEntity;

import java.util.List;

public interface CommonService<T extends BaseEntity> {
    boolean deleteById(Long id);
    void printAll();

    void add(T t);

    T getById(Long id);

    List<T> getAll();

    void update(T t);
}
