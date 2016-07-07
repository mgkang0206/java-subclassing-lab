package com.example.mgkan.subclass;

/**
 * Created by mgkan on 2016-07-06.
 */
public class Fox extends Mammal{
  boolean haveDoneDrugs = true;
  public Fox(String name, String call, String picture, String id) {
    super("fox", "sexy", "fox", "fox0001");
  }
  public String getAnimalName() {
    return super.getAnimalName();
  }

  public String getAnimalId() {
    return super.getAnimalId();
  }

  public String getAnimalPicture() {
    return super.getAnimalPicture();
  }

  public String getAnimalCall() {
    return super.getAnimalCall();
  }
}
