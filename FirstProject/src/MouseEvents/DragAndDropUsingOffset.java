package MouseEvents;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.interactions.Actions;

public class DragAndDropUsingOffset {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 16").(Keys.ENTER);
		driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-2.html#google_vignette");
		WebElement cat=driver.findElement(By.id("box1"));
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(cat, 871-435, 206).perform();
	}

}
