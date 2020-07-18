package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assi6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		WebElement chk = driver.findElement(By.id("checkBoxOption2"));
		chk.click();
		if(chk.isSelected()) {
			String selection = driver.findElement(By.xpath("//label[@for='benz']")).getText();
			driver.findElement(By.id("dropdown-class-example")).click();
			Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
			s.selectByVisibleText(selection);
			driver.findElement(By.id("name")).sendKeys(selection);
			driver.findElement(By.id("alertbtn")).click();
			String alert = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			System.out.println(alert);
			
			
			
			
		}
		
		

	}

}
