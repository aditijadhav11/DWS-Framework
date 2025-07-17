package TestScripts;



import org.Generic_Utilities.BaseTest;
import org.Generic_Utilities.Flib;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(org.Generic_Utilities.MyListener.class)
public class RegistrationDWS extends BaseTest {
	@Test
	public void Register(){
		String sheetName ="Sheet1";
		String gender =Flib.readdatafromexcel(sheetName, 1, 0);
		String firstname =Flib.readdatafromexcel(sheetName, 1, 1);
		String lastname =Flib.readdatafromexcel(sheetName, 1, 2);
		String email =Flib.readdatafromexcel(sheetName, 1, 3);
		String password =Flib.readdatafromexcel(sheetName, 1, 4);
		
		
		//script
		
		driver.get(Flib.readdatafromproperties("url"));
		
		driver.findElement(By.linkText("Register")).click();
		WebElement malebutton= driver.findElement(By.id("gender-Male"));
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
