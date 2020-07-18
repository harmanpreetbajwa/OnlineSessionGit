package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// https://www.cricbuzz.com/live-cricket-scorecard/22741/ind-vs-rsa-2nd-t20i-south-africa-tour-of-india-2019
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22741/ind-vs-rsa-2nd-t20i-south-africa-tour-of-india-2019");
		WebElement table =	driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']")); 
		int sum = 0;
		int extraruns = 0;
		int Total=0;
		for(int i =0; i<7;i++) {
		String score = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		Integer runs = Integer.parseInt(score);
		sum+=runs;
		}
		for(int i =7; i<8;i++) {
			String extras = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(2)")).get(i).getText();
			extraruns = Integer.parseInt(extras);
	
		}
		
		Integer Totalsum = sum+extraruns;
		System.out.println("The sum is " + Totalsum);
		
		String GrandTotal = driver.findElement(By.xpath("//*[text()='Total']/following-sibling::div")).getText();
		System.out.println(GrandTotal);
		 Total = Integer.parseInt(GrandTotal);
		System.out.println("The total on the chart is : "+ Total);
		
	if(Totalsum==Total) {
		System.out.println("The sums are equal");
	}else {
		System.out.println("The sums are not equal");
	}
	driver.quit();
	}
}

