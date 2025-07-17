package MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
        driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html#google_vignette");
		WebElement oslo=driver.findElement(By.id("box1"));
		WebElement Italy=driver.findElement(By.id("box106"));
		Actions actions=new Actions(driver);
		actions.clickAndHold(oslo).release(Italy).perform();
		//actions.moveToElement(oslo).clickAndHold().moveToElement(Italy).clickAndHold().release().perform();
		driver.close();
	}

}
