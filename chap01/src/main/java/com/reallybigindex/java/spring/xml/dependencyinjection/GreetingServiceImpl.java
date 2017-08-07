package com.reallybigindex.java.spring.xml.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService {

	@Override
	public String goodMorning(String name) throws Exception {

		if ((name == null) || (name.trim().length() == 0)) {
			throw new Exception("Invalid name exception");
		}
		return "Good morning " + name;
	}

	@Override
	public String goodAfternoon(String name) throws Exception {

		if ((name == null) || (name.trim().length() == 0)) {
			throw new Exception("Invalid name exception");
		}
		return "Good afternoon " + name;
	}

	@Override
	public String goodEvening(String name) throws Exception {
		if ((name == null) || (name.trim().length() == 0)) {
			throw new Exception("Invalid name exception");
		}
		return "Good evening " + name;
	}

	@Override
	public String goodNight(String name) throws Exception{
		if((name == null) || (name.trim().length() == 0)){
			throw new Exception("Invalid name exception");
		}
		return "Good night " + name;
	}
}