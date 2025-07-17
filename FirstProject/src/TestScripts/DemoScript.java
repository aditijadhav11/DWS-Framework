package TestScripts;

import org.Elements_repository.BasePage;
import org.Generic_Utilities.BaseTest;
import org.testng.annotations.Test;

public class DemoScript extends BaseTest {
	@Test
	public void demoScript() throws InterruptedException {
		BasePage bp = new BasePage(driver);
		bp.getLoginlink().click();
		Thread.sleep(3000);
	}
	

}
