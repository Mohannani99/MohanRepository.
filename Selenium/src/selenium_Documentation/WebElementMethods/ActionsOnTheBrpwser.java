package selenium_Documentation.WebElementMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionsOnTheBrpwser {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
	
	
}
}
