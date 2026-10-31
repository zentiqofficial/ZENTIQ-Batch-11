package com.zentiq.FactoryDesignPattern;

//The Main class uses the Factory to get payment objects.
public class Main {

 public static void main(String[] args) {

     // Ask the Factory to create a UPI payment object.
     // The returned object is stored in a Payment reference.
     Payment payment1 = PaymentFactory.getPayment("UPI");

     // Calls the pay() method of UpiPayment.
     payment1.pay();


     // Ask the Factory to create a Card payment object.
     Payment payment2 = PaymentFactory.getPayment("CARD");

     // Calls the pay() method of CardPayment.
     payment2.pay();
 }
}


/*
 * Important points for students - Interface: Defines the common pay() method. -
 * Implementation classes: UpiPayment and CardPayment provide their own
 * implementations of pay(). - Factory class: Decides which object to create
 * based on the input. - getPayment(): Returns the appropriate object using the
 * Payment interface as the return type. - Main class: Uses the returned objects
 * without directly creating the implementation objects. Remember: The Factory
 * Design Pattern separates object creation from object usage.
 */