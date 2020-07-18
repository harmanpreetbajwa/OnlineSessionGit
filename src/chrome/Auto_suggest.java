package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggest {

	public static void main(String[] args) {
		//
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.id("fromPlaceName")).sendKeys("Ben");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String something = "return document.getElementById('fromPlaceName').value";
		String text = (String) js.executeScript(something);
		System.out.println(text);
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);	
			text = (String) js.executeScript(something);
			//System.out.println(text);
		}
	}
}
