package Selenium.Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		String downloadPath = System.getProperty("user.dir");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver = new ChromeDriver(options);

		// driver.get("https://the-internet.herokuapp.com/basic_auth");
		// driver.get("http://admin:admin@the-internet.herokuapp.com/");
		// driver.findElement(By.linkText("Basic Auth")).click();

		driver.get("https://www.adobe.com/acrobat/online/pdf-to-jpg.html?msockid=145639f4301a639b09532e90318e6289");
		driver.findElement(By.xpath("//span[@class='verb-cta-label']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\AF835EK\\OneDrive - EY\\Documents\\AutoIT\\FileUpload.exe");
		Thread.sleep(15000);
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//button[contains(text(),'Convert to JPG')]")));
		 */
		driver.findElement(By.xpath("//button[contains(text(),'Convert to JPG')]")).click();
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Download')]")));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Download')]")).click();
		Thread.sleep(5000);
		File f = new File(downloadPath + "/visit.zip");

		if (f.exists()) {
			System.out.println("file found");
			// Assert.assertTrue(f.exists());
			if (f.delete()) {
				System.out.println("file deleted");
			}
		}

	}

}
