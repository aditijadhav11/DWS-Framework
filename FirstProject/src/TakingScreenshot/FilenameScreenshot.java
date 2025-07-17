package TakingScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FilenameScreenshot {
	public static void main(String[] args) throws IOException {
		LocalDateTime ldt=LocalDateTime.now();
		String timestamp =ldt.toString().replace(":", "-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cadburygifting.in/occasions/anniversary-gifts.html");
		WebElement product = driver.findElement(By.xpath("//div[contains(text(),'₹950')]/../../.."));
		File screenshot=product.getScreenshotAs(OutputType.FILE);
		File folder = new File("./errorshot./abv"+timestamp+".png");
		FileHandler.copy(screenshot, folder);
		
	}

}
