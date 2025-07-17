package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginUsinXpath {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@data-testid='royal-email']")).sendKeys("aditi");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("adi123");
		driver.findElement(By.xpath("//button[@data-testid='royal-login-button']")).click();
	}

}
