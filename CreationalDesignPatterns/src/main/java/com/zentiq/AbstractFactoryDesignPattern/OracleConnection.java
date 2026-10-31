package com.zentiq.AbstractFactoryDesignPattern;

//Oracle Family

//Concrete Product 1: Oracle Connection
class OracleConnection implements Connection {

	@Override
	public void connect() {
		System.out.println("Connected to Oracle");
	}
}

//Concrete Product 2: Oracle Query
class OracleQuery implements Query {

	@Override
	public void execute() {
		System.out.println("Executing Oracle Query");
	}
}
