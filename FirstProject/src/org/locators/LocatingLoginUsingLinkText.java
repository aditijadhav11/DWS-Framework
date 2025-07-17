package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingLoginUsingLinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demowebshop.tricentis.com/register");
//		driver.findElement(By.linkText("Log in")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Shopping cart")).click(); 
//		driver.findElement(By.linkText("MOTARCYCLE")).click();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.partialLinkText("ISKO® Life Size Human Brain model removable in 4 parts fiber glass material for Teaching Anatomy of Brain for Science Classroom Study")).click();
	}
}
