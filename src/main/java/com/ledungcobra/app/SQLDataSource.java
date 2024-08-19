package com.ledungcobra.app;

import lombok.Setter;

@Setter
public class SQLDataSource implements MyDataSource{

	private String prop;

	@Override
	public void ping() {
		System.out.println("SQLDataSource is pinging " + "with prop1 = " + prop);
	}
}
