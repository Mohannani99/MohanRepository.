package selenium_Documentation.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllWebElementMethodsPractice {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///C:/Users/mohan/OneDrive/Desktop/SampleWebPageForUsingAll_WebElementMethods.html");
	WebElement ele=driver.findElement(By.xpath("//a[text()='Create a Page']"));
	String s=ele.getText();
	System.out.println(s);
}
}
