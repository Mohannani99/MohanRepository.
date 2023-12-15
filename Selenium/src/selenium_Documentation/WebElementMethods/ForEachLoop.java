package selenium_Documentation.WebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//create 5 text fields and store ur name in the top to bottom order by using for each and also clear name in the reverse order using for loop
public class ForEachLoop {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/mohan/OneDrive/Desktop/a.html");
		List<WebElement> we=driver.findElements(By.xpath("//input"));
		
		for(WebElement a:we)
		{
			a.sendKeys("Mohan");
		}
		
		int count=we.size();
		for(int i =count-1;i>=0;i--)
		{
			WebElement ele=we.get(i);
			ele.clear();
		}
		
}
}
