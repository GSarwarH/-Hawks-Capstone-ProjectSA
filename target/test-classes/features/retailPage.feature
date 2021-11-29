Feature: Login


Background:
		Given User is on Retail website
		And User click  on MyAccount
		When User click on Login
		And User enter username 'ilam@gmail.com' and password '123456'
		And User click on Login button
		Then User should be logged in to MyAccount dashboard
		
Scenario: Register as an Affiliate user with Cheque Payment Method
		When User click on 'Register for an Affiliate Account' link
		And User fill affiliate form with below information
		|company|website|taxID|paymentMethod|
		|tom|www.tom.com|654|Cheque|
		And User click on Payee Name 'Sakhi'
		And User check on About us check box
		And User click on Continue1 button
		Then User should see a success message
			
Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
		When User click on Edit your affiliate informationlink
		And user click on Bank Transfer radio button
		And User fill Bank information with below information
		|bankName|abaNumber|swiftCode|accountName|accountNumber|
		|SarwarBank|243654|4123654adf|Gulab Jan|22554433|
		And User click on Continue2 button
		Then User should see an Edit success message
	
@Regression			
Scenario: Edit your account Information
		When User click on Edit your account information link
		And User modify below information
		|firstname|lastName|email|telephone|
		|Rayyan|Hassanzada|haghsa123@gmail.com|123456|
		And User Click on continue3 button
		Then User should see a message Success: Your account has been successfully updated
		
		


		