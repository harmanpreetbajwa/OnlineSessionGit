package FiveClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());
	
		int size =driver.findElements(By.xpath("//*[@type='checkbox']")).size();
		System.out.println(size);
	}

	
	

}
