package selenium_Documentation.WebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getSrcValuesOfAll_Images {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		List<WebElement> we=driver.findElements(By.xpath("//img"));
		for(WebElement a:we)
		{
			System.out.println(a.getAttribute("src"));;
			
		}
}
}
