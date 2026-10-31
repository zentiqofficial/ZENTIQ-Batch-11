package com.zentiq.FactoryDesignPattern;

//This class implements the Payment interface for UPI payments.
class UpiPayment implements Payment {

 @Override
 public void pay() {

     // Executes when payment is made through UPI.
     System.out.println("Payment through UPI");
 }
}
