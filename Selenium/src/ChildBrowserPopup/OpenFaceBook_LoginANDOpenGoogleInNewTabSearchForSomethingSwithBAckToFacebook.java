package ChildBrowserPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenFaceBook_LoginANDOpenGoogleInNewTabSearchForSomethingSwithBAckToFacebook {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9491743830");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Mohannani99#@!");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Log in']")).click();
		
		Robot r=new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		
		Set<String> awh = driver.getWindowHandles();
		
		ArrayList<String> l =new ArrayList<String>(awh);
		String wh = l.get(1);
		driver.switchTo().window(wh);
		Thread.sleep(2000);

		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("samantha");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		//String whprevious = l.get(0);
		driver.switchTo().window(l.get(0));
		
		
		

		
 }
}