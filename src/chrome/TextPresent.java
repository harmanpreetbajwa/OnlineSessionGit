package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TextPresent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/");
		Thread.sleep(2000L);
		if(driver.getPageSource().contains("Featured Courses")){
			System.out.println("Text is present");
			}else{
			System.out.println("Text is absent");
			}
		WebElement tex = driver.findElement(By.xpath("//div[@class='text-center']/h2")); 
		System.out.println(driver.findElement(By.xpath("//div[@class='text-center']/h2")).isDisplayed());
		Assert.assertFalse(tex.isDisplayed());
	}

}
