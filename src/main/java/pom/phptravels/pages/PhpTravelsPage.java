package pom.phptravels.pages;


import wrappers.GenericWrappers;

public class PhpTravelsPage extends GenericWrappers {

	
	public PhpTravelsPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}

	public PhpTravelsPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("PhpTravelsPage.enterFirstName.XPath"), data);
		return this;
	}
	
	public PhpTravelsPage enterLastName(String data) {
		enterByXpath(prop.getProperty("PhpTravelsPage.enterLastName.XPath"), data);
		return this;
	}
	
	public PhpTravelsPage enterEmailAddress(String data) {
		enterByXpath(prop.getProperty("PhpTravelsPage.enterEmailAddress.XPath"), data);
		return this;
	}
	
	public PhpTravelsPage enterPhoneNumber(String data) {
		enterByXpath(prop.getProperty("PhpTravelsPage.enterPhoneNumber.XPath"), data);
		return this;
	}
	
	public PhpTravelsPage enterCompanyName(String data) {
		enterByXpath(prop.getProperty("PhpTravelsPage.enterCompanyName.XPath"), data);
		return this;
	}
	
	public PhpTravelsPage enterInputAddress1(String data) {
		enterByXpath(prop.getProperty("PhpTravelsPage.enterInputAddress1.XPath"), data);
		return this;
	}
	
	public PhpTravelsPage enterInputAddress2(String data) {
		enterByXpath(prop.getProperty("PhpTravelsPage.enterInputAddress2.XPath"), data);
		return this;
	}
	
	public PhpTravelsPage enterCity(String data) {
		enterByXpath(prop.getProperty("PhpTravelsPage.enterCity.XPath"), data);
		return this;
	}
	
	public PhpTravelsPage enterState(String data) {
		enterByXpath(prop.getProperty("PhpTravelsPage.enterState.XPath"), data);
		return this;
	}
	
	
	//public PhpTravelsPage selectState(String value) {
		//selectvaluebyxpath("//select[@id='stateselect']", value);
		//return this;
	//}
	
	
	public PhpTravelsPage enterPostcode(String data) {
		enterByXpath(prop.getProperty("PhpTravelsPage.enterPostcode.XPath"), data);
		return this;
	}
	
	public PhpTravelsPage selectCountry(String value) {
		selectVisibileTextByxpath(prop.getProperty("PhpTravelsPage.selectCountry.XPath"), value);
		return this;
	}
	
	public PhpTravelsPage enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("PhpTravelsPage.enterMobileNumber.XPath"), data);
		return this;
	}
	
	
	public PhpTravelsPage enterNewPassword(String data) {
		enterByXpath(prop.getProperty("PhpTravelsPage.enterNewPassword.XPath"), data);
		return this;
	}
	
	
	public PhpTravelsPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("PhpTravelsPage.enterConfirmPassword.XPath"), data);
		return this;
	}
	
	
	
	
}
