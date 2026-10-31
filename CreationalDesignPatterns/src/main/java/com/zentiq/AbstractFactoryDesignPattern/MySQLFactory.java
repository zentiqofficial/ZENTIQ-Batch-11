package com.zentiq.AbstractFactoryDesignPattern;

//Concrete Factory 1: MySQL Factory
//Creates MySQL-related objects.
class MySQLFactory implements DatabaseFactory {

	@Override
	public Connection createConnection() {
		return new MySQLConnection();
	}

	@Override
	public Query createQuery() {
		return new MySQLQuery();
	}
}