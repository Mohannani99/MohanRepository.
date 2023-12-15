package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickOnTheDownloadAndAllTheLinksBesideAndOpenInNewWindow {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.selenium.dev");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		List<WebElement> Elements = driver.findElements(By.xpath("//a[@class='nav-link']"));
		
		System.out.println(Elements.size());
		
		Actions act =new Actions(driver);
		Robot r =new Robot();
		for(WebElement a1:Elements)
		{
			act.contextClick(a1).perform();
			r.keyPress(KeyEvent.VK_T);
		}
		
		
		
		
	}
}