package org.SelectClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionInOmayo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement carsdropdown =driver.findElement(By.id("multiselect1"));
		Select select = new Select(carsdropdown);
		//verifying month dropdown is single select or not
		if(select.isMultiple())
		{
			System.out.println("it is an multiple dropdown");
		}
		else
		{
			System.out.println("it is a sigle fropdown");
		}
		
		Thread.sleep(2000);
		
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByValue("swiftx");
		Thread.sleep(2000);
		select.selectByVisibleText("Hyundai");
		Thread.sleep(2000);
		select.selectByIndex(3);
		
		
		
		select.deselectByIndex(0);
		Thread.sleep(2000);
		select.deselectByValue("swiftx");
		Thread.sleep(2000);
		select.deselectAll();
		
	
		
	
	}

}
