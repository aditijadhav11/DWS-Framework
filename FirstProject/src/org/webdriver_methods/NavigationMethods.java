package org.webdriver_methods;

import org.openqa.selenium.chrome.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.amazon.com");
		 Thread.sleep(3000);
		 
		 
		 driver.get("https://www.facebook.com");
		 Thread.sleep(3000);
		 
		 driver.navigate().back();
		 Thread.sleep(3000);
		 
		 driver.navigate().forward();
		 Thread.sleep(3000);
		 
		 driver.navigate().refresh();	
		 Thread.sleep(3000);
		 
		 driver.navigate().to("https://www.nykaa.com/");
		 System.out.print("hii");
		 Thread.sleep(3000);
		 
		 driver.navigate().to(new URL("https://www.tanishq.co.in/"));
		 
		 Thread.sleep(3000);
	 //driver.navigate().to(new URL("https://www.tanishq.co.in/"));
	

	}

}
