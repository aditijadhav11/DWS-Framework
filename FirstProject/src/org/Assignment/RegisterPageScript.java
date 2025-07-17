package org.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPageScript {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		
		driver.findElement(By.id("gender-female")).click();	
		driver.findElement(By.id("FirstName")).sendKeys("Aditi");
		driver.findElement(By.id("LastName")).sendKeys("Jadhav");
		driver.findElement(By.id("Email")).sendKeys("Jadhavaditi343@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("aditi@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("aditi@123");
		driver.findElement(By.id("register-button")).click();
		
	
		
		
		
	}

}
