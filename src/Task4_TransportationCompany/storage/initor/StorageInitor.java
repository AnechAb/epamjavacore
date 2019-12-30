package Task4_TransportationCompany.storage.initor;

import Task4_TransportationCompany.common.business.exception.checked.InitStorageException;

public interface StorageInitor {
    void initStorage() throws InitStorageException;
}
