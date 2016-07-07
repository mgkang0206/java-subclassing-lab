package com.example.mgkan.subclass;

/**
 * Created by mgkan on 2016-07-06.
 */
public abstract class Animal {
  private String animalName;
  private String animalCall;
  private String animalPicture;
  private String animalId;
  public Animal(String name,String call,String picture,String id){
   this.animalName = name;
   this.animalCall = call;
   this.animalPicture = picture;
   this.animalId = id;
  }
  public String layEgg(){
    return (animalName +" is laying eggs");
  }

  public String getAnimalName() {
    return animalName;
  }

  public void setAnimalName(String animalName) {
    this.animalName = animalName;
  }

  public String getAnimalId() {
    return animalId;
  }

  public void setAnimalId(String animalId) {
    this.animalId = animalId;
  }

  public String getAnimalPicture() {
    return animalPicture;
  }

  public void setAnimalPicture(String animalPicture) {
    this.animalPicture = animalPicture;
  }

  public String getAnimalCall() {
    return animalCall;
  }

  public void setAnimalCall(String animalCall) {
    this.animalCall = animalCall;
  }
}
