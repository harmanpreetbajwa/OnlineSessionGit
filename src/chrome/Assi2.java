package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assi2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.id("DepartDate")).sendKeys(Keys.ENTER);
		WebElement ad= driver.findElement(By.id("Adults"));
		Select s = new Select(ad);
		s.selectByValue("3");
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("Class")).click();
		Select cl = new Select(driver.findElement(By.id("Class")));
		cl.selectByValue("First");
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");
		driver.findElement(By.id("SearchBtn")).click();
		String error = driver.findElement(By.id("homeErrorMessage")).getText();
		System.out.println(error);
	}//ui-state-default ui-state-highlight ui-state-active 

}
