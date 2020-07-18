package FiveClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bell {

	WebDriver driver = new ChromeDriver();

	void be() {

		driver.get("https://www.bell.ca/");
		driver.findElement(By.id("rsx-login-register-button")).click();
		//driver.quit();

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver(); driver.get("https://www.bell.ca/");
		 * driver.findElement(By.id("rsx-login-register-button")).click();
		 * driver.quit();
		 */
	}
}
