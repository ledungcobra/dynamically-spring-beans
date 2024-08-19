package com.ledungcobra.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class BeanProperties {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<BeanProperty> getBeans() {
		return jdbcTemplate.queryForList( "SELECT * FROM bean" )
				.stream().map( b -> BeanProperty.builder()
						.property( (String) b.get( "property" ) )
						.propValue( (String) b.get( "prop_value" ) )
						.beanClass( (String) b.get( "bean_class" ) )
						.beanName( (String) b.get( "bean_name" ) )
						.build() )
				.toList();
	}
}
