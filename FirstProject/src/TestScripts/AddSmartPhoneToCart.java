package TestScripts;

import org.Generic_Utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddSmartPhoneToCart extends BaseTest {
	@Test
	public void verify_smart_phone_is_added_to_cart()
	{
		
		String ExpectedTitleOfElectronicsPage = "Demo Web Shop. Electronics";
	
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		String ActualTitleOfElectronicsPage =driver.getTitle();
		Assert.assertEquals(ActualTitleOfElectronicsPage,ExpectedTitleOfElectronicsPage,"title is not matching");
		Reporter.log("electronics page display");
		
		driver.findElement(By.partialLinkText("Cell phones")).click();
	
		Assert.assertTrue(driver.getTitle().contains("cell phons"),"doesnt contain cell phone");
		Reporter.log("does not conatine cell phone");
		driver.findElement(By.xpath("//a[text()='Smartphone']/../..//input[@value='Add to cart']")).click();
		
		WebElement notifications =driver.findElement(By.className("content"));
		String expectedmsgtoaddcart ="The product has been added to your ";
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(notifications.getText(),expectedmsgtoaddcart,"not match");
		System.out.println("not stop");
		sa.assertAll();
		
		
		
		
	}

}
