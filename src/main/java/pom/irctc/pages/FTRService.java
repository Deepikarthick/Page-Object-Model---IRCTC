package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FTRService extends GenericWrappers {

	public  FTRService waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public FTRService  switchToNextWindow() {
		switchToLastWindow();
		return this ;
	}
	
	public FTRRegisterationPage clickOnUserSignup() {
		clickByXpath(prop.getProperty("FTRService.clickOnUserSignup.XPath"));
		return new FTRRegisterationPage();
	}



	
	
	
	
	
	
	
	
	
	
	
}
