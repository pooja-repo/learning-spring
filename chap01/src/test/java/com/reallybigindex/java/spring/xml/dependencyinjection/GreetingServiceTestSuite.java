package com.reallybigindex.java.spring.xml.dependencyinjection;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	GoodMorningTests.class,
	GoodAfternoonTests.class,
	GoodEveningTests.class,
	GoodNightTests.class
})
public class GreetingServiceTestSuite {

}
