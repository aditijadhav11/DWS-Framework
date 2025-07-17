package org.webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWindowInterfaceMethods {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/java/");
		//to maximize the browser
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.manage().window().fullscreen();
	    Thread.sleep(3000);
	    driver.get("https://www.facebook.com");
		 Thread.sleep(3000);
		 
		 driver.navigate().back();
		 Thread.sleep(3000);
		 
	    driver.manage().window().minimize();
	    
	    
	}

}
