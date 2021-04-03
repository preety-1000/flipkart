package flipkart;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginpage {
	
	
	@Test
	public  void main() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(56, TimeUnit.SECONDS);
		driver.get("file://C:/Users/priyanka/Desktop/selenium/Offline%20Website/index.html");
		driver.close();
	}

}
