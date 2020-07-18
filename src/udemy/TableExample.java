package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		WebElement table = driver.findElement(By.xpath("//table[@id='product']"));
		System.out.println(table.findElements(By.xpath("//table[@id='product']/tbody/tr")).size());
		System.out.println(table.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size());
		System.out.println(table.findElement(By.xpath("//table[@id='product']/tbody/tr[3]")).getText());
	}

}
