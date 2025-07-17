package org.GroupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SRK {
	@Test(groups = {"pan India","Bollywood"})
	public void launchwikipedia ()
	{
		Reporter.log("SRK  is lounched",true);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Yash_(actor)");
		driver.quit();
		
	}

}
