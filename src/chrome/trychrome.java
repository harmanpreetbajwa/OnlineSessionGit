package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class trychrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.findElement(By.xpath("//a[@class='linkButtonSigninHeader']")).click();
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("harmanpreetbajwa");
		driver.findElement(By.xpath("//*[@id='signup' or @name='createAccount']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//input[starts-with(@class,'ltr_overri')]")).sendKeys("something");
		driver.findElement(By.xpath("//*[text()='Create account']")).click();
	}

}
