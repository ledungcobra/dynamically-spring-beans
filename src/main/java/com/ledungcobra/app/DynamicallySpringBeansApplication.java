package com.ledungcobra.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DynamicallySpringBeansApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run( DynamicallySpringBeansApplication.class, args );
		context.getBeansOfType( NoSQLDataSource.class ).forEach( (k, v) -> {
			System.out.println( k );
			v.ping();
		} );

		context.getBeansOfType( SQLDataSource.class ).forEach( (k, v) -> {
			System.out.println( k );
			v.ping();
		} );
	}
}
