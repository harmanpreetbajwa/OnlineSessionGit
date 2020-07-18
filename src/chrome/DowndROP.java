package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DowndROP {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dropdown");
		driver.findElement(By.id("dropdown")).sendKeys(Keys.ARROW_DOWN);
	}

}
