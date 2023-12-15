package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeAScreenshotUsingRobotClass {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	
	WebDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Robot r =new Robot();
	r.keyPress(KeyEvent.VK_WINDOWS);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_PRINTSCREEN);
	Thread.sleep(3000);
	
	r.keyRelease(KeyEvent.VK_WINDOWS);
	
	r.keyRelease(KeyEvent.VK_PRINTSCREEN);
}
}
	
	