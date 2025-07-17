package org.SelectClassMethods;

import java.time.LocalDateTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingTheWebelementScrennshot {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		String timestamp=ldt.toString().replace(":", "-");//we need to replace this because of the file name is overrideing and we give the date as a file name and the file name does not accept the : thats why we replace that
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cadburygifting.in/");
		//locating element
		
	}
}
