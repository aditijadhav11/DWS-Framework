package org.webdriver_methods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class stopswitchatanytab {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String ExpectedUrl="https://allensolly.abfrl.in/";
		//navigate to the website nayka
		
		driver.get("https://www.nykaa.com/");
		//feacthing the webid in of main tab
		
		String parent=driver.getWindowHandle();
		
		//to open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		//navigate into allan solly 
		driver.get("https://allensolly.abfrl.in/");
		
		
		
		//to open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		//navigate into instagram 
		driver.get("https://www.instagram.com/virat.kohli/?hl=en");
		driver.switchTo().window(parent);
		
		//to open new tab
				driver.switchTo().newWindow(WindowType.WINDOW);
				//navigate into instagram 
				driver.get("https://www.instagram.com/virat.kohli/?hl=en");
				//driver.switchTo().window(parent);
				
				Set<String>allWindowId=driver.getWindowHandles();
				System.out.println(allWindowId);
				for(String windowId : allWindowId)
				{
					Thread.sleep(2000);
					driver.switchTo().window(windowId);
					if(driver.getCurrentUrl().equals(ExpectedUrl))
						break;
				}
				
				
				
		
	}

}
