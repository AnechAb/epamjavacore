package Task3_CargoTransportation;

public class TransportationStarter {

    public static void main(String[] args) {
        Transportation transportation = new Transportation(new Route(Country.RU, Country.GB),
                new Cargo("Iron", new Volume(new Size(10, 10, 6)), 150),
                new Transporter("DHL", new Transport("Train", new Volume(new Size(10, 10, 7)), 160))
        );
        System.out.println(transportation.canHappen());
    }
}
