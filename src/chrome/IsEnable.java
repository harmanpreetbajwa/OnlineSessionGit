package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement esta = driver.findElement(By.name("firstname"));
		if(esta.isEnabled()) {
			esta.sendKeys("Harman");
		}
		else {
			System.out.println("Esta is not Enabled");
		}
		
		WebElement we = driver.findElement(By.name("lastname"));
		if(we.isEnabled()) {
			we.sendKeys("Harman");
		}
		else {
			System.out.println("We is not Enabled");
		}
		
		
		
		
	}

}
