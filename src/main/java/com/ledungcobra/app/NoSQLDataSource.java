package com.ledungcobra.app;

import lombok.Setter;

@Setter
public class NoSQLDataSource implements MyDataSource{

	private String prop;

	@Override
	public void ping() {
		System.out.println("NoSQLDataSource is pinging " + "with prop1 = " + prop );
	}
}
