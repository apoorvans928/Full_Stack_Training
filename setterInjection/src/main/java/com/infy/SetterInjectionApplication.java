package com.infy;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.infy.service.CustomerServiceImpl;
import com.infy.util.SpringConfiguration;

@SpringBootApplication
public class SetterInjectionApplication {

	public static void main(String[] args) {
		CustomerServiceImpl service = null;
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		service = (CustomerServiceImpl) context.getBean("customerService");
		System.out.println(service.fetchCustomer());
		context.close();
	}

}
