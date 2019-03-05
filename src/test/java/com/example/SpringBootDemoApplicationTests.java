package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class SpringBootDemoApplicationTests {

	@Test
	public void contextLoads() {
		SpringBootDemoApplication.main( new String[]{} );
	}

	@Test
	public void controllerTest() {
		HelloController helloController=new HelloController();
		Assert.assertEquals( helloController.index(),"Greetings from Spring Boot on Azure!!!");
	}

}
