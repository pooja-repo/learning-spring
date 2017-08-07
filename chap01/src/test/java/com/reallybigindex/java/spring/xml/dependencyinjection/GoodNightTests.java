package com.reallybigindex.java.spring.xml.dependencyinjection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring-test-context.xml" })
public class GoodNightTests {

	@Autowired
	GreetingService greetingService;
	
	@Test
	public void testcase01_goodNight_works() throws Exception{
		String result = greetingService.goodNight("Pooja");
		Assert.assertNotNull(result);
	}
	
	@Test(expected = Exception.class)
	public void testcase02_goodNight_with_null_value_works() throws Exception{
		greetingService.goodNight(null);
	}
	
	@Test(expected = Exception.class)
	public void testcase03_goodNight_with_empty_value_works() throws Exception{
		greetingService.goodNight("");
	}
}
