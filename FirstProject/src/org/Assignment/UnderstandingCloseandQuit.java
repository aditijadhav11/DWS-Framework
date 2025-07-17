package org.Assignment;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingCloseandQuit {
	
public static void main(String[] args) throws InterruptedException {
	//a. open browser
	WebDriver driver=new ChromeDriver();
	
	//b.navigate into gogle by using url()
	//c.maximize the browser
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	
	//fetch the title and print it
	 String title = driver.getTitle();
     System.out.println("Title of the page: " + title);
     
     //e.fetch the current url and print it
     String Url=driver.getCurrentUrl();
     System.out.println("current url of the page: " + Url);
     
   //f.fetch the source code of the webpage.
     String source=driver.getPageSource();
     System.out.println("source code  of the page: " + source);
     
   //g.enter "Akash kiran gudase in search bar"
     
     driver.switchTo().activeElement().sendKeys("Akash kiran gudase");
     
     
     
     
	
	
	
	
	

	
}	

}


//assignment

//1.
//a. open browser
//b.navigate into gogle by using url()
//c.maximize the browser
//fetch the title and print it
//e.fetch the current url and print it
//f.fetch the source code of the webpage.
//g.enter "Akash kiran gudase in search bar"