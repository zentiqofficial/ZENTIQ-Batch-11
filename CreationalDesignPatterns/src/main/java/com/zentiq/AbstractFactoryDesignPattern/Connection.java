package com.zentiq.AbstractFactoryDesignPattern;

//Abstract Factory Pattern is a Creational Design Pattern.
//It creates families of related objects without exposing
//their creation logic to the client.

//Product 1: Connection interface
interface Connection {
	void connect();
}