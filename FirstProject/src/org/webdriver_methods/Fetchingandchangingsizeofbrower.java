package org.webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchingandchangingsizeofbrower {
	
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fnp.com/flowers-lp");
		
		
		//dimension method for the knowing hight and width of a browser
		
		Dimension actualsize =driver.manage().window().getSize();
		System.out.println(actualsize);
    	System.out.println("height"+ actualsize.getHeight());
		System.out.println("width"+actualsize.getWidth());
		
		//setsize by ourside for browser
		Dimension targetsize= new Dimension(6000, 250);
		driver.manage().window().setSize(targetsize);

	} 

}
