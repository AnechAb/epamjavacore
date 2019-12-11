package Task4_TransportationCompany.transportation;

import Task4_TransportationCompany.cargo.Cargo;
import Task4_TransportationCompany.carrier.Carrier;

import java.util.Date;

public class Transportation {
    private Long id;
    private Cargo cargo;
    private Carrier carrier;
    private String description;
    private String billTo;

    private Date date;

    public Transportation() {
        id=0L;
        id++;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBillTo() {
        return billTo;
    }

    public void setBillTo(String billTo) {
        this.billTo = billTo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }
}
