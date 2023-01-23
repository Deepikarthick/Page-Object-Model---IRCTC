package pom.indianfrro.pages;


import wrappers.GenericWrappers;

public class UserRegisterationPage extends GenericWrappers {

	public UserRegisterationPage  waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public UserRegisterationPage enterUserId(String data) {
		enterByXpath(prop.getProperty("UserRegisterationPage.enterUserId.XPath"), data);
		return this;
	}
	
	public UserRegisterationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("UserRegisterationPage.enterPassword.XPath"), data);
		return this;	
	}
	
	public UserRegisterationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("UserRegisterationPage.enterConfirmPassword.XPath"), data);
		return this;
	}
	
	public UserRegisterationPage selectSecurityQuestion(String value) {
		selectvaluebyxpath(prop.getProperty("UserRegisterationPage.selectSecurityQuestion.XPath"), value);
		return this;
	}
	
	public UserRegisterationPage enterSecurityAnswer(String data) {
		enterByXpath(prop.getProperty("UserRegisterationPage.enterSecurityAnswer.XPath"), data);
		return this;
	}
	
	public UserRegisterationPage enterUserName(String data) {
		enterByXpath(prop.getProperty("UserRegisterationPage.enterUserName.XPath"), data);
		return this;
	}
	
	public UserRegisterationPage selectOnGender(String value) {
		selectvaluebyxpath(prop.getProperty("UserRegisterationPage.selectOnGender.XPath"), value);
		return this;
	}

	
	public UserRegisterationPage enterUserDesignation(String data) {
		enterByXpath(prop.getProperty("UserRegisterationPage.enterUserDesignation.XPath"), data);
		return this;
	}
	
	public UserRegisterationPage enterUserEmailId(String data) {
		enterByXpath(prop.getProperty("UserRegisterationPage.enterUserEmailId.XPath"), data);
		return this;
	}
	
	public UserRegisterationPage enterUserMobile(String data) {
		enterByXpath(prop.getProperty("UserRegisterationPage.enterUserMobile.XPath"), data);
		return this;
	}
	
	public UserRegisterationPage enterUserPhone(String data) {
		enterByXpath(prop.getProperty("UserRegisterationPage.enterUserPhone.XPath"), data);
		return this;
	}
	
	//public UserRegisterationPage selectNationality(String value) {
		//selectVisibileTextByxpath("//select[@id='u_nationality']", value);
		//return this;
	//}
	
	public UserRegisterationPage enterName(String data) {
		enterByXpath(prop.getProperty("UserRegisterationPage.enterName.XPath"), data);
		return this;
	}
	
	public UserRegisterationPage enterCapacity(String data) {
		enterByXpath(prop.getProperty("UserRegisterationPage.enterCapacity.XPath"), data);
		return this;
	}
	
	public UserRegisterationPage enterAddress(String data) {
		enterByXpath(prop.getProperty("UserRegisterationPage.enterAddress.XPath"), data);
		return this;
	}
	
	public UserRegisterationPage selectOnState(String value) {
		selectvaluebyxpath(prop.getProperty("UserRegisterationPage.selectOnState.XPath"), value);
		return this;
	}
	
	public UserRegisterationPage selectCity(String value) {
		selectvaluebyxpath(prop.getProperty("UserRegisterationPage.selectCity.XPath"), value);
		return this;
	}
	
	public UserRegisterationPage selectAccomadionType(String value) {
		selectvaluebyxpath(prop.getProperty("UserRegisterationPage.selectAccomadionType.XPath"), value);
		return this;
	}

	public UserRegisterationPage selectStarRating(String value) {
		selectvaluebyxpath(prop.getProperty("UserRegisterationPage.selectStarRating.XPath"), value);
		return this;
	}
	
	public UserRegisterationPage enterEmail(String data) {
		enterByXpath(prop.getProperty("UserRegisterationPage.enterEmail.XPath"), data);
		return this;
	}
	
	public UserRegisterationPage enterMyContact(String data) {
		enterByXpath(prop.getProperty("UserRegisterationPage.enterMyContact.XPath"), data);
		return this;
	}
	
	public UserRegisterationPage enterPhoneContact(String data) {
		enterByXpath(prop.getProperty("UserRegisterationPage.enterPhoneContact.XPath"), data);
		return this;
	}
	
	public UserRegisterationPage enterName1(String data) {
		enterByXpath(prop.getProperty("UserRegisterationPage.enterName1.XPath"), data);
		return this;
	}
	
	public UserRegisterationPage enterAddress1(String data) {
		enterByXpath(prop.getProperty("UserRegisterationPage.enterAddress1.XPath"), data);
		return this;
	}
	public UserRegisterationPage clickOnState1(String value) {
		selectvaluebyxpath(prop.getProperty("UserRegisterationPage.clickOnState1.XPath"), value);
		return this;
	}
	
	public UserRegisterationPage clickOnCity1(String value) {
		selectVisibileTextByxpath(prop.getProperty("UserRegisterationPage.clickOnCity1.XPath"), value);
		return this;
	}
	
	public UserRegisterationPage enterEmailId(String data) {
		enterByXpath(prop.getProperty("UserRegisterationPage.enterEmailId.XPath"), data);
		return this;
	}
	
	public UserRegisterationPage enterPhone1(String data) {
		enterByXpath(prop.getProperty("UserRegisterationPage.enterPhone1.XPath"), data);
		return this;
	}
	
	public UserRegisterationPage enterMobile1(String data) {
		enterByXpath(prop.getProperty("UserRegisterationPage.enterMobile1.XPath"), data);
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
