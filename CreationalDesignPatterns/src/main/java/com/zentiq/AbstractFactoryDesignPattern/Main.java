package com.zentiq.AbstractFactoryDesignPattern;

//Client class
public class Main {

	public static void main(String[] args) {

		// Creating MySQL factory
		DatabaseFactory factory = new MySQLFactory();

		// Getting related MySQL objects from the factory
		Connection connection = factory.createConnection();
		Query query = factory.createQuery();

		// Using the objects
		connection.connect();
		query.execute();

		System.out.println("--------------------");

		// Switching to Oracle family
		factory = new OracleFactory();

		// Getting related Oracle objects
		connection = factory.createConnection();
		query = factory.createQuery();

		// Using the objects
		connection.connect();
		query.execute();
	}
}