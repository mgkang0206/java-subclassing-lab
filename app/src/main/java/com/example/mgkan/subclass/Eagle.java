package com.example.mgkan.subclass;

/**
 * Created by mgkan on 2016-07-06.
 */
public class Eagle extends Bird {
  boolean fly= true;
  public Eagle(String name,String call,String picture,String id) {
    super("Bald Eagle", "America", "baldeagle", "eag0001");
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
