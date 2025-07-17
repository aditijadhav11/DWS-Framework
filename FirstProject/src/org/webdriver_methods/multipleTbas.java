package org.webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleTbas {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
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
				driver.switchTo().window(parent);
				
		
		
		
		
	}

}
