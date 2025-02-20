package com.test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoTest2 {
	@Test(groups="regression")
	public void login() {
		System.out.println("Login");
//		Actions act=new Actions(driver);
//		act.moveToElement(webElement);
//		act.contextClick();
	}
	
	@Test(groups="retest")
	public void dash() {
		System.out.println("Dashboard");
	}
	@Test(groups="regression")
	public void user() {
		System.out.println("users"); 
		
	}
	@Test(groups="sanity")
	public void test3() {
		System.out.println("Test04");
	}
	

}
