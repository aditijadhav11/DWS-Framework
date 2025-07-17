package TestScripts;

import org.Generic_Utilities.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.Generic_Utilities.MyListener.class)
public class AddProduct extends BaseTest {
	
	@Test
	public void addproducttocart() {
		driver.findElement(By.partialLinkText("APPAREL & SHOES")).click();
		driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();
	}

	
}
