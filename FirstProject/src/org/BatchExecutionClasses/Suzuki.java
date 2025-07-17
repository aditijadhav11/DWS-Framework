package org.BatchExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Suzuki {
	
	@Test
	public void Hayabusa()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bikewale.com/suzuki-bikes/hayabusa/");
		Reporter.log("Hayabusa is lounched",true);
		driver.quit();
		
	}

}
