package org.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAddToCartUsingDependentAndIndependentVariable {
	
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("best mobile under 5000");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.xpath("//span[contains(text(),'itel it53') and contains( text(),'Light Blue')]/../../../..//span[@class=\"a-price-whole\"]"));
}
}
