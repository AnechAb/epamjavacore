package main.java.ru.epam.javacore.homework.reporting;

import main.java.ru.epam.javacore.homework.common.business.exception.checked.ReportException;

public interface ReportService {
    void exportData() throws ReportException;
}
