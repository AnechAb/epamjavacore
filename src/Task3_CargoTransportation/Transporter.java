package Task3_CargoTransportation;

public class Transporter {
    private String name;
    private Transport transport;

    public Transporter(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public Transport getTransport() {
        return transport;
    }

}
