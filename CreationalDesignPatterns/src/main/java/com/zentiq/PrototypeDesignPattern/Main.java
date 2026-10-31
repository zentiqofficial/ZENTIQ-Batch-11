package com.zentiq.PrototypeDesignPattern;

//Main class
public class Main {

 public static void main(String[] args)
         throws CloneNotSupportedException {

     // Create the original Employee object.
     Employee emp1 = new Employee("Anil");

     // Create a copy of emp1 using the clone() method.
     // Type casting converts the returned Object into Employee.
     Employee emp2 = (Employee) emp1.clone();

     // Print the original employee's name.
     System.out.println(emp1.name);

     // Print the copied employee's name.
     System.out.println(emp2.name);

     // Check whether both references point to the same object.
     // false means they are two different objects.
     System.out.println(emp1 == emp2);
 }
}

//Remember: The Prototype Design Pattern creates a new object by copying an existing object instead of creating one from scratch.
