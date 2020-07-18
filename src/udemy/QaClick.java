package udemy;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QaClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		if (driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected()) {
			String text = driver.findElement(By.xpath("//label[@for='benz']")).getText();
			System.out.println(text);
			driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
			WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
			Select s = new Select(dropdown);
			s.selectByVisibleText(text);

			driver.findElement(By.xpath("//input[@id='name']")).sendKeys(text);
			driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
			String alert = driver.switchTo().alert().getText();
			System.out.println(alert);
			if(alert.contains(text)){
				System.out.println(text + "is present in the alert");
			}
			
		
		}
	}
}
