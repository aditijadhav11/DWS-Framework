package org.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmlocatingUsingXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		//or
		//visibletext
		
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		//or
		driver.findElement(By.xpath("//div[.=' Login ']")).click();
	}
}


//this script is not working without thread ,reson is web pages loads first then the webelements are load thats why we need to wait for 3 seond 