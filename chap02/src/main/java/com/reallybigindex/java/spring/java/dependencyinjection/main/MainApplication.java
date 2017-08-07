package com.reallybigindex.java.spring.java.dependencyinjection.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.reallybigindex.java.spring.java.config.SpringContextConfig;
import com.reallybigindex.java.spring.java.dependencyinjection.GreetingService;

public class MainApplication {

	@Autowired
	GreetingService greetingService;

	public static void main(String[] args) throws Exception {
		System.out.println("Entering into main method.");
		
		try (AnnotationConfigApplicationContext context 
				= new AnnotationConfigApplicationContext(SpringContextConfig.class)){
			
			GreetingService greetingService = (GreetingService) context.getBean("greetingService");
			String result = greetingService.goodMorning("Pooja");
			
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		



		System.out.println("Exiting from main method.");

	}
}