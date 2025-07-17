package MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByWebElement {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/pune");
		WebElement wakad=driver.findElement(By.xpath("//h5[text()='Wakad']"));
		Actions actions=new Actions(driver);
		actions.scrollToElement(wakad).perform();
	}

}
