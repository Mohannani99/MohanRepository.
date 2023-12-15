package Handling_pop_Ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_and_Confirmation {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	Thread.sleep(2000);
	driver.findElement(By.name("submit")).click();
	
	Alert a=driver.switchTo().alert();
	Thread.sleep(4000);
	
	System.out.println(a.getText());
	a.dismiss();
	
	//If u want print the message in popup then we have method in Alert Interface -----> getText() which belongs to Alert Interface

}
}
