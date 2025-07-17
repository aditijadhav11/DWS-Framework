package TestScripts;

import java.time.Duration;

import org.Generic_Utilities.Flib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationInDWS {
	public static void main(String[] args) {
		String sheetName ="Sheet1";
		String gender =Flib.readdatafromexcel(sheetName, 1, 0);
		String firstname =Flib.readdatafromexcel(sheetName, 1, 1);
		String lastname =Flib.readdatafromexcel(sheetName, 1, 2);
		String email =Flib.readdatafromexcel(sheetName, 1, 3);
		String password =Flib.readdatafromexcel(sheetName, 1, 4);
		
		
		//script
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(Flib.readdatafromproperties("url"));
		
		driver.findElement(By.linkText("Register")).click();
		WebElement malebutton= driver.findElement(By.id("gender-male"));
		WebElement femalebutton=driver.findElement(By.id("gender-female"));
		if(gender.equals("male")) {
			malebutton.click();
			
		}
		else {
			femalebutton.click();
		}
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
		driver.findElement(By.id("register-button")).click();
		
		
	}

}
