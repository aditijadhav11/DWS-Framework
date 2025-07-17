package org.Elements_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	@FindBy(linkText = "Register")
	private WebElement registerlink; 
	
	@FindBy(linkText = "Log in")
	private WebElement loginlink;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutlink;
	
	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingcartlink;
	
	@FindBy(linkText = "Wishlist")
	private WebElement wishlistlink;
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement bookslink;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computerslink;
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement ELECTRONICSlink;
	
	@FindBy(partialLinkText = "APPAREL & SHOES")
	private WebElement 	appparelAndShoeslink;
	
	@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
	private WebElement digitalDownloadslink;
	
	@FindBy(partialLinkText = "JEWELRY")
	private WebElement jewelryLink;
	
	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement giftCardsLink;
	
	public WebElement getShoppingcartlink() {
		return shoppingcartlink;
	}

	public WebElement getWishlistlink() {
		return wishlistlink;
	}

	public WebElement getBookslink() {
		return bookslink;
	}

	public WebElement getComputerslink() {
		return computerslink;
	}

	public WebElement getELECTRONICSlink() {
		return ELECTRONICSlink;
	}

	public WebElement getAppparelAndShoeslink() {
		return appparelAndShoeslink;
	}

	public WebElement getDigitalDownloadslink() {
		return digitalDownloadslink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}

	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getLoginlink() 
	{
		return loginlink;
	} 
	
	
	
	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public BasePage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

}
