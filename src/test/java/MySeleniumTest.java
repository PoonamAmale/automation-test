import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MySeleniumTest {
	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup(); // No need to set system property

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	}
	
		
	
}
