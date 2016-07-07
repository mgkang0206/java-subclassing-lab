package com.example.mgkan.subclass;

/**
 * Created by mgkan on 2016-07-06.
 */
public class Mammal extends Animal {

  public Mammal(String name, String call, String picture, String id) {
    super(name,call,picture,id);
  }
  @Override
  public String layEgg(){
    return (getAnimalName()+" is giving birth");
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
