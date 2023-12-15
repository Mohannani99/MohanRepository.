package selenium_Documentation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Compare_websiteURL {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		if(url=="https://www.google.com")
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("different");
		}
		
	}
}