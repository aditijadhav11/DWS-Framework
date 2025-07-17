package org.BatchExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Jawa {
	@Test
	public void Bobber()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bikewale.com/jawa-bikes/42-bobber/");
		Reporter.log("Bobber is lounched",true);
		driver.close();
		
	}
	@Test
	public void perak()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bikewale.com/jawa-bikes/perak/");
		Reporter.log("perak is lounched",true);
		driver.quit();
		
	}

}
