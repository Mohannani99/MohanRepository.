package SelectClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAssignmentOnDemoApps {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9652190227");
	WebElement phnDropEle=driver.findElement(By.xpath("//select[@id='select2']"));
	
	Select sel = new Select(phnDropEle);
	sel.selectByVisibleText("Male");
	Thread.sleep(3000);
	
	
WebElement	countryDRP=driver.findElement(By.xpath("//select[@id='select3']"));

Select sel2=new Select(countryDRP);
sel2.selectByIndex(1);

Thread.sleep(3000);
WebElement	stateDRP=driver.findElement(By.xpath("//select[@id='optionCity']"));

Select sel3=new Select(stateDRP);
sel3.selectByIndex(1);
Thread.sleep(3000);

WebElement	cityDRP=driver.findElement(By.xpath("//option[@id='optionCity']"));
Select sel4=new Select(cityDRP);
sel4.selectByIndex(1);
 }
}
