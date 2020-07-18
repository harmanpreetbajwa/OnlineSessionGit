package chrome;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth")).click();
		/*driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> it = driver.getWindowHandles();
		Iterator<String> ch = it.iterator();
		String crtwnd = ch.next();
		String nwwnd = ch.next();
		
		driver.switchTo().window(nwwnd);
		String txt1 = driver.findElement(By.className("example")).getText();
		driver.switchTo().window(crtwnd);
		String txt2 = driver.findElement(By.className("example")).getText();
		System.out.println(txt1);
		System.out.println(txt2); */
	}

}
