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
	public void testcase01_goodMorning_works() throws Exception {
		String result = greetingService.goodMorning("Pooja");
		Assert.assertNotNull(result);
	}

	@Test(expected = Exception.class)
	public void testcase02_goodMorning_with_null_name_works() throws Exception {
		greetingService.goodMorning(null);
	}
	
	@Test(expected = Exception.class)
	public void testcase03_goodMorning_with_empty_name_works() throws Exception {
		greetingService.goodMorning("");
	}
	
}
