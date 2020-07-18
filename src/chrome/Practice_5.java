package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice_5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.name("travel_date")).click();
		while(!driver.findElement(By.xpath("//table[@class=' table-condensed']/thead/tr/th[2]")).getText().contains("August 2020")){
			driver.findElement(By.xpath("//table[@class=' table-condensed']/thead/tr/th[3]")).click();
		}
		driver.findElement(By.xpath("")).getSize().getHeight();

 Actions act = new Actions(driver);
 
		WebElement day = driver.findElement(By.className("day"));
		day.findElement(By.xpath("//*[text()='20']")).click();
	}

}
