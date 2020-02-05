package main.java.ru.epam.javacore.homework.storage;

import java.util.concurrent.atomic.AtomicLong;

public final class IdGenerator {

    private IdGenerator() {
    }

    private static AtomicLong idGenerator = new AtomicLong(0);

    public static Long generateId() {
        return idGenerator.incrementAndGet();
    }
}
