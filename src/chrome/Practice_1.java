package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption1")).click();
		WebElement check = driver.findElement(By.id("checkBoxOption1"));
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		if(check.isSelected()) {
			System.out.println("The first checkbox is selected");
		}else {
			System.out.println("The first checkbox is not selected");
		}
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		if(check.isSelected()) {
			System.out.println("The first checkbox is selected");
		}else {
			System.out.println("The first checkbox is not selected");
		}
		
		System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());
		
		
	}

}
