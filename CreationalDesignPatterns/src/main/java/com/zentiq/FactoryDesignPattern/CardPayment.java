package com.zentiq.FactoryDesignPattern;

//This class implements the Payment interface for card payments.
class CardPayment implements Payment {

 @Override
 public void pay() {

     // Executes when payment is made through a card.
     System.out.println("Payment through Card");
 }
}