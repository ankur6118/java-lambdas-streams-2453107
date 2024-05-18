package com.example;

import java.util.Random;
import java.util.function.IntBinaryOperator;

public class Main {

  public static void main(String[] args) {

    Greeting greeting = new HelloWorldGreeting();
    greeting.sayHello();


    //Using Ayonyomous Method
    Greeting greeting2 = new Greeting() {
      @Override
      public void sayHello() {
        System.out.println("Hello World");
      }
    };
    greeting2.sayHello();


    Greeting greeting3 = () -> {
      System.out.println("Hello World");
    };
    greeting3.sayHello();

    IntBinaryOperator greeting4 = (a, b)-> {
      Random rd = new Random();
      int randomNumber = rd.nextInt(50);
      return a+b+randomNumber;
    };

    System.out.println(greeting4.applyAsInt(10,20));




  }


}
