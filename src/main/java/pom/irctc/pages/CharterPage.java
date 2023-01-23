package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers {

	
	public CharterPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public CharterPage clickOnEnquiryForm() {
		clickByXpath(prop.getProperty("CharterPage.clickOnEnquiryForm.XPath"));
		return this;
	}
	
	public CharterPage enterName(String data) {
		enterByXpath(prop.getProperty("CharterPage.enterName.XPath"), data);
		return this;
	}
	
	public CharterPage enterOrganization(String data) {
		enterByXpath(prop.getProperty("CharterPage.enterOrganization.XPath"), data);
		return this;
	}
	
	public CharterPage enterAddress(String data) {
		enterByXpath(prop.getProperty("CharterPage.enterAddress.XPath"), data);
		return this;
	}
	
	public CharterPage enterMobile(String data) {
		enterByXpath(prop.getProperty("CharterPage.enterMobile.XPath"), data);
		return this;
	}
	
	public CharterPage enterEmail(String data) {
		enterByXpath(prop.getProperty("CharterPage.enterEmail.XPath"), data);
		return this;
	}
	
	public CharterPage selectRequestFor(String value) {
		selectVisibileTextByxpath(prop.getProperty("CharterPage.selectRequestFor.XPath"), value);
		return this;
	}
	
	public CharterPage scrollDown() {
		keyScrollDown();
		return this;
	}
	
	public CharterPage enterOriginStation(String data) {
		enterByXpath(prop.getProperty("CharterPage.enterOriginStation.XPath"), data);
		return this;
	}
	
	
	public CharterPage enterDestinationStation(String data) {
		enterByXpath(prop.getProperty("CharterPage.enterDestinationStation.XPath"), data);
		return this;
	}
	
	public CharterPage clickOnCheckInDate() {
		clickByXpath(prop.getProperty("CharterPage.clickOnCheckInDate.XPath"));
		return this;
	}
	
	public CharterPage clickOnCheckInDateOptions() {
		clickByXpath(prop.getProperty("CharterPage.clickOnCheckInDateOptions.XPath"));
		return this;
	}
	public CharterPage clickOnCheckOutDate() {
		clickByXpath(prop.getProperty("CharterPage.clickOnCheckOutDate.XPath"));
		return this;
	}
	
	public CharterPage clickOnCheckOutDateOptions() {
		clickByXpath(prop.getProperty("CharterPage.clickOnCheckOutDateOptions.XPath"));
		return this;
	}
	
	public CharterPage enterDurationPeriod(String data) {
		enterByXpath(prop.getProperty("CharterPage.enterDurationPeriod.XPath"), data);
		return this;
	}
	
	public CharterPage enterCoachDetails(String data) {
		enterByXpath(prop.getProperty("CharterPage.enterCoachDetails.XPath"), data);
		return this;
	}
	
	public CharterPage enterNumPassenger(String data) {
		enterByXpath(prop.getProperty("CharterPage.enterNumPassenger.XPath"), data);
		return this;
	}
	
	public CharterPage enterCharterPurpose(String data) {
		enterByXpath(prop.getProperty("CharterPage.enterCharterPurpose.XPath"), data);
		return this;
	}
	
	public CharterPage enterAdditionalServicesRequired(String data) {
		enterByXpath(prop.getProperty("CharterPage.enterAdditionalServicesRequired.XPath"), data);
		return this;
	}
	public CharterPage clickOnsubmit() {
		clickByXpath(prop.getProperty("CharterPage.clickOnsubmit.XPath"));
		return this;
	}
	
	public CharterPage getText(String xpathVal) {
		getTextByXpath(prop.getProperty("CharterPage.getText.XPath"));
		return this;
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
