package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PaymentPage extends GenericWrappers {

	public PaymentPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	//public  PaymentPage verifyErrorMessageDisplayedUnderGst(String text) {
		//verifyTextByXpath("//span[text()='Please Enter Valid GSt number']", text);
	//	return this;
	//}
	public PaymentPage clickOnAgree() {
		clickByXpath(prop.getProperty("PaymentPage.clickOnAgree.XPath"));
		return this;
	}
	
	public OtpPopUpPage clickOnMakePayment() {
		clickByXpath(prop.getProperty("PaymentPage.clickOnMakePayment.XPath"));
		return new OtpPopUpPage();
		
	}
	
	
	
	
}
