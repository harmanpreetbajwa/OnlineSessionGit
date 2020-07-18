package FiveClasses;

import org.openqa.selenium.By;

public class Check extends Facebook {

	void assign() throws InterruptedException {
		

		driver.get("http://qaclickacademy.com/practice.php");
		Thread.sleep(2000L);
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());

		driver.findElement(By.id("checkBoxOption1")).click();
		if (driver.findElement(By.id("checkBoxOption1")).isSelected()) {
			System.out.println("the check box is selected");
		} else {
			System.out.println("the check box is not selected");
		}
		System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());
		//driver.quit();
		
		/*
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());

		driver.findElement(By.id("checkBoxOption1")).click();
		if (driver.findElement(By.id("checkBoxOption1")).isSelected()) {
			System.out.println("the check box is selected");
		} else {
			System.out.println("the check box is not selected");
		}
		System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());
		driver.quit();
		 */
	}

}
