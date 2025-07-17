package org.Elements_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id = "Email")
	private WebElement emailtextbox;
	
	@FindBy(id = "Password")
	private WebElement passwordtextbox;
	
	@FindBy(id = "RememberMe")
	private WebElement Remembermecheckbox;
	
	@FindBy(linkText = "Forgot password")
	private WebElement forgotpasswordlinkj;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginbutton;

	public WebElement getEmailtextbox() {
		return emailtextbox;
	}

	public WebElement getPasswordtextbox() {
		return passwordtextbox;
	}

	public WebElement getRemembermecheckbox() {
		return Remembermecheckbox;
	}

	public WebElement getForgotpasswordlinkj() {
		return forgotpasswordlinkj;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
	
	//=======business logic========
    public void login(String email,String password)
    {
        getLoginlink().click();
    	getEmailtextbox().sendKeys(email);;
    	getPasswordtextbox().clear();
    	getRemembermecheckbox().clear();
    	getForgotpasswordlinkj().sendKeys(password);;
    	getLoginbutton().click();
    }
    
    public void logout() {
    	getLogoutlink().click();
    	
    }
}
