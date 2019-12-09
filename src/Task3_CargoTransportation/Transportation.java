package Task3_CargoTransportation;

public class Transportation {
    private Route route;
    private Cargo cargo;
    private Transporter transporter;


    public Transportation(Route route, Cargo cargo, Transporter transporter) {
        this.route = route;
        this.cargo = cargo;
        this.transporter = transporter;
    }

    public Route getRoute() {
        return route;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Transporter getTransporter() {
        return transporter;
    }

    public boolean canHappen() {
        return Transport.ableToCarry();
    }
}
