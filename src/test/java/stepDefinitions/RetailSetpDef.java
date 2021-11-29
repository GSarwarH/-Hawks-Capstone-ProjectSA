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
import pageObjecsts.RetailPageObject;

public class RetailSetpDef extends Base {
	
	RetailPageObject obj = new RetailPageObject();

	//Background
	
	@When("User click  on MyAccount")
	public void user_click_on_my_account() {
	  obj.clickOnMyAccount();
	  logger.info("User clicked on My Account");
	
	}

	@And("User click on Login")
	public void user_click_on_login() {
		obj.clickOnLogin();
		logger.info("User clicked on Login");
	    
	}

	@And("^User enter username '(.+)' and password '(.+)'$")
	public void user_enter_username_and_password(String uname, String pass) {
		obj.enterUsernameAndPassword(uname, pass);
		logger.info("User entered user name and password");
	  
	}

	@And("User click on Login button")
	public void user_click_on_login_button() {
		obj.clickOnLoginButton();
		logger.info("User clicked on login button");
	   
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		Assert.assertTrue(obj.myAccountDashboard());
		logger.info("My account Dashobor");
	   
	}
//Scenario: Register as an Affiliate user with Cheque Payment Method

	@When("User click on 'Register for an Affiliate Account' link")
	public void user_click_on_link() {
		obj.clickOnRegisterForAnAffiliateAccount();
		logger.info("Use clicked on Register for an Affiliate Account");
	    
	}

	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dt) {
	List<Map<String, String>> paymentDT = dt.asMaps(String.class, String.class);
	
	
	obj.companyID(paymentDT.get(0).get("company"));
	obj.companyPaymentMethod(paymentDT.get(0).get("website"));
	obj.companyID(paymentDT.get(0).get("taxID"));
	obj.companyPaymentMethod(paymentDT.get(0).get("paymentMethod"));
	logger.info("User entered company, website, taxID, and payment Method");
	    
	}
	
	@And("^User click on Payee Name '(.+)'$")
		public void user_clickon_Payee_Name(String payeName) {
		obj.companyPayeeName(payeName);
	}

	@And("User check on About us check box")
	public void user_check_on_about_us_check_box() {
	   obj.checkOnAboutUs();
	   logger.info("user clicked on About us check box ");
	}

	@And("User click on Continue1 button")
	public void user_click_on_continue1_button() {
	    obj.continueButton();
	    logger.info("User clicked on continue button");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
	    Assert.assertTrue(obj.affiliateSuccessMessage());
	    logger.info("Affilate Account success message");
	}
	
//Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer

	@When("User click on Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
	    obj.clickOnEditAffilateInformation();
	    logger.info("User clicked Edit your affiliate information");
	}

	@And("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
	    obj.clickOnBankTransfer();
	    logger.info("User clicked on Bank Transfer");
	}

	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable bdt) {
	   List<Map<String, String>> paymentBankDT = bdt.asMaps(String.class, String.class);
	   obj.enterBankName(paymentBankDT.get(0).get("bankName"));
	   obj.enterBranchNumber(paymentBankDT.get(0).get("abaNumber"));
	   obj.enterSwiftCode(paymentBankDT.get(0).get("swiftCode"));
	   obj.enterAccountName(paymentBankDT.get(0).get("accountName"));
	   obj.enterAccountNumber(paymentBankDT.get(0).get("accountNumber"));
	}
	
	@And("And User click on Continue2 button")
	public void user_click_on_continue2_button() {
	    obj.enterContinueButton();
	    logger.info("User clicked on continue button");
	}
	
	
	@Then("User should see an Edit success message")
	public void user_should_see_an_Edit_success_message() {
		Assert.assertTrue(obj.editSuccessMessage());
		logger.info("User clicked on continue button");
		
	}
	
//Scenario: Edit your account Information 	
	
	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() {
	    obj.clickOnEditAccountInformation();
	    logger.info("User clicked on Edit Account Information");
	}

	@And("User modify below information")
	public void user_modify_below_information(DataTable accountEditDT) {
		List<Map<String, String>> accountEdiInfo = accountEditDT.asMaps(String.class, String.class);
		obj.enterFirstName(accountEdiInfo.get(0).get("firstname"));
		obj.enterLastName(accountEdiInfo.get(0).get("lastName"));
		obj.enterEmailAddress(accountEdiInfo.get(0).get("email"));
		obj.enterTelephone(accountEdiInfo.get(0).get("telephone"));
		logger.info("Usr Entered FirstName, LastName,email and Telephon No ");
	   
	}

	@And("User Click on continue3 button")
	public void user_Click_on_continue3_button() {
	    obj.clickOnContinue();
	}
	
	@Then("User should see a message Success: Your account has been successfully updated")
	public void user_should_see_a_message_Success() {
		Assert.assertTrue(obj.accountDisplaySuccesMessage());
		logger.info("Account displayed success message");
	
	}
}
