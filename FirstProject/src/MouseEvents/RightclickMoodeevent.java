package MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickMoodeevent {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/merge_pdf");
		Actions action=new Actions(driver);
		WebElement select=driver.findElement(By.linkText("Select PDF files"));
		//action.contextClick(select).perform();
		action.moveToElement(select).contextClick().perform();
	}

}
