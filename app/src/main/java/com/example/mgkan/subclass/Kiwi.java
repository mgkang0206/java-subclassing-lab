package com.example.mgkan.subclass;

/**
 * Created by mgkan on 2016-07-06.
 */
public class Kiwi extends Bird {
  boolean fly=false;
  public Kiwi(String name,String call,String picture,String id) {
    super("kiwi", "kiwi kiwi", "kiwi", "kiw0001");
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
