package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverUsing_moveToElementMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	
	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.myntra.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	WebElement men_ELe=driver.findElement(By.xpath("//a[.='Men']"));
	Actions act =new Actions(driver);
	act.moveToElement(men_ELe).perform();
	driver.close();
	
}
}
