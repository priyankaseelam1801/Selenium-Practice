package Selenium.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addtocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int j = 0;
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			// format the name to get actual vegetable name - in cart it is cucmber - 1KG
			// rather than just Cucumber
			// Cucumber - 1KG //Cucumber // 1KG
			// convert array to arrayList for easy search
			// check whether the name you extracted is present in the arrayList

			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			Thread.sleep(5000);
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedName))
			// if(name.contains("Cucumber"))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// break;
				if (j == itemsNeeded.length) {
					break;
				}
			}
		}

	}
}
