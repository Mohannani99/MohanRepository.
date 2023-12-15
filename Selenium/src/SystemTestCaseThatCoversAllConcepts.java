import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
// Scenario : Open google search for q spiders courses and click on it scroll to api details and click and open it in new tab and switch control to
//other tab and again scroll to postman tool and take screen of content and print the content of postman tool in console;

public class SystemTestCaseThatCoversAllConcepts {
public static void main(String[] args) throws InterruptedException, AWTException, IOException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	//Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//we can only use implicit wait for FE and FE's
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("qspiders courses");
	Thread.sleep(3000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//h3[.='Courses']")).click();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement ApiDetails = driver.findElement(By.xpath("(//span[.='Details'])[6]"));
	Point eleLOc = ApiDetails.getLocation();
	int x_ele = eleLOc.getX();
	int y_ele=eleLOc.getY();
	
	JavascriptExecutor js =(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy("+x_ele+","+y_ele+")");
	Thread.sleep(3000);
	
	WebElement Details = driver.findElement(By.xpath("(//p[.='API Testing']/../following-sibling::footer[1]/a/span[1])[1]"));
	Actions act =new Actions(driver);
	act.contextClick(Details).perform();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	
	Set<String> allwh = driver.getWindowHandles();
	ArrayList<String> l =new ArrayList<String>(allwh);
	
	driver.switchTo().window(l.get(1));
	 Thread.sleep(3000);
	
	WebElement postmantool_ele = driver.findElement(By.xpath("//p[.='Course Content']/following-sibling::div[3]/div/div/p"));
	Point PosLoc = postmantool_ele.getLocation();
	int x = PosLoc.getX();
	int y = PosLoc.getY();
	
	js.executeScript("window.scrollBy("+x+","+y+")");
	
	postmantool_ele.click();
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst =new File("C:\\Users\\mohan\\OneDrive\\Desktop\\TakesScreenShot\\ss.jpeg");
	FileHandler.copy(src, dst);
	
	WebElement textEle = driver.findElement(By.xpath("//p[.='Course Content']/following-sibling::div[3]/div/following-sibling::div/div/div/p"));
	
	System.out.println(textEle.getText());
	
	}
}
