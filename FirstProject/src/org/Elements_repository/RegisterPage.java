package org.Elements_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
	public RegisterPage(WebDriver driver) {
		super(driver);
		
	}
	//==================WebElements====================
	@FindBy(id = "gender-male")
	private WebElement genderMaleRadioButton;
	
	@FindBy(id = "gender-female")
	private WebElement genderFemaleRadioButton;
	
	@FindBy(id = "FirstName")
	private WebElement firstNameTextBox;
	
	@FindBy(id = "LastName")
	private WebElement LastNameTextBox;
	
	@FindBy(id = "Email")
	private WebElement emailtextbox;
	
	@FindBy(id = "Password")
	private WebElement passwordtextbox;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordtextbox;
	
	
	@FindBy(id = "register-button")
	private WebElement registerbuttonx;
	
	
	
	
	
	
	
	//=====================getters=================
	
	
	
	public WebElement getGenderMaleRadioButton() {
		return genderMaleRadioButton;
	}







	public WebElement getGenderFemaleRadioButton() {
		return genderFemaleRadioButton;
	}







	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}







	public WebElement getLastNameTextBox() {
		return LastNameTextBox;
	}







	public WebElement getEmailtextbox() {
		return emailtextbox;
	}







	public WebElement getPasswordtextbox() {
		return passwordtextbox;
	}







	public WebElement getConfirmPasswordtextbox() {
		return confirmPasswordtextbox;
	}







	public WebElement getRegisterbuttonx() {
		return registerbuttonx;
	}






	//==========business logic========
	public void register(String gender,String firstname,String lastname,String email,String password) 
	{
		getRegisterlink().click();
		if(gender.equalsIgnoreCase("male"))
		{
			getGenderMaleRadioButton().click();
		}
		else {
			getGenderFemaleRadioButton().click();
		}
		getFirstNameTextBox().sendKeys(firstname);
		getLastNameTextBox().sendKeys(lastname);;
		getEmailtextbox().sendKeys(email);
		getPasswordtextbox().sendKeys(password);
		getConfirmPasswordtextbox().sendKeys(password);
		getRegisterbuttonx().click();
		
	}
	

}
