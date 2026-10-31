package com.zentiq.AbstractFactoryDesignPattern;

//MySQL Family

//Concrete Product 1: MySQL Connection
class MySQLConnection implements Connection {

	@Override
	public void connect() {
		System.out.println("Connected to MySQL");
	}
}

//Concrete Product 2: MySQL Query
class MySQLQuery implements Query {

	@Override
	public void execute() {
		System.out.println("Executing MySQL Query");
	}
}
