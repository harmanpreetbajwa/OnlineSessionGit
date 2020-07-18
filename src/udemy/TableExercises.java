package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExercises {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22858/wi-vs-ind-3rd-odi-india-tour-of-west-indies-2019");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int columnCount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		int sum =0;
		for(int i=0;i<columnCount-2;i++) {
			String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int intValue = Integer.parseInt(value);
			sum+=intValue;
		}
		String extra = table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int intExtra = Integer.parseInt(extra);
		String total = table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int intTotal = Integer.parseInt(total);
		System.out.println(intTotal);
		int TotalSum = sum+intExtra;
		System.out.println(TotalSum);
		
		if(intTotal==TotalSum) {
			System.out.println("Test succesful. The total is Working Fine ");
		}
	}

}
