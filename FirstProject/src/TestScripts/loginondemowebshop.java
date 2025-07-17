package TestScripts;

import java.time.Duration;

import org.Generic_Utilities.Flib;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginondemowebshop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(Flib.readdatafromproperties("Url"));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(Flib.readdatafromproperties("email"));
		driver.findElement(By.id("Password")).sendKeys(Flib.readdatafromproperties("password"),Keys.ENTER);
		
	}

}
