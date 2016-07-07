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
}
