package org.webdriver_methods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenNewTab {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.nykaa.com/");
		 Thread.sleep(3000);
		 
		 //to open a new tab
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.get("https://www.facebook.com");
		 Thread.sleep(3000);
		 
		 
		 //to open a new window
		 driver.switchTo().newWindow(WindowType.WINDOW);
		 driver.get("https://www.instagram.com/virat.kohli/?hl=en");
		 
		 
		 //to open multiple tab
		 Set<String>allWindowId=driver.getWindowHandles();
		 System.out.println(allWindowId);
		 
		 for(String windowId : allWindowId)
		 {
			 Thread.sleep(3000);
			 driver.switchTo().window(windowId);
		 }
	}

}
