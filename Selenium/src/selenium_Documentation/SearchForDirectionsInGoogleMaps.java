package selenium_Documentation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchForDirectionsInGoogleMaps {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/maps");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @aria-label='Choose destination...']")).sendKeys("Tirupati, Andhra Pradesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Choose starting point, or click on the map...']")).sendKeys("Raipur, Chhattisgarh");
		Thread.sleep(1500);	
		driver.findElement(By.xpath("//img[@aria-label='Driving']")).click();
	}
}
