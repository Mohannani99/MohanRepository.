package selenium_Documentation.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class getAttributeMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
	String tool_tip=ele.getAttribute("title");
	System.out.println(tool_tip);
	
	
	
	
}
}
