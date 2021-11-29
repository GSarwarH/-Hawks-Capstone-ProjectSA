package pageObjecsts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DestopPageObject extends Base {
	
	public DestopPageObject(){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopMain;
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	@FindBy(xpath = "//h2[text()='Desktops']")
	private WebElement desktopPage;
	
	public void clickOnDesktop() {
		desktopMain.click();
	}
	
	public void clickOnShowAllDesktop() {
		
		showAllDesktops.click();
		
	}
	
	public boolean desktopMainPage() {
		if(desktopPage.isDisplayed())
			return true;
		else
			return false;
	}
	
//Scenario: User add HP LP3065  from Desktops tab to the cart	
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement addToCartHp;
	
	@FindBy(xpath = "//input[@name='quantity']")
	private WebElement hpQuantity;
	
	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addHPToCart;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]")
	private WebElement hPsuccessMessage;
	
	public void clickOnHp() {
		addToCartHp.click();
	}
	
	public void enterHPQuantity(String hpQunatity) {
		hpQuantity.sendKeys(hpQunatity);
	}
	
	public void clickOnAddToCartHp() {
		addHPToCart.click();
		
	}
	public boolean disPlayHPSuccessMessage() {
		if(hPsuccessMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
//User should see a message 'Success: You have added Canon EOS 5D to your shopping cart!'
	
	@FindBy(xpath = "//img[@alt= 'Canon EOS 5D']")
	private WebElement addToCartCanon;
	
	@FindBy(xpath = "//select[@class='form-control']")
	private WebElement selectDropDownList;
	
	@FindBy(xpath = "//option[@value='15']")
	private WebElement selectDropDownRed;
	
	@FindBy(id = "input-quantity")
	private WebElement selectCanonQuantity;
	
	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement canonAddToCart;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement canonAddSuccessMessage;
	
	public void clickOnCanoon() {
		addToCartCanon.click();
		
	}
	
	public void clickOnDrowDownList() {
		selectDropDownList.click();
	
	}
	
	public void clickOnRed() {
		selectDropDownRed.click();
	}
	
	public void clickOnQuantity(String qty) {
		selectCanonQuantity.sendKeys(qty);
	
	}
	
	public void clickOnCanoonAddToCart() {
		canonAddToCart.click();
		
	}
	
	public boolean dispalyCanoonSuccessMessage() {
		if(canonAddSuccessMessage.isDisplayed())
			return true;
		else
			return false;
			
			
				
	}
	
//User add a review to Canon EOS 5D item in Desktops tab
	
	@FindBy(xpath = "//img[@alt='Canon EOS 5D']")
	private WebElement clickCanonEOS5D;
	
	@FindBy(xpath = "//a[contains(text(),'Write a review')]")
	private WebElement clickOnWriteAreview;
	
	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement enterName;
	
	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement enterReviewDetails;
	
	@FindBy(xpath = "//input[@name='rating' and @value='5']")
	private WebElement selectGoodRating;
	
	@FindBy(xpath = "//input[@name='rating' and @value='1']")
	private WebElement selectBadRating;
	
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageCanon;
	
	public void clickOnCanoonToReview() {
		clickCanonEOS5D.click();
	}
	public void clickOnWriteReivew() {
		clickOnWriteAreview.click();
	}
	
	
	public void enterName(String name) {
		enterName.sendKeys(name);
	}
	
	public void reviewDetails(String review) {
		enterReviewDetails.sendKeys(review);
	}
	
	public void reviewRating(String ratings) {
		
		if(ratings.equalsIgnoreCase("good") && !selectGoodRating.isSelected())
			selectGoodRating.click();
		else if(ratings.equalsIgnoreCase("bad") && !selectBadRating.isSelected())
			selectBadRating.click();
	}
	
	public void entrOnContinueButon() {
		continueButton.click();
	}
	
	public boolean displayReviewSuccesMessage() {
		if(successMessageCanon.isDisplayed())
			return true;
		else
			return false;
	}

}
