package com.zentiq.BuilderDesignPattern;

//Builder Pattern is a Creational Design Pattern.
//It is used to create complex objects step by step.
//It is useful when a class has multiple fields
//and some fields are optional.

class Employee {

 private String name;
 private int age;
 private String city;

 // Private constructor prevents direct object creation.
 // The object can be created only through the Builder.
 private Employee(Builder builder) {
     this.name = builder.name;
     this.age = builder.age;
     this.city = builder.city;
 }

 // Displays Employee details.
 @Override
 public String toString() {
     return "Employee [name=" + name
             + ", age=" + age
             + ", city=" + city + "]";
 }

 // Static inner Builder class.
 // It helps to set Employee fields step by step.
 public static class Builder {

     private String name;
     private int age;
     private String city;

     // Sets employee name and returns Builder object
     // to support method chaining.
     public Builder setName(String name) {
         this.name = name;
         return this;
     }

     // Sets employee age.
     public Builder setAge(int age) {
         this.age = age;
         return this;
     }

     // Sets employee city.
     public Builder setCity(String city) {
         this.city = city;
         return this;
     }

     // Creates and returns the final Employee object.
     public Employee build() {
         return new Employee(this);
     }
 }
}
