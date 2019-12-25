package Task4_TransportationCompany.common.business.repo;

import Task4_TransportationCompany.carrier.domain.Carrier;
import Task4_TransportationCompany.common.business.domain.BaseEntity;

import java.util.List;

public interface CommonRepo<T extends BaseEntity> {

    void add(T t);

    T getById(long id);

    boolean deleteById(long id);

    List<T> getAll();

    void update(T t);

}