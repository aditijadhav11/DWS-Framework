package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoWebShopLoginPage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
	    driver.findElement(By.id("Email")).sendKeys("jadhavaditi@943");
	    driver.findElement(By.id("Password")).sendKeys("jadhav12345");
	    driver.findElement(By.id("RememberMe")).click();
	    
	}
}
