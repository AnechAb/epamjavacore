package Task3_CargoTransportation;

public class Volume {
    public static final String SMALL = "Small";
    public static final String MEDIUM = "Medium";
    public static final String BIG = "Big";
    private Size size;
    private int value;

    public Volume(Size size) {
        this.size = size;
    }

    public String getStatus() {
        if (value > 0 && value <= 100) {
            return SMALL;
        } else if (value > 100 && value <= 500) {
            return MEDIUM;
        } else if (value > 500 && value <= 1000) {
            return BIG;
        } else  {
            return null;
        }
    }

    public boolean isVolumeValid() {
        return getStatus()!= null;
    }

    public void calculate() {
        value = size.getWidth() * size.getLength() * size.getHeight();
    }

    public int getValue() {
        return value;
    }
}
