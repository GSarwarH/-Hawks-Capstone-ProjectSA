package pageObjecsts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {
	
	public HomePageObject(){
		PageFactory.initElements(driver, this);
	}
	
//User verify currency values change	
	
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement homeCurrency;
	
	@FindBy(xpath = "//button[@name='EUR']")
	private WebElement currencyEur;

	@FindBy(xpath = "//strong[text()='€']")
	private WebElement eurDisplay;
	
	public void clickOnCurrency() {
		homeCurrency.click();
	}
	
	public void clickOnEuro() {
		currencyEur.click();
	}
	
	public boolean currencyChangeToEuro() {
		if(eurDisplay.isDisplayed())
			return true;
		else
			return false;
	}
	
	
//Scenario: User empty Shopping cart message displays
	
		@FindBy(xpath = "//span[text()='Shopping Cart']")
		private WebElement clickShopingCart;
		
		@FindBy(xpath = "(//p[text()='Your shopping cart is empty!'])[2]")
		private WebElement shopingMessage;
		
		public void clickOnShopingCart() {
			clickShopingCart.click();
		}
		
		public boolean ShopingEmptyMesage() {
			if(shopingMessage.isDisplayed())
				return true;
			else
				return false;
						
		}

}
