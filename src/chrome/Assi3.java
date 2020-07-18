package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.xpath("//*[text()='Click to load get data via Ajax!']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20); 
		WebElement web = driver.findElement(By.id("modal"));
		wait.until(ExpectedConditions.invisibilityOf(web));
		String txt = driver.findElement(By.id("results")).getText();
		System.out.println(txt);
	}

}
