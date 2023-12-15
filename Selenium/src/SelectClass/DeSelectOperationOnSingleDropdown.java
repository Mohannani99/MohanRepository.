package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectOperationOnSingleDropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get("file:///C:/Users/mohan/OneDrive/Desktop/CityDropdown.html");
	WebElement dropDownElement = driver.findElement(By.id("city_dropdown"));
	Select sel =new Select(dropDownElement);
	sel.deselectAll();
	driver.close();
}
}
