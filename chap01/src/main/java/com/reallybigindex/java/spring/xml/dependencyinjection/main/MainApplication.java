package com.reallybigindex.java.spring.xml.dependencyinjection.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reallybigindex.java.spring.xml.dependencyinjection.GreetingService;

public class MainApplication {

	public static void main(String[] args) {
		System.out.println("Entering into main method.");
		
		String result = null;
		
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-main-context.xml")){
			
			GreetingService greetingService = (GreetingService) context.getBean("greetingService");
			result = greetingService.goodMorning("Pooja");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(result);
		
		System.out.println("Exiting from main method.");
	}
}