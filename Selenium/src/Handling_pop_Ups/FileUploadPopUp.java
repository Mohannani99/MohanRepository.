package Handling_pop_Ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FileUploadPopUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/mohan/OneDrive/Desktop/FileUploadPop1.html");
	Thread.sleep(1000);
	WebElement ele = driver.findElement(By.xpath("//input[@name='upload file']"));
	ele.sendKeys("C:\\Users\\mohan\\OneDrive\\Desktop\\Groovy Script.txt\\");
}
}
