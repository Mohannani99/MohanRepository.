package practice_selenium_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
public class dummy {
	

	
	    public static void main(String[] args) {
	        System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

	        FirefoxOptions options = new FirefoxOptions();
	        options.setCapability("marionette", true);

	        WebDriver driver = new FirefoxDriver(options);

	        driver.get("https://www.youtube.com");

	        WebElement searchInput = driver.findElement(By.name("search_query"));
	        searchInput.sendKeys("https://www.youtube.com/watch?v=VIDEO_ID");
	        searchInput.submit();

	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        WebElement video = driver.findElement(By.cssSelector(""));
	        video.click();
	    }
	}


