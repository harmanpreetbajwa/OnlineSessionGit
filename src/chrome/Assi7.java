package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assi7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver_win32_83.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		WebElement table = driver.findElement(By.id("product"));
		int rows = table.findElements(By.tagName("tr")).size();
		System.out.println(rows);
			int column = driver.findElements(By.xpath("//tr/th")).size();
			System.out.println(column);
			String secrow = table.findElement(By.xpath("//tbody/tr[3]")).getText();
			System.out.println(secrow);	
			
			
		 Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.id("checkBoxOption2"))).build().perform();
		a.contextClick().build().perform();
		Thread.sleep(2000);
		
	}
}
