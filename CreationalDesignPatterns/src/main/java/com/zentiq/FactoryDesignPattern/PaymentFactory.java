package com.zentiq.FactoryDesignPattern;

//The Factory class is responsible for creating payment objects.
//The client does not need to create UpiPayment or CardPayment directly.
class PaymentFactory {

 // Static factory method that returns a Payment object.
 // The type parameter decides which payment object will be created.
 public static Payment getPayment(String type) {

     // If the type is UPI, create and return a UpiPayment object.
     // equalsIgnoreCase() ignores uppercase and lowercase differences.
     if (type.equalsIgnoreCase("UPI")) {

         return new UpiPayment();

     }

     // If the type is CARD, create and return a CardPayment object.
     else if (type.equalsIgnoreCase("CARD")) {

         return new CardPayment();

     }

     // If the payment type is invalid, throw an exception.
     throw new IllegalArgumentException("Invalid Payment Type");
 }
}