package main.java.ru.epam.javacore.homework.storage.initor.multithread;

import main.java.ru.epam.javacore.homework.common.solutions.utils.FileUtils;
import main.java.ru.epam.javacore.homework.common.solutions.utils.xml.sax.XmlSaxUtils;
import main.java.ru.epam.javacore.homework.storage.initor.fileinitor.BaseFileInitor;
import main.java.ru.epam.javacore.homework.storage.initor.fileinitor.xml.sax.SaxHandler;
import main.java.ru.epam.javacore.homework.storage.initor.fileinitor.xml.sax.XmlSaxFileDataInitor;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.xml.parsers.SAXParser;

public class TransportationParser implements Runnable {

    private static final String FILE = "/ru/epam/javacore/initdata/xmldata.xml";

    private volatile boolean hasError = false;

    private List<BaseFileInitor.ParsedTransportation> transportations;

    @Override
    public void run() {
        File file = null;
        try {
            file = getFileWithInitData();
            List<BaseFileInitor.ParsedTransportation> transportations = parseCargosFromFile(file);
            setTransportations(transportations);
        } catch (Exception e) {
            e.printStackTrace();
            hasError = true;
        } finally {
            if (file != null) {
                file.delete();
            }
        }
    }

    private List<BaseFileInitor.ParsedTransportation> parseCargosFromFile(File file) throws Exception {
        SAXParser parser = XmlSaxUtils.getParser();
        SaxHandler saxHandler = new SaxHandler();
        parser.parse(file, saxHandler);
        return saxHandler.getTransportations();
    }

    private File getFileWithInitData() throws IOException {
        return FileUtils
                .createFileFromResource(
                        XmlSaxFileDataInitor.class, "init-data", "lesson", FILE);
    }

    public boolean isHasError() {
        return hasError;
    }

    private synchronized void setTransportations(List<BaseFileInitor.ParsedTransportation> transportations) {
        this.transportations = transportations;
    }

    public synchronized List<BaseFileInitor.ParsedTransportation> getTransportations() {
        return this.transportations;
    }
}