package Task3_CargoTransportation;

public class Route {
    private Country country;
    private Country startPoint;
    private Country finalPoint;

    public Route(Country startPoint, Country finalPoint) {
        this.startPoint = startPoint;
        this.finalPoint = finalPoint;
    }

    public Country getStartPoint() {
        return startPoint;
    }

    public Country getFinalPoint() {
        return finalPoint;
    }

    public void setStartPoint(Country startPoint) {
        this.startPoint = startPoint;
    }

    public void setFinalPoint(Country finalPoint) {
        this.finalPoint = finalPoint;
    }

}
