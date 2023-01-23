package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FacebookHomePage extends GenericWrappers {

	public SignupPage clickOnCreateNewAccount() {
		clickByXpath(prop.getProperty("FacebookHomePage.CreateNewAccount.XPath"));
		return new SignupPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
