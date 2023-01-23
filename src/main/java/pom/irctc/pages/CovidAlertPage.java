package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CovidAlertPage extends GenericWrappers {

	public HomePage clickOnOk() {
		clickByXpath(prop.getProperty("CovidAlertPage.clickOnOk.XPath"));
		return new HomePage();
		
		
	}
	
	
	
	
}
