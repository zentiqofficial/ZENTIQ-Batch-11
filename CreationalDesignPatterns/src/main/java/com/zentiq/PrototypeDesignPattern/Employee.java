package com.zentiq.PrototypeDesignPattern;

//Employee class implements Cloneable to allow object cloning.
class Employee implements Cloneable {

 String name;

 // Constructor initializes the employee name.
 Employee(String name) {
     this.name = name;
 }

 // clone() creates a copy of the current Employee object.
 @Override
 protected Object clone() throws CloneNotSupportedException {

     // Calls the parent class clone() method to create a shallow copy.
     return super.clone();
 }
}
