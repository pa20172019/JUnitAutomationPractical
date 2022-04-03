package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationTest {

	WebDriver driver;

	@Test
	public void launchBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://techfios.com/test/101/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("allbox")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type=checkbox]")).click();
		driver.findElement(By.cssSelector("input[type=submit]:nth-child(1)")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("allbox")).click();
		driver.findElement(By.cssSelector("input[type=submit]:nth-child(1)")).click();
		
		driver.close();

	}

	
 }

		
         
        
 
        