package main.java.ru.epam.javacore.homework.storage.initor;

import main.java.ru.epam.javacore.homework.common.business.exception.checked.InitStorageException;

public interface StorageInitor {
  void initStorage() throws InitStorageException;
}
