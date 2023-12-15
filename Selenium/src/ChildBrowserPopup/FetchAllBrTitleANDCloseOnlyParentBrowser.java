package ChildBrowserPopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchAllBrTitleANDCloseOnlyParentBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Thread.sleep(2000);
		String p_wh=driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		Thread.sleep(2000);
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			if(wh.equals(p_wh))
			{
				driver.close();
			}

			
		}
		
	}
}
