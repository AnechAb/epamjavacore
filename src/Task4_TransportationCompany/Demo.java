package Task4_TransportationCompany;

import Task4_TransportationCompany.cargo.domain.Barrel;
import Task4_TransportationCompany.cargo.domain.Cargo;
import Task4_TransportationCompany.carrier.domain.Carrier;
import Task4_TransportationCompany.common.domain.Storage;

public class Demo {
    public static void main(String[] args) {
        Barrel barrel = new Barrel();
        barrel.setName("C1");
        Storage.addEntity(barrel);
        Cargo cargo = new Cargo();
        cargo.setName("A1");
        Storage.addEntity(cargo);
        cargo = new Cargo();
        cargo.setName("A2");
        Storage.addEntity(cargo);
        cargo = new Cargo();
        cargo.setName("A3");
        Storage.addEntity(cargo);
        cargo = new Cargo();
        cargo.setName("A4");
        Storage.addEntity(cargo);
        cargo = new Cargo();
        cargo.setName("A5");
        Storage.addEntity(cargo);
        Carrier carrier = new Carrier();
        carrier.setName("B1");
        Storage.addEntity(carrier);

        Storage.printAllEntities();
/*        Storage.getCargoById(5L);*/


    }
}
