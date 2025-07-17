package org.SelectClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethods {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/reg/");
	WebElement monthdropdown =driver.findElement(By.id("month"));
	Select select = new Select(monthdropdown);
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
	//selecting an option based on index
	select.selectByIndex(0);
	Thread.sleep(2000);
	//selecting an option based on value
	select.selectByValue("3");
	Thread.sleep(2000);
	//selecting an option based on visible text
	select.selectByVisibleText("Nov");
	
	
}
}
