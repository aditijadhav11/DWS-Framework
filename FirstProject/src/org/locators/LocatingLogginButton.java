package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingLogginButton {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("jadhavaditi@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pass@123");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		
	}

}
