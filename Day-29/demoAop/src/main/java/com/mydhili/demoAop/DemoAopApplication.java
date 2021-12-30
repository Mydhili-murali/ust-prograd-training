package com.mydhili.demoAop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class DemoAopApplication {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(DemoAopApplication.class, args);
		Circle circle=context.getBean(Circle.class);
		Rectangle rectangle=context.getBean(Rectangle.class);
		circle.setRadius(2);
		rectangle.setLengthAndBreadth(2,3);
		circle.displayGetRadius();
		circle.showArea();
		circle.perimeterShow();
		rectangle.displayGetLengthAndBreadth();
		rectangle.showArea();
		rectangle.perimeterShow();

		circle.process();
		rectangle.process();

		circle.processResult();
		rectangle.processResult();
		try{
			circle.testThrowException();
		} catch(Exception ex){

		}


	}

}
