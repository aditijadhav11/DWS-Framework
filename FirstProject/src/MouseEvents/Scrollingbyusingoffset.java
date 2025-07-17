package MouseEvents;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrollingbyusingoffset {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zeptonow.com/");
		Actions actions=new Actions(driver);
		Thread.sleep(2000);
		actions.scrollByAmount(0, 900).perform();
		Thread.sleep(2000);
		actions.scrollByAmount(0, -900).perform();
		
		
		
		
		
	}

}
