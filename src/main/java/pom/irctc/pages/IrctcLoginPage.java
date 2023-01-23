package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcLoginPage extends GenericWrappers  {

	public IrctcLoginPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
		public IrctcLoginPage clickOnGuestUserLoginIn() {
		clickByXpath(prop.getProperty("IrctcLoginPage.clickOnGuestUserLoginIn.XPath"));
		return this;
	}
	
	public IrctcLoginPage enterEmailId(String data) {
		enterByXpath(prop.getProperty("IrctcLoginPage.enterEmailId.XPath"), data);
		return this;
	}
	
	public IrctcLoginPage enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("IrctcLoginPage.enterMobileNumber.XPath"), data);
		return this;
	}
	
	
	public IrctcHotelsPage clickOnLogin1() {
		clickByXpath(prop.getProperty("IrctcLoginPage.clickOnLogin1.XPath"));
		return new IrctcHotelsPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
