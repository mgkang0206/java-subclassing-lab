package com.example.mgkan.subclass;

/**
 * Created by mgkan on 2016-07-06.
 */
public class KomodoDragon extends Reptile {
  boolean isCanibbal= true;
  public KomodoDragon(String name,String call,String picture,String id) {
    super("komododragon", "Hissssssss", "komododragon", "kom0001");
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
