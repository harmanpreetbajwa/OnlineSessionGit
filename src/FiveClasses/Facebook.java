package FiveClasses;

import org.openqa.selenium.By;

public class Facebook extends Bell {
	
	void face() throws InterruptedException {

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000L);
		driver.findElement(By.id("email")).sendKeys("harmanpreetbajwa94@yahoo.com");
		Thread.sleep(1000L);
		driver.findElement(By.id("pass")).sendKeys("harsimrat");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		Thread.sleep(2000L);
		//driver.quit();

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.facebook.com/");
		 * driver.findElement(By.id("email")).sendKeys("harmanpreetbajwa94@yahoo.com");
		 * driver.findElement(By.id("pass")).sendKeys("harsimrat");
		 * driver.findElement(By.xpath("//*[@value='Log In']")).click(); driver.quit();
		 */
	}
}
