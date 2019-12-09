package Task3_CargoTransportation;

public enum Country {
    RU(1, "Russia"),
    GB(2, "Great Britain"),
    USA(3, "USA"),
    FR(4, "France"),
    DE(5, "Germany"),
    CN(6, "China"),
    EG(7, "Egypt"),
    GR(8, "Greece"),
    JP(9, "Japan"),
    PE(10, "Peru");

    private int code;
    private String fullName;

    Country(int code, String fullName) {
        this.code = code;
        this.fullName = fullName;
    }
    public int getCode() {
        return code;
    }

    public String getFullName() {
        return fullName;
    }
}
