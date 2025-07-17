package org.SelectClassMethods;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class capturingscrrenshotwithfilename {
	public static void main(String[] args) throws IOException {
		LocalDateTime ldt = LocalDateTime.now();
		String timestamp=ldt.toString().replace(":", "-");//we need to replace this because of the file name is overrideing and we give the date as a file name and the file name does not accept the : thats why we replace that
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cadburygifting.in/occasions/anniversary-gifts.html");
		//step 1: casting driver ref into takescreenshot type 
		WebElement product = driver.findElement(By.xpath("//div[contains(text(),'₹950')]/../../..")); 
		//takescrrenshot method 
		
		File screenshot = product.getScreenshotAs(OutputType.FILE);
		File eclipsforlder = new File("./errorshot/scrrenshot"+timestamp+".png");
		FileHandler.copy(screenshot, eclipsforlder);
		
		
	}

}
