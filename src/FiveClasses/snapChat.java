package FiveClasses;

import org.openqa.selenium.By;

class snapChat extends Check {

	void snap() throws InterruptedException {

		driver.get("https://www.snapchat.com/");
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector("div[class='bitmoji']")).click();
		//driver.quit();

		/*
		 * System.setProperty(
		 * "webdriver.chrome.driver","C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.snapchat.com/");
		 * driver.findElement(By.cssSelector("div[class='bitmoji']")).click();
		 * driver.quit();
		 */

	}

}
