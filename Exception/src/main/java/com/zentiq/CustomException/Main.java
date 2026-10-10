package com.zentiq.CustomException;

//Custom checked exception
class NotEligibleForInterviewException extends Exception {

 public NotEligibleForInterviewException() {
     super();
 }

 public NotEligibleForInterviewException(String message) {
     super(message);
 }
}

//Student business logic
class Student {

 String name;
 int marks;

 Student(String name, int marks) {
     this.name = name;
     this.marks = marks;
 }

 void checkEligibility(int minMarksRequired)
         throws NotEligibleForInterviewException {

     if (marks < minMarksRequired) {
         throw new NotEligibleForInterviewException(
             name + " is NOT eligible for interview. Marks: "
             + marks + ", Required: " + minMarksRequired
         );
     }

     System.out.println(name + " is eligible for interview.");
 }
}

//Main class
public class Main {

 public static void main(String[] args) {

     Student s1 = new Student("Anil", 45);
     Student s2 = new Student("Ravi", 80);

     try {
         s1.checkEligibility(60);
     } catch (NotEligibleForInterviewException e) {
         System.out.println("Catch: " + e.getMessage());
     }

     try {
         s2.checkEligibility(60);
     } catch (NotEligibleForInterviewException e) {
         System.out.println("Catch: " + e.getMessage());
     }
 }
}