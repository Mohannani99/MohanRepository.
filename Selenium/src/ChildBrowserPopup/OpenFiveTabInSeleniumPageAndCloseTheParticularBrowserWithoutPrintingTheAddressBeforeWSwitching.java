package ChildBrowserPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenFiveTabInSeleniumPageAndCloseTheParticularBrowserWithoutPrintingTheAddressBeforeWSwitching {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.selenium.dev/");
	Thread.sleep(2000);
	List<WebElement> AllEle = driver.findElements(By.xpath("//a[@class='nav-link']"));
	//if x path is not same for every ele then use pipeline operator for storing multiple elements in findElements
	Actions act =new Actions(driver);
	Robot r =new Robot();
	for (WebElement ele : AllEle) {
		act.contextClick(ele).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	}
	
	Set<String> awh = driver.getWindowHandles();
	ArrayList<String> l=new ArrayList<String>(awh);
	String wh=l.get(3);
	driver.switchTo().window(wh);
}
}
