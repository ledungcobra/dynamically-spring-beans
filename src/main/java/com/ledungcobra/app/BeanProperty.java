package com.ledungcobra.app;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BeanProperty {
	private String beanClass;
	private String beanName;
	private String property;
	private String propValue;
}
