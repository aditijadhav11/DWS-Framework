//tooltith text
package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingByCssSelector {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Electronics")).click();
		driver.findElement(By.linkText("Cell phones")).click();
		driver.findElement(By.cssSelector("img[title='Show details for Smartphone']")).click();
	}

}
//disadvantage of cssselector

//diabled text does not supported//dont have indexing concept for duplicate//cssselector does not support logical operator

//advantage
//unidirextional locator 