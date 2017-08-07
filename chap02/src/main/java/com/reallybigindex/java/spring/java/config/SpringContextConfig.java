package com.reallybigindex.java.spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.reallybigindex.java.spring.java.dependencyinjection.GreetingService;
import com.reallybigindex.java.spring.java.dependencyinjection.GreetingServiceImpl;

@Configuration
public class SpringContextConfig {

	@Bean(name = "greetingService")
	public GreetingService getGreetingService() {
		return new GreetingServiceImpl();
	}
}
