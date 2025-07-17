package MouseEvents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class MouseHoverUsingOffset {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions actions=new Actions(driver);
		actions.moveByOffset(357, 175).perform();
		Thread.sleep(2000);
		actions.moveByOffset(240, 0).perform();
	}

}
