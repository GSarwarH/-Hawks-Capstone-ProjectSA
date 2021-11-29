package pageObjecsts;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {
	
	public RetailPageObject(){
		PageFactory.initElements(driver, this);
		
	}
	
	//Background Login to Retail 
	
	@FindBy(xpath = " //span[text()='My Account']")
	private WebElement homePageMyAccount;
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement myAccountLogin;
	
	@FindBy(xpath = "//input[@id='input-email'] ")
	private WebElement myAccountUserName;
	
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement myAccountPassword;
	
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement myAccountClickLoginButton;
	
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountDashboard;
	
	public void clickOnMyAccount() {
		homePageMyAccount.click();
	}
	
	public void clickOnLogin() {
		myAccountLogin.click();
	}
	
	public void enterUsernameAndPassword(String email, String password) {
		myAccountUserName.clear();
		myAccountUserName.sendKeys(email);
		myAccountPassword.clear();
		myAccountPassword.sendKeys(password);;
	}
	
	public void clickOnLoginButton() {
		myAccountClickLoginButton.click();
	}
	
	public boolean myAccountDashboard() {
		if(myAccountDashboard.isDisplayed())
			return true;
		else
			return false;
	}
	
//Scenario: Register as an Affiliate user with Cheque Payment Method
	
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement RegisteraffiliateAccount;
	
	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement affiliateAccountCompany;
	
	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement affiliateAccountWebsite;
	
	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement affiliateAccountTaxId;
	
	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement cheque;
	
	@FindBy(xpath = "//input[@name = 'payment' and @value = 'paypal']")
	private WebElement paypal;
	
	@FindBy(xpath = "//input[@name='payment' and @value='bank']")
	private WebElement bankTransfer;
	
	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement payeeName;
	
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement affiliateAccountAboutUs;
	
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement affiliateAccountContinueButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement affiliateAccountSuccessMessage;
	
	public void clickOnRegisterForAnAffiliateAccount() {
		RegisteraffiliateAccount.click();
	}
	
	public void companyName(String comName) {
		affiliateAccountCompany.sendKeys(comName);
	}
	
	public void companyWebsite(String comWebsite) {
		affiliateAccountCompany.clear();
		affiliateAccountCompany.sendKeys(comWebsite);
	}
	
	public void companyID(String compID) {
		affiliateAccountTaxId.clear();
		affiliateAccountTaxId.sendKeys(compID);
	}
	
	public void companyPaymentMethod(String paymentMethod) {
		if(paymentMethod.equalsIgnoreCase("cheque") && !cheque.isSelected())
			cheque.click();
		else if(paymentMethod.equalsIgnoreCase("PayPal") && !paypal.isSelected())
		paypal.click();
		else if(paymentMethod.equalsIgnoreCase("Bank Transfer") && !bankTransfer.isSelected())
		bankTransfer.click();
		
	}
	
	public void companyPayeeName(String payName) {
		payeeName.clear();
		payeeName.sendKeys(payName);
	}
	
	public void checkOnAboutUs() {
		affiliateAccountAboutUs.click();
	}
	
	public void continueButton() {
		affiliateAccountContinueButton.click();
	}
	
	public boolean affiliateSuccessMessage() {
		if(affiliateAccountSuccessMessage.isDisplayed())
			return true;
		else
			return false;
		
	}
	
//Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
	
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement EditAffiliateInformation;
	
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement EditAffiliateInformationBankTransfer;
	
	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement EditAffiliateInformationBankName;
	
	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement EditAffiliateInformationBranchNumber;
	
	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement EditAffiliateInformationSwiftCode;
	
	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement EditAffiliateInformationAccountName;
	
	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement EditAffiliateInformationAccountNumber;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement EditAffiliateInformationContinueButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement EditAffiliateInformationSucceMessage;
	
	public void clickOnEditAffilateInformation() {
		EditAffiliateInformation.click();
	}
	
	public void clickOnBankTransfer() {
		 EditAffiliateInformationBankTransfer.click();
	}
	
	public void enterBankName(String bName) {
		EditAffiliateInformationBankName.clear();
		EditAffiliateInformationBankName.sendKeys(bName);
	}
	
	public void enterBranchNumber(String branchNo) {
		EditAffiliateInformationBranchNumber.sendKeys(branchNo);
	}
	
	public void enterSwiftCode(String swiftCode) {
		EditAffiliateInformationBranchNumber.clear();
		EditAffiliateInformationSwiftCode.sendKeys(swiftCode);
	}
	
	public void enterAccountName(String accountName) {
		EditAffiliateInformationAccountName.clear();
		EditAffiliateInformationAccountName.sendKeys(accountName);
	}
	
	public void enterAccountNumber(String accountNo) {
		EditAffiliateInformationAccountNumber.clear();
		EditAffiliateInformationAccountNumber.sendKeys(accountNo);
	}
	
	public void enterContinueButton() {
		EditAffiliateInformationContinueButton.click();
	}
	
	public boolean editSuccessMessage() {
		if(EditAffiliateInformationSucceMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
//Scenario: Edit your account Information 	
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement clickOnYourAccountInformationLink;
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement enterFirstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement enterLastName;
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emalAdd;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephone;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement clickContinue;
	
	@FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement displayedSuccessMsg;
	
	public void clickOnEditAccountInformation() {
		clickOnYourAccountInformationLink.click();
	}
	
	public void enterFirstName(String fName) {
		enterFirstName.clear();
		enterFirstName.sendKeys(fName);
	}
	
	public void enterLastName(String lName) {
		enterLastName.clear();
		enterLastName.sendKeys(lName);
	}
	
	public void enterEmailAddress(String emailAdd) {
		emalAdd.clear();
		emalAdd.sendKeys(emailAdd);
		
	}
	
	public void enterTelephone(String telePhone) {
		telephone.clear();
		telephone.sendKeys(telePhone);
	}
	
	public void clickOnContinue() {
		clickContinue.click();
	}
	
	public boolean accountDisplaySuccesMessage() {
		if(displayedSuccessMsg.isDisplayed())
			return true;
		else
			return false;
	}
	
	

}
