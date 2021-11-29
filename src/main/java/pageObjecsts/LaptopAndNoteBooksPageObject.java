package pageObjecsts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopAndNoteBooksPageObject extends Base {
	
	public LaptopAndNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}
	
//Scenario: Add and Remove a Mac book from Cart	
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNoteBooks;

	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooks;

	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement MacBookClick;

	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addToCart;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]")
	private WebElement successAddToCartMsg;

	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[3]/div[1]/button[1]/span[1]")
	private WebElement OneItemsShows;

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement clickCartButton;

	@FindBy(xpath = "//i[@class='fa fa-times']")
	private WebElement clickRemove;

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement zeroItemsVerify;
	
	public void laptopsAndNotebookClick() {
		laptopsAndNoteBooks.click();
	}
	
	public void showAllLaptopsAndNotebooksClick() {
		showAllLaptopsAndNotebooks.click();
	}
	
	public void MacBookClick() {
		MacBookClick.click();
	}
	
	public void addToCart() {
		addToCart.click();
	}
	
	public boolean succcessMsgDisplay() {
		if(successAddToCartMsg.isDisplayed())
			return true;
		else
			return false;
	}
	
	public boolean OneItemDisplayed() {
		if(OneItemsShows.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickCartButton() {
		clickCartButton.click();
	}
	
	public void clickRemoveButton(){
		clickRemove.click();
	}
	
	public boolean zeroItemsVerify() {
		if(zeroItemsVerify.isDisplayed())
			return true;
		else
			return false;
	}

	
//Product Comparison
	 

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement MacBookCompare;

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement MacBookAirCompare;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement MacbookAirSuccessMsg;

	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement productComparisonLinkClick;

	@FindBy(xpath = "//h1[text()='Product Comparison']")
	private WebElement productComparisonVerify;
	
	public void MacBookCompareClick() {
		MacBookCompare.click();
	}
	
	public void MacBookAirCompareClick() {
		MacBookAirCompare.click();
	}
	
	public boolean MacbookAirSuccessMsg() {
		if(MacbookAirSuccessMsg.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void productComparisonLinkClick() {
		productComparisonLinkClick.click();
	}
	
	public boolean productComparisonVerify() {
		if(productComparisonVerify.isDisplayed())
			return true;
		else
			return false;
	}

	
//Scenario: Adding an item to Wish list

	@FindBy(xpath = "(//i[@class='fa fa-heart'])[6]")
	private WebElement SonyVIOWishList;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement mustLoginMsg;
	
	public void SonyVIOWishListClick() {
		SonyVIOWishList.click();
	}
	
	public boolean mustLoginMsgVerification() {
		if(mustLoginMsg.isDisplayed())
			return true;
		else
			return false;
	}

	
//Scenario: Validate the price of MacBook Pro is 2000

	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement MacBookProClick;

	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement priceVerification;
	
	public void MacBookProItemClick() {
		MacBookProClick.click();
	}
	
	public boolean priceVerifications() {
		if(priceVerification.isDisplayed())
			return true;
		else
			return false;
	}

	
	

}
