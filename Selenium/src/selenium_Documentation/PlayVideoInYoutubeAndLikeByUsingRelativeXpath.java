package selenium_Documentation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class PlayVideoInYoutubeAndLikeByUsingRelativeXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Avengers infinity war");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']")).click();
		
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@class='yt-spec-button-shape-next yt-spec-button-shape-next--tonal yt-spec-button-shape-next--mono yt-spec-button-shape-next--size-m yt-spec-button-shape-next--icon-leading yt-spec-button-shape-next--segmented-start']")).click();
		
	}


	
}
