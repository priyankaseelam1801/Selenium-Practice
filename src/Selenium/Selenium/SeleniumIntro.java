package Selenium.Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SeleniumIntro {

	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Invoking Browser
			// WebDriver Methods and classes 
			//chromedriver.exe -> Chrome browser
		//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\AF835EK\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//WebDriver driver = new FirefoxDriver();
			//WebDriver driver = new EdgeDriver();
driver.get("https://rahulshettyacademy.com/#/index");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.close();
driver.quit();
}

	}

