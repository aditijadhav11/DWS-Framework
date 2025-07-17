package TestScripts;

import java.time.Duration;

import org.Generic_Utilities.Flib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterUsingDataProvider {

	@Test(dataProvider = "register data provider",dataProviderClass = org.Generic_Utilities.DataProviderClass.class)
	public void register(String gender,String firstname,String lastname,String email,String password)
	{
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
