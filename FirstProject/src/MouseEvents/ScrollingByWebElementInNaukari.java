package MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingByWebElementInNaukari {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		WebElement wakad=driver.findElement(By.xpath("//span[text()='Resume writing']"));
		Actions actions=new Actions(driver);
		actions.scrollToElement(wakad).scrollByAmount(0, 200).perform();
			}

}
