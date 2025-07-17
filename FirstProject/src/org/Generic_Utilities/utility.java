package org.Generic_Utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class utility {

	public static void takescreenshotonfailure(WebDriver driver) 
	{
		LocalDateTime ldt = LocalDateTime.now();
		String timeStamp = ldt.toString().replaceAll(":", "-");
		
		
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./errorshot/failure"+timeStamp+".jpg");
		try {
			FileHandler.copy(screenshot, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
