package org.Generic_Utilities;



import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListener extends BaseTest implements ITestListener 
{
	 
		@Override
		public void onStart(ITestContext context) {
			Reporter.log("[TestCase..+"+context.getName()+"started]");
		}
	
		@Override
		public void onFinish(ITestContext context) {
			Reporter.log("[TestCase..+"+context.getName()+"finished]");
			
		}
        @Override
		public void onTestFailure(ITestResult result) {

        	Reporter.log("test fail hogya",true);
        	utility.takescreenshotonfailure(driver);
			 

			
		}

		@Override
		public void onTestStart(ITestResult result) {
			// TODO Auto-generated method stub
			Reporter.log("[TestCase..+"+result.getName()+"started]");
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			Reporter.log("[TestCase..+"+result.getName()+"sucess]");
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			Reporter.log("[TestCase..+"+result.getName()+"skipped]");
		}

		
        
}
