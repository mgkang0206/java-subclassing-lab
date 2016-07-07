package com.example.mgkan.subclass;

/**
 * Created by mgkan on 2016-07-06.
 */
public class Reptile extends Animal {
  boolean isColdBlooded = true;
  public Reptile(String name, String call, String picture, String id) {
    super(name,call,picture,id);
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
