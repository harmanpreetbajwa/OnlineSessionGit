package chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.xpath("//*[text()='Click to load get data via Ajax!']")).click();
		WebDriverWait d = new WebDriverWait(driver, 20);
		d.until(ExpectedConditions.invisibilityOfElementLocated(By.id("modal")));
		System.out.println(driver.findElement(By.id("results")).getText());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

}
