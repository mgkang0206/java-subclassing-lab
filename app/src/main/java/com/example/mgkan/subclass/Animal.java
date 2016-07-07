package com.example.mgkan.subclass;

/**
 * Created by mgkan on 2016-07-06.
 */
public abstract class Animal {
  String animalName;
  String animalCall;
  String animalPicture;
  String animalId;
  public Animal(String name,String call,String picture,String id){
   this.animalName = name;
   this.animalCall = call;
   this.animalPicture = picture;
   this.animalId = id;
  }
  public String layEgg(){
    return (animalName +" is laying eggs");
  }
  public String getName(String name) {
    this.animalName = name;
    return animalName;
  }
}
