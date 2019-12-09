package Task3_CargoTransportation;

public class Cargo {
    private String name;
    private static Volume volume;
    private static int weight;

    public Cargo(String name, Volume volume, int weight) {
        this.name = name;
        this.volume = volume;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public static Volume getVolume() {
        return volume;
    }

    public static int getWeight() {
        return weight;
    }


}
