package udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Table_sorting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Harmanpreet Singh\\Desktop\\SELENIUM WorkSPace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(3)")).click();

		WebElement table = driver.findElement(By.xpath("//table[@id='sortableTable']"));
		List<WebElement> firstList = table.findElements(By.cssSelector("tr td:nth-child(3)"));
		sortColumn(firstList, "asc", "integers");

	}

	public static void sortColumn(List<WebElement> firstList, String order, String type) {
		ArrayList<String> originalList = new ArrayList<String>();

		for (int i = 0; i < firstList.size(); i++) {
			originalList.add(firstList.get(i).getText());
		}
		
		System.out.println(originalList);

		ArrayList<String> copiedList = new ArrayList<String>();
		for (int i = 0; i < firstList.size(); i++) {
			copiedList.add(originalList.get(i));
		}

		// to convert arrayList to Array for integers
		if (type.equalsIgnoreCase("integers")) {
			Arrays.sort(copiedList.toArray());
			if (order.equalsIgnoreCase("dec")) {
				Arrays.sort(copiedList.toArray(), Collections.reverseOrder());

			}

		} else {

			Collections.sort(copiedList);
			if (order.equalsIgnoreCase("dec")) {
				Collections.reverse(copiedList);
			}
		}

		System.out.println(copiedList);
		Assert.assertTrue(originalList.equals(copiedList));

	}
}
