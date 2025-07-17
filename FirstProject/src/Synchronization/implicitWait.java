package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class implicitWait {
	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement usernametextbox=driver.findElement(By.name("username"));
		WebElement emailtextbox=driver.findElement(By.name("password"));
		usernametextbox.sendKeys("Aditi");
		emailtextbox.sendKeys("adii@123");
		
		
	}

}
