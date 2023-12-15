package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WAS_toFetch_Count_Options_inThe_Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		//int count	=opt.size();
		WebElement dropDownElement = driver.findElement(By.id("month"));
		Select sel =new Select(dropDownElement);
		List<WebElement> opt = sel.getOptions();
		
	//System.out.println(count);
	System.out.println(opt.size());
	
	}
}
