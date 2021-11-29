package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjecsts.HomePageObject;

public class HomePageStepDef extends Base {
	HomePageObject obj = new HomePageObject();
	
//Scenario: User verify currency values change
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		obj.clickOnCurrency();
		logger.info("user clicked on Currency");
	    
	}

	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
	    obj.clickOnEuro();
	    logger.info("User clicked on Euro");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
	    Assert.assertTrue(obj.currencyChangeToEuro());
	    logger.info("Euro Sign displayed");
	}

//Scenario: User empty Shopping cart message displays
	
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
	    obj.clickOnShopingCart();
	    logger.info("User clicked on Shoping Cart ");
	}

	@Then("'Your shopping cart is empty!' message should display")
	public void message_should_display() {
		Assert.assertTrue(obj.ShopingEmptyMesage());
		logger.info("Your Shopping Cart is empty");
	    
	}

}
