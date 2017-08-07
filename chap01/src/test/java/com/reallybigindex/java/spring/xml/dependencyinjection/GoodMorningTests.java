package com.reallybigindex.java.spring.xml.dependencyinjection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring-test-context.xml" })
public class GoodMorningTests {

	@Autowired
	GreetingService greetingService;

	@Test
	public void testcase01_goodMorning_works() {
		String result = greetingService.goodMorning("Pooja");
		Assert.assertNotNull(result);
	}
}
