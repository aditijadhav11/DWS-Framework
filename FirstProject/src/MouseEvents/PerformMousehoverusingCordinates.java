package MouseEvents;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformMousehoverusingCordinates {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		actions.moveToLocation(362, 177).perform();
		
		
	}

}
