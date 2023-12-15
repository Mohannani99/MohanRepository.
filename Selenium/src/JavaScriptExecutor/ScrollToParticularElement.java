package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollToParticularElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//a[.='Brazil']"));
		Point loc = ele.getLocation(); 
		int x=loc.getX();
		int y=loc.getY();
		
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		ele.click();
		
}
}