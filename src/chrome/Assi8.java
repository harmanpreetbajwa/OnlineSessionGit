package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.id("autocomplete")).sendKeys("united");
		String something = "return document.getElementById('autocomplete').value";
		String text = (String) js.executeScript(something);
		//driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
		System.out.println(text);
		while(!text.equalsIgnoreCase("United States")) {
			Thread.sleep(2000L);
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000L);
			text = (String) js.executeScript(something);
		}
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
		System.out.println(text);
	}
}
