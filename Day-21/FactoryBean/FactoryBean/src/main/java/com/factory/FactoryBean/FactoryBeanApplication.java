package com.factory.FactoryBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class FactoryBeanApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(FactoryBeanApplication.class, args);
		String[] beanNames= context.getBeanDefinitionNames();
		System.out.println("Name of beans: "+ Arrays.toString(beanNames));
		int count=context.getBeanDefinitionCount();
		System.out.println("Count of beans: "+ count);
	}
}
