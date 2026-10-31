package com.zentiq.AbstractFactoryDesignPattern;

//Abstract Factory
//Defines methods to create a family of related objects.
interface DatabaseFactory {

	Connection createConnection();

	Query createQuery();
}
