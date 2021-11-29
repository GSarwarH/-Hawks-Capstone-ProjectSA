package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjecsts.DestopPageObject;
import utilities.CucumberReportingConfig;
import utilities.UtilityClass;


public class desktopStepDef extends Base {
	
	DestopPageObject obj = new DestopPageObject();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
	    String actualTitl = driver.getTitle();
	    String expectTitle = "TEK SCHOOL";
	    Assert.assertEquals(actualTitl, expectTitle);
	    logger.info("User is on retail page");
	 UtilityClass.takeScreenShot();
	 CucumberReportingConfig.reportConfig();
	 
	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
	    obj.clickOnDesktop();
	    logger.info("User clicked on Desktop tab");
	}
	
	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		obj.clickOnShowAllDesktop();
		logger.info("User clicked on show all desktop");
	}
	

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_Desktop_page() {
		Assert.assertTrue(obj.desktopMainPage());
	}
	
//Scenario: User add HP LP3065  from Desktops tab to the cart
	
	@And("User click  ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
	   obj.clickOnHp();
	   logger.info("User clicked on Hp HP LP3065 ");
	}

	@And("^User select quantity '(.+)'$")
	public void user_select_quantity(String qty) {
		obj.enterHPQuantity(qty);
		logger.info("User entered quantity");
	    
	}

	@And("User clicks adds to Cart button")
	public void user_clicks_adds_to_cart_button() {
	   obj.clickOnAddToCartHp();
	   logger.info("User clicked on Add to Cart");
	}

	@Then("User should see a message 'Success: you have added HP LP 3065 to your Shopping cart!'")
	public void user_should_see_a_message() {
		Assert.assertTrue(obj.disPlayHPSuccessMessage());
		logger.info("Success Message displayed");
	}
	
//Scenario: User add Canon EOS 5D from Desktops tab to the cart	
	
	@And("User click  ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		obj.clickOnCanoon();
		logger.info("User clicked on Canon EOS 5D");
	}

	@And("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		obj.clickOnDrowDownList();
		logger.info("User clicked on Please Select");
		obj.clickOnRed();
		logger.info("User clicked on Red ");
	  
	}

	@And("^User selects quantity '(.+)'$")
	public void user_selects_quantity(String canonQty) {
	    obj.clickOnQuantity(canonQty);
	    logger.info("User Enter Quantity");
	}
	
	@And("User click Addd to Cart button")
	public void user_click_Addd_to_Cart_button() {
		obj.clickOnCanoonAddToCart();
		logger.info("User Clicked on Add To Cart");
	}

	@Then("User should see a message 'Success: You have added Canon EOS 5D to your shopping cart!'")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
	    Assert.assertTrue(obj.dispalyCanoonSuccessMessage());
	    logger.info("Success Message displayed");
	}
	
//Scenario: User add a review to Canon EOS 5D item in Desktops tab
	
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
	 obj.clickOnCanoonToReview();
	 logger.info("User clicked on Canon EOS 5D ");
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
	    obj.clickOnWriteReivew();
	    logger.info("User clicked on write a review link ");
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dt) {
		
		List<Map<String, String>> ratingDT = dt.asMaps(String.class, String.class);
		
		obj.enterName(ratingDT.get(0).get("yourname"));
		obj.reviewDetails(ratingDT.get(0).get("yourReview"));
		obj.reviewRating(ratingDT.get(0).get("Rating"));
		
		logger.info("User entered required information");
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		
		obj.entrOnContinueButon();
		logger.info("User Clicked on continue butoon");
	    
	}

	@Then("User should see a message with 'Thank you for your review. It has been submitted to the webmaster for approval'")
	public void user_should_see_a_message_with() {
		Assert.assertTrue(obj.displayReviewSuccesMessage());
		logger.info("Succes Message is displayed");
	   
	}
	

}
