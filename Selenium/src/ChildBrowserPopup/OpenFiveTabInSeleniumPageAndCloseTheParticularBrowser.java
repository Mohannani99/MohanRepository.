package ChildBrowserPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenFiveTabInSeleniumPageAndCloseTheParticularBrowser {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.selenium.dev/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	List<WebElement> AllELe = driver.findElements(By.xpath("//a[@class='nav-link']"));
	
	Actions act =new Actions(driver);
	Robot r = new Robot();
	
	for (WebElement ele : AllELe) {
		act.contextClick(ele).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
					
	}
	
	String title="Support | Selenium";
	
	Set<String> Allwh = driver.getWindowHandles();
	
	for (String  wh: Allwh) {										//Support | Selenium-------?close this title browser
		driver.switchTo().window(wh);
		Thread.sleep(2000);
		String currentTitle = driver.getTitle();
		
		if(currentTitle.equals(title))
		{
			driver.close();
		}
		
	}
	
}
}
