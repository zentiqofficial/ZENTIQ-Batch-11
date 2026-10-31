package com.zentiq.AbstractFactoryDesignPattern;

//Concrete Factory 2: Oracle Factory
//Creates Oracle-related objects.
class OracleFactory implements DatabaseFactory {

	@Override
	public Connection createConnection() {
		return new OracleConnection();
	}

	@Override
	public Query createQuery() {
		return new OracleQuery();
	}
}
