package com.test;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class WindowHandle {
	@Test
	public void test01() throws InterruptedException {
		 WebDriverManager.chromedriver().setup(); // No need to set system property

	        WebDriver driver = new ChromeDriver();
	        driver.get("file:///D:/SEL-setup/SEL-setup/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	        driver.manage().window().maximize();
	        String mainPage= driver.getWindowHandle();
	        driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	        driver.findElement(By.id("password")).sendKeys("123456");
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
//	        driver.close();
	        
	       List<WebElement>links=driver.findElements(By.partialLinkText("More info "));
	       for(WebElement link:links) {
	    	  Thread.sleep(1000);
	    	   link.click(); 
	       Set<String> allWindows= driver.getWindowHandles();
	       for(String win : allWindows) {
	    	   if(!win.equals(mainPage)) {
	    		   System.out.println(win);
	    		  driver.switchTo().window(win);
	    		  System.out.println(driver.getCurrentUrl());
	    	   }}
	       
		
	       }
	}

}
