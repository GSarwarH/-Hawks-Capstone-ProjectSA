package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjecsts.LaptopAndNoteBooksPageObject;
import utilities.UtilityClass;

public class LaptopAndNoteBooksStepDef extends Base {
	
	LaptopAndNoteBooksPageObject obj = new LaptopAndNoteBooksPageObject();

//	Background
	
	@And("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
	    obj.laptopsAndNotebookClick();
	    logger.info("User clicked on laptop and notebook tab");
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
	    obj.showAllLaptopsAndNotebooksClick();
	}
	
//	Scenario: Add and Remove a Mac book from Cart

	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
	    obj.MacBookClick();
	}
	
	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
	    obj.addToCart();
	    logger.info("User clicked on add to cart ");
	}

	@Then("^User should see a success message '(.+)'$")
	public void user_should_see_a_message(String sucssMsg) {
	    
		Assert.assertTrue(obj.succcessMsgDisplay());
		
	    logger.info("Success message is displayed");
	}

	@Then("^User should see '(.+)' showed to the cart$")
	public void user_should_see_tem_s_showed_to_the_cart(String itemAdded) throws InterruptedException {
		
		Thread.sleep(3000);
	    Assert.assertTrue(obj.OneItemDisplayed());
	    logger.info("One item dispalyed");
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		obj.clickCartButton();
		logger.info("User clicked on Cart option");
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
	    obj.clickRemoveButton();
	    logger.info("User removed item from the cart");
	}

	@Then("^item should be removed and cart should show '(.+)'$")
	public void item_should_be_removed_and_cart_should_show_item_s(String zeroItems) {
	    Assert.assertTrue(obj.zeroItemsVerify());
	}
	
	
//	Scenario: Product Comparison 


	@When("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_macbook() {
		obj.MacBookCompareClick();
		logger.info("User clicked on Macbook comparison button");
	}

	@When("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_macbook_Air() {
	    obj.MacBookAirCompareClick();
	    logger.info("User clicked on macbook air comparison button");
	}

	@Then("^User should see message '(.+)'$")
	public void User_should_see_a_message(String successM) {
	    Assert.assertTrue(obj.MacbookAirSuccessMsg());
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		obj.productComparisonLinkClick();
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		obj.productComparisonVerify();
	}
	
//	Scenario: Adding an item to Wish list

	@When("User click on heart icon to add Sony VaIO laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		obj.SonyVIOWishListClick();
	}

	@Then("User should get a message '(.+)'")
	public void user_should_get_a_message() {
	    Assert.assertTrue(obj.mustLoginMsgVerification());
	    logger.info("Verification message dispalyed");
	}
	
//	Scenario: Validate the price of MacBook Pro is 2000

	@When("User click on MacBook Pro item")
	public void user_click_on_Macbook_Pro_item() {
		obj.MacBookProItemClick();
		logger.info("User clicked on mac pro");
		UtilityClass.takeScreenShot();
	}

	@Then("^User should see  '(.+)' price tag is present on UI$")
	public void user_should_see_$_price_tag_is_present_on_ui(String amountVerify) {
	    Assert.assertTrue(obj.priceVerifications());
	    logger.info("Price tage is present");
	    UtilityClass.takeScreenShot();
	}
	
	
	

}
