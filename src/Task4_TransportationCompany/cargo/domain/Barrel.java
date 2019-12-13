package Task4_TransportationCompany.cargo.domain;

import java.util.Arrays;

public class Barrel extends Cargo{
    private Long id;
    private boolean explosive;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public boolean isExplosive() {
        return explosive;
    }

    public void setExplosive(boolean explosive) {
        this.explosive = explosive;
    }

    @Override
    public String toString() {
        return "Barrel{" +
                "id=" + id +
                ", explosive=" + explosive +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", cargoType=" + cargoType +
                ", transportations=" + Arrays.toString(transportations) +
                '}';
    }
}
