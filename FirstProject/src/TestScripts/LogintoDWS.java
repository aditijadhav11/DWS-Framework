package TestScripts;
import org.Generic_Utilities.BaseTest;
import org.Generic_Utilities.Flib;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(org.Generic_Utilities.MyListener.class)
public class LogintoDWS extends BaseTest{
	 @Test
	 public void login() 
	 {
		 driver.findElement(By.partialLinkText("Log in")).click();
		 driver.findElement(By.id("Email")).sendKeys(Flib.readdatafromproperties("email"));
		 driver.findElement(By.id("Password")).sendKeys(Flib.readdatafromproperties("password"));
		 driver.findElement(By.xpath("//input[@value='Log in']")).click();
		 
		 
		 
	 }
	

}
