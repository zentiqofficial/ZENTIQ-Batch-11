package com.zentiq.FactoryDesignPattern;

//Interface defines a common method that all payment classes must implement.
interface Payment {

	// Every payment class must provide its own implementation of pay().
	void pay();
}
