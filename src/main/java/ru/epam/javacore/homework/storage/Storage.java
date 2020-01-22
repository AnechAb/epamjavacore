package main.java.ru.epam.javacore.homework.storage;


import main.java.ru.epam.javacore.homework.transportation.domain.Transportation;
import main.java.ru.epam.javacore.homework.cargo.domain.Cargo;
import main.java.ru.epam.javacore.homework.carrier.domain.Carrier;

import java.util.ArrayList;
import java.util.List;

public class Storage {

  private static final int ARRAY_CAPACITY = 10;

  public static Cargo[] cargoArray = new Cargo[ARRAY_CAPACITY];
  public static int cargoIndex = 0;
  public static List<Cargo> cargoCollection = new ArrayList<>();

  public static Carrier[] carrierArray = new Carrier[ARRAY_CAPACITY];
  public static int carrierIndex = 0;
  public static List<Carrier> carrierCollection = new ArrayList<>();

  public static Transportation[] transportationArray = new Transportation[ARRAY_CAPACITY];
  public static int transportationIndex = 0;
  public static List<Transportation> transportationCollection = new ArrayList<>();
}
