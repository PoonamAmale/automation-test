package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest3 {
	  WebDriver driver=null;
@Parameters("browser")
	@Test
	
	public void browserTest(String browser) {
		if(browser.equals("chrome")) {
			 WebDriverManager.chromedriver().setup(); // No need to set system property

		       driver = new ChromeDriver();
		        driver.get("https://www.google.com");
		        driver.close();
			
		}
		if(browser.equals("firefox")) {
			 WebDriverManager.firefoxdriver().setup(); // No need to set system property

		       driver = new FirefoxDriver();
		        driver.get("https://www.google.com");
			
		}
	}
}
