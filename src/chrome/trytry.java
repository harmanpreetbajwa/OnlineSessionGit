package chrome;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class trytry {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/windows");
			driver.findElement(By.linkText("Click Here")).click();
			
			
			Set<String> ls = driver.getWindowHandles();
			Iterator<String> it = ls.iterator();
			String landPage = it.next();
			String nextpage= it.next();
			
			driver.switchTo().window(nextpage);
			String text = driver.findElement(By.xpath("//div[@class='example']")).getText();
			System.out.println(text);
			
			
			driver.switchTo().window(landPage);
			String txt = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
			System.out.println(txt);
		}
	}


