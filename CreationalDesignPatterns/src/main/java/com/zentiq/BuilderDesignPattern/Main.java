package com.zentiq.BuilderDesignPattern;

//Main class to demonstrate Builder Pattern.
public class Main {

 public static void main(String[] args) {

     // Creating Employee object using Builder Pattern.
     Employee emp = new Employee.Builder()
             .setName("Anil")
             .setAge(25)
             .setCity("Delhi")
             .build();

     // Printing Employee details.
     System.out.println(emp);
 }
}