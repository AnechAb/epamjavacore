package Task3_CargoTransportation;

public class Transport {
    private String name;
    private static Volume volume;
    private static int carryingCapacity;
    private static int cargoWeight = Cargo.getWeight();

    public Transport(String name, Volume volume, int carryingCapacity) {
        this.name = name;
        this.volume = volume;
        this.carryingCapacity = carryingCapacity;
    }

    public static boolean ableToCarry() {
        if (volume.isVolumeValid() && Cargo.getVolume().isVolumeValid()) {
            return carryingCapacity >= cargoWeight && volume.equals(Cargo.getVolume());
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public Volume getVolume() {
        return volume;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

}
