package com.reallybigindex.java.spring.xml.dependencyinjection;

public interface GreetingService {
	
	public String goodMorning(String name) throws Exception;
	
	public String goodAfternoon(String name);
	
	public String goodEvening(String name);
	
	public String goodNight(String name);
}
