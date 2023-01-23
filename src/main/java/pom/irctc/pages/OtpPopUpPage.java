package pom.irctc.pages;

import wrappers.GenericWrappers;

public class OtpPopUpPage extends GenericWrappers{
	
	
	public OtpPopUpPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	

	public OtpPopUpPage clickOnVerify() {
		clickByXpath(prop.getProperty("OtpPopUpPage.clickOnVerify.XPath"));
		return this;
	}
	
	public OtpPopUpPage verifyErrorMessageDisplayed(String text) {
		verifyTextByXpath(prop.getProperty("OtpPopUpPage.verifyErrorMessageDisplayed.XPath"),text);
		return this;
	}
	
}
