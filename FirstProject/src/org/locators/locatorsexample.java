package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsexample {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//locating email text box
		WebElement emailtextbx = driver.findElement(By.id("email"));
		emailtextbx.sendKeys("jadhavaditi943@gmail.com");
		emailtextbx.sendKeys("jadhav");
		driver.findElement(By.id("pass")).sendKeys("aditi@123");
		driver.close();
	}

}
