package udemy;

import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("Ben");
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			String script = "return document.getElementById(\"fromPlaceName\").value";
			String text = (String) js.executeScript(script);
		int i =0;
		while(!(text.equalsIgnoreCase("BENGALURU INTERNA AIRPORT"))) {
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
			text = (String) js.executeScript(script);
			Thread.sleep(1000L);
			i++;
			if(i>10) {
				System.out.println("text not present");
				break;
			}
		}	
			
		
	
				
			
	}

}
