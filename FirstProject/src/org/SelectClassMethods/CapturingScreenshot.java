package org.SelectClassMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingScreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		//setp1 convert driver ref into screenshot type
		TakesScreenshot ts=(TakesScreenshot)driver;
		//setp2: call getscreenshotas()...
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		//setp 3 :
		 File dest= new File("C:\\Users\\jadha\\Desktop\\Event\\aditi.png");
		 FileHandler.copy(screenshot, dest);
	}

}
