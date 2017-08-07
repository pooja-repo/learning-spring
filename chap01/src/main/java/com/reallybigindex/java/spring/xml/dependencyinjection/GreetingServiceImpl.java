package com.reallybigindex.java.spring.xml.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService {

	@Override
	public String goodMorning(String name) {
		return "Good morning " + name;
	}

	@Override
	public String goodAfternoon(String name) {
		return "Good afternoon " + name;
	}

	@Override
	public String goodEvening(String name) {
		return "Good evening " + name;
	}

	@Override
	public String goodNight(String name) {
		return "Good night " + name;
	}
}