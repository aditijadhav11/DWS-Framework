package org.BatchExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Yamama {
	@Test
	public void Fazer ()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bikewale.com/yamaha-bikes/fazer/");
		Reporter.log("Fazer  is lounched",true);
		driver.quit();
		
	}

}
