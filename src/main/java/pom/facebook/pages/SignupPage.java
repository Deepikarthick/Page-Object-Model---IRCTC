package pom.facebook.pages;

import wrappers.GenericWrappers;

public class SignupPage extends GenericWrappers {

	
	public SignupPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public SignupPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("FacebookSignupPage.FirstName.XPath"), data);
		return this;
	}
	
	public SignupPage enterLastName(String data) {
		enterByXpath(prop.getProperty("FacebookSignupPage.LastName.XPath"), data);
		return this;
	}
	
	public SignupPage enterEmailAddress(String data) {
		enterByXpath(prop.getProperty("FacebookSignupPage.enterEmailAddress.XPath"), data);
		return this;
	}
		
		public SignupPage reEnterEmailAddress(String data) {
			enterByXpath(prop.getProperty("FacebookSignupPage.reEnterEmailAddress.XPath"), data);
			return this;		
	}
	
	public SignupPage enterPassword(String data) {
		enterByXpath(prop.getProperty("FacebookSignupPage.enterPassword.XPath"), data);
		return this;
	}
	
	public SignupPage selectDay(String value) {
		selectVisibileTextByxpath(prop.getProperty("FacebookSignupPage.selectDay.XPath"), value);
		return this;
	}
	
	public SignupPage selectMonth(String value) {
		selectVisibileTextByxpath(prop.getProperty("FacebookSignupPage.selectMonth.XPath"), value);
		return this;
	}
	
	public SignupPage selectYear(String value) {
		selectVisibileTextByxpath(prop.getProperty("FacebookSignupPage.selectYear.XPath"), value);
		return this;
	}
	public SignupPage clickOnGender() {
		clickByXpath(prop.getProperty("FacebookSignupPage.clickOnGender.XPath"));
		return this;
	}
	
}
