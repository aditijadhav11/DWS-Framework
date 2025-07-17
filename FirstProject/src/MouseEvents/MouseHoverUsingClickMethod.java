package MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverUsingClickMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.suzukimotorcycle.co.in/");
		Actions action=new Actions(driver);
		WebElement acc=driver.findElement(By.partialLinkText( "ACCESSORIES"));
		action.click(acc).perform();
		action.moveToElement(acc).click().perform();
	    
	}

}
