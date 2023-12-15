package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	WebElement src=driver.findElement(By.id("box3"));
	WebElement dest=driver.findElement(By.id("box103"));
	Actions act =new Actions(driver);
	act.dragAndDrop(src, dest).perform();
	Thread.sleep(3000);
	driver.close();
	
	
	
}//In order to perform drag and drop we need to locate drag place and drop place
}
