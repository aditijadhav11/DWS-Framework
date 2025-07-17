package org.webdriver_methods;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//fetching and changing the position of browser 
public class Fecthinandchangingthepositionofbrower {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fnp.com/flowers-lp");
		
	    Point actualposition = driver.manage().window().getPosition();
		System.out.println(actualposition.getX());
		System.out.println(actualposition.getY());
		
		Point targetposition = new Point(100,200);
		driver.manage().window().setPosition(targetposition);
	}
}
//window 1swiggy 2 zomato 3 sharif bhai biryani stop it at zomato