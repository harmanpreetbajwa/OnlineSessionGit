package FiveClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass extends snapChat {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		
		FirstClass first = new FirstClass();
		
		first.driver.get("https://www.instagram.com/");
		Thread.sleep(2000L);
		WebElement in = first.driver.findElement(By.name("emailOrPhone"));
		if (in.isEnabled()) {
			in.sendKeys("Harmanbajwa");
		} else {
			System.out.println("in is not Enabled");
		}

		// Calling Classes :
		first.snap();
		first.assign();
		first.face();
		first.be();
		first.driver.quit();
		
		
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 *
				"C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000L);
		WebElement in = driver.findElement(By.name("emailOrPhone"));
		if (in.isEnabled()) {
			in.sendKeys("Harmanbajwa");
		} else {
			System.out.println("in is not Enabled");
		}

		// Calling Classes :
		first.snap();
		first.assign();
		first.face();
		first.be();
		
		*/

	}
}