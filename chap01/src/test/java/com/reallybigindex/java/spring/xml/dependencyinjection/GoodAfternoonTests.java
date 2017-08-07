package com.reallybigindex.java.spring.xml.dependencyinjection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring-test-context.xml" })
public class GoodAfternoonTests {

	@Autowired
	GreetingService greetingService;

	@Test
	public void testcase01_goodAfternoon_works() throws Exception {
		String result = greetingService.goodAfternoon("Pooja");
		Assert.assertNotNull(result);
	}

	@Test(expected = Exception.class)
	public void testcase02_goodAfternoon_with_null_value_works() throws Exception {
		greetingService.goodAfternoon(null);
	}
	
	@Test(expected = Exception.class)
	public void testcase03_goodAfternoon_with_empty_value_works() throws Exception{
		greetingService.goodAfternoon("");
	}

}
