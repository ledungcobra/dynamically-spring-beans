package com.ledungcobra.app;


import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
@Data
public class MyConfigBean {

	private final DefaultListableBeanFactory defaultListableBeanFactory;

	public MyConfigBean(DefaultListableBeanFactory defaultListableBeanFactory) {
		this.defaultListableBeanFactory = defaultListableBeanFactory;
	}

	@PostConstruct
	public void init() {
		for ( var bean : defaultListableBeanFactory.getBean( BeanProperties.class ).getBeans() ) {
			try {
				BeanDefinitionBuilder b = BeanDefinitionBuilder.rootBeanDefinition( Class.forName( bean.getBeanClass() ) )
						.addPropertyValue( bean.getProperty(), bean.getPropValue() );

				defaultListableBeanFactory.registerBeanDefinition(
						bean.getBeanName(),
						b.getBeanDefinition()
				);
			}
			catch (ClassNotFoundException e) {
				throw new RuntimeException( e );
			}
		}
	}
}