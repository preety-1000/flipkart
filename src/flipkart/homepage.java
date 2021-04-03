package flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class homepage {
	
	@Test
	public void M1() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file://C:/Users/priyanka/Desktop/selenium/Offline%20Website/index.html");
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Dimension ss = new Dimension(400,600);
		driver.manage().window().setSize(ss);
	}

}
