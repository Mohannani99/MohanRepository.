package ChildBrowserPopup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseOnlyTheParentBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://skpatro.github.io/demo/links/");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		//Thread.sleep(2000);
		String p_wh=driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		
		allwh.remove(p_wh);
		
		Thread.sleep(2000); 
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			
			Thread.sleep(2000);
			driver.close();		
		}
		
	}
}
