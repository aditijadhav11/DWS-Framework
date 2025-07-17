package org.webdriver_methods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    String  ExceptedUrl="https://www.zomato.com/";	
	    
	    //navigate to first page 

	     driver.get("https://www.swiggy.com/restaurants");
	     Thread.sleep(3000);
	     
	     
	     //featching the window id
	     //String parentid=driver.getWindowHandle();
	     driver.switchTo().newWindow(WindowType.WINDOW);
	     
	     //navigate to 2nd page
	     driver.get("https://www.zomato.com/");
	     Thread.sleep(3000);
	     
	     
	     driver.switchTo().newWindow(WindowType.WINDOW);
	     driver.get("https://shariefbhai.com/");
	     Thread.sleep(3000);
	     
	     
	     Set<String>allWindowId=driver.getWindowHandles();
	     
	     for(String windowid : allWindowId)
	     {
	    	
	    	 driver.switchTo().window(windowid);
	    	 if(driver.getCurrentUrl().equals(ExceptedUrl))
	    	 {
	    		 break;
	    	 }
	     }
	     
	     
	     
	     
	     
	     
     
	}

}
