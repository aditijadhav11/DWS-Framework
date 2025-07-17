package MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformMousehoverActionsOnWebelement {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions actions = new Actions(driver);
		WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		actions.moveToElement(fashion).perform();
	}

}
