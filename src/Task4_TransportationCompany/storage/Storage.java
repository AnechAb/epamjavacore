package Task4_TransportationCompany.storage;

import Task4_TransportationCompany.cargo.Cargo;
import Task4_TransportationCompany.cargo.CargoType;
import Task4_TransportationCompany.carrier.Carrier;
import Task4_TransportationCompany.carrier.CarrierType;
import Task4_TransportationCompany.transportation.Transportation;

import java.util.Arrays;
import java.util.Date;

public class Storage {
    private static Carrier[] carriers;
    private static Cargo[] cargoes;
    private static Transportation[] transportations;




    public static void addCarrier(){
        for (int i = 0; i < 2; i++) {
            carriers[i] = new Carrier();
        }
    }

    public void addCargo(){

    }

    public void addTransportation(){

    }

    public static void printCarrier(){
        System.out.println(Arrays.toString(carriers));
    }

    public static void printCargo(){
        System.out.println(Arrays.toString(cargoes));
    }

    public static void printTransportation(){
        System.out.println(Arrays.toString(transportations));
    }

    public static void main(String[] args) {
        Carrier[] carriers = new Carrier[3];

/*        Storage.addCarrier();*/
        Carrier carrier1 = new Carrier();
        carrier1.setAddress("1");
        carrier1.setCarrierType(CarrierType.SHIP);
        Storage.addCarrier();

        Carrier carrier2 = new Carrier();
        carrier2.setAddress("2");
        carrier2.setCarrierType(CarrierType.TRAIN);
        carriers[1] = carrier2;

        Carrier carrier3 = new Carrier();
        carrier3.setAddress("3");
        carrier3.setCarrierType(CarrierType.PLANE);
        carriers[2] = carrier3;

        Cargo[] cargoes = new Cargo[3];

        Cargo cargo1 = new Cargo();
        cargo1.setName("Apples");
        cargo1.setCargoType(CargoType.FOOD);
        cargo1.setWeight(500);
        cargoes[0] = cargo1;

        Cargo cargo2 = new Cargo();
        cargo2.setName("Jeans");
        cargo2.setCargoType(CargoType.CLOTHER);
        cargo2.setWeight(400);
        cargoes[1] = cargo2;

        Cargo cargo3 = new Cargo();
        cargo3.setName("Macs");
        cargo3.setCargoType(CargoType.COMPUTERS);
        cargo3.setWeight(300);
        cargoes[2] = cargo3;

        Transportation[] transportations = new Transportation[3];

        Transportation transportation1 = new Transportation();
        transportation1.setBillTo("Ivan Ivanov");
        transportation1.setCargo(cargo1);
        transportation1.setCarrier(carrier1);
        transportation1.setDate(new Date());
        transportations[0] = transportation1;

        Transportation transportation2 = new Transportation();
        transportation2.setBillTo("Oleg Ivanov");
        transportation2.setCargo(cargo2);
        transportation2.setCarrier(carrier2);
        transportation2.setDate(new Date());
        transportations[1] = transportation2;

        Transportation transportation3 = new Transportation();
        transportation3.setBillTo("Mark Ivanov");
        transportation3.setCargo(cargo3);
        transportation3.setCarrier(carrier3);
        transportation3.setDate(new Date());
        transportations[2] = transportation3;

        Storage.printCarrier();
        Storage.printCargo();
        Storage.printTransportation();
    }
}
