package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement ELe=driver.findElement(By.xpath("//span[.='right click me']"));
		Actions act =new Actions(driver);
		act.contextClick(ELe).perform();
		Thread.sleep(3000);
		driver.close();
		
	}
}
