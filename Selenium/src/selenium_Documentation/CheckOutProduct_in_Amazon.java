package selenium_Documentation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckOutProduct_in_Amazon {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("samsung 23 ultra balck colour");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/51noqYKjciL._AC_UY218_.jpg']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']']")).click();
	}
}
