package TestScripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;
public class UnderstandingTestNG {
	@Test(priority = 2,invocationCount = 2 )
	public void test1()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Reporter.log("Testing a method test(1)",true);
		driver.close();
		
	}
 @Test(priority = 3)
	public void test2()
	{
	 WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		Reporter.log("Testing a method test(2)",true);
		driver.close();
	}
 @Test
 public void test3()
	{
	 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.meesho.com/");
		Reporter.log("Testing a method test(1)",true);
		
		driver.close();
	}
 
 @Test(dependsOnMethods = {"test1","test2"})
 public void test4()
	{
	 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.meesho.com/");
		Reporter.log("Testing a method test(1)",true);
		
		driver.close();
	}
 
 @Test(enabled = false)
 public void test()
	{
	 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.meesho.com/");
		Reporter.log("Testing a method test(1)",true);
		
		driver.close();
	}
	

}
