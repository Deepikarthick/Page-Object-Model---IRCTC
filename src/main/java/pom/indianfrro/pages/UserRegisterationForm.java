package pom.indianfrro.pages;

import wrappers.GenericWrappers;

public class UserRegisterationForm extends GenericWrappers {

	public UserRegisterationPage clickOnSignUpRegisteration() {
		clickByXpath(prop.getProperty("UserRegisterationForm.clickOnSignUpRegisteration.XPath"));
		return new UserRegisterationPage();
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
