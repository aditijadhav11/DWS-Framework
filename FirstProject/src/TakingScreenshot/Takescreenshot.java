package TakingScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cadburygifting.in/occasions/anniversary-gifts.html");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		//setp2: call getscreenshotas()...
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./errorshot/scrrenshot.png");
		FileHandler.copy(screenshot, dest);
		
		
		
	}

}
