package com.example.mgkan.subclass;

/**
 * Created by mgkan on 2016-07-06.
 */
public class Human extends Mammal{
  boolean wearHats = true;
  public Human(String name,String call,String picture,String id) {
    super("human", "That's not a knife", "@drawable/human.jpg", "hum0001");
  }
}
