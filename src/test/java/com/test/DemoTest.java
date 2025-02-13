package com.test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;


public class DemoTest {
	@Test
	public void login(){
		System.out.println("Login");
		Assert.assertTrue(true);
		
		
	}
	@Test(dependsOnMethods="login", enabled=false)
	public void dash() {
		System.out.println("Dashboard");
		Assert.assertTrue(false);
		
	}
	@Test(alwaysRun=true)
public void user() {
		System.out.println("user");
		
	}
	

}
