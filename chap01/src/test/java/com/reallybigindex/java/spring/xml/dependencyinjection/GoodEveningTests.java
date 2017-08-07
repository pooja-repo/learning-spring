package com.reallybigindex.java.spring.xml.dependencyinjection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-test-context.xml" })
public class GoodEveningTests {
	
	@Autowired
	GreetingService greetingService;

	@Test
	public void testcase01_goodEvening_works() throws Exception{
		String result = greetingService.goodEvening("Pooja");
		Assert.assertNotNull(result);
	}
	
	@Test(expected = Exception.class)
	public void testcase02_goodEvening_with_null_name_works() throws Exception{
		greetingService.goodEvening(null);
	}
	
	@Test(expected = Exception.class)
	public void testcase03_goodEvening_with_empty_name_works() throws Exception{
		greetingService.goodEvening("");
	}
}
