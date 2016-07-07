package com.example.mgkan.subclass;

/**
 * Created by mgkan on 2016-07-06.
 */
public class Kangaroo extends Mammal {
  boolean standsWithTail = true;
  public Kangaroo(String name,String call,String picture,String id) {
    super("kangaroo", "Punch Punch Kick Kick", "@drawable/kangaroo.jpeg", "kan0001");
  }
}
