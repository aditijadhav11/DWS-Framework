package org.BatchExecutionClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hero {
	@Test
	public void Herky()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bikewale.com/harleydavidson-bikes/x440/");
		Reporter.log("herky is lounched",true);
		driver.quit();
		
	}
}
