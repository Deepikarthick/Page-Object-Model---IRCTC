package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcHotelsPage extends GenericWrappers {

	public IrctcHotelsPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public IrctcHotelsPage  switchToNextWindow() {
		switchToLastWindow();
		return this ;
	}
	
	public IrctcLoginPage clickOnLogin() {
		clickByXpath(prop.getProperty("IrctcHotelsPage.clickOnLogin.XPath"));
		return new IrctcLoginPage();
	}
	
	public IrctcHotelsPage enterDestinationPlace(String data) {
		enterByXpath(prop.getProperty("IrctcHotelsPage.enterDestinationPlace.XPath"), data);
		return this;
	}
	
	public IrctcHotelsPage clickOnDestination() {
		clickByXpath(prop.getProperty("IrctcHotelsPage.clickOnDestination.XPath"));
		return this;
	}
	
	public IrctcHotelsPage clickOnCheckInDateSelection() {
		clickByXpath(prop.getProperty("IrctcHotelsPage.clickOnCheckInDateSelection.XPath"));
		return this;
	}
	
	public IrctcHotelsPage clickOnCheckInDate() {
		clickByXpath(prop.getProperty("IrctcHotelsPage.clickOnCheckInDate.XPath"));
		return this;
	}
	
	public IrctcHotelsPage clickOnCheckoutDateSelection() {
		clickByXpath(prop.getProperty("IrctcHotelsPage.clickOnCheckoutDateSelection.XPath"));
		return this;
	}
	public IrctcHotelsPage clickOnCheckOutDate() {
		clickByXpath(prop.getProperty("IrctcHotelsPage.clickOnCheckOutDate.XPath"));
		return this;
	}
	
	
	public IrctcHotelsPage clickOnRoomSelection() {
		clickByXpath(prop.getProperty("IrctcHotelsPage.clickOnRoomSelection.XPath"));
		return this;
	}
	
	
	public IrctcHotelsPage clickOnRoomSelectionOption(String value) {
		selectvaluebyxpath(prop.getProperty("IrctcHotelsPage.clickOnRoomSelectionOption.XPath"), value);
		return this;
	}
	
	
	public IrctcHotelsPage clickOnAdultSelectionOption(String value) {
		selectvaluebyxpath(prop.getProperty("IrctcHotelsPage.clickOnAdultSelectionOption.XPath"), value);
		return this;
	}
	
	public IrctcHotelsPage  scrollDown(){
		keyScrollDown();
		return this;
	}

	
	public IrctcHotelsPage clickOnDone() {
		clickByXpath(prop.getProperty("IrctcHotelsPage.clickOnDone.XPath"));
		return this;
	}
	
	public IrctcHotelsPage  scrollUp(){
		keyScrollUp();
		return this;
	}
	
	public HotelsListPage clickOnFindHotels() {
		clickByXpath(prop.getProperty("IrctcHotelsPage.clickOnFindHotels.XPath"));
		return new HotelsListPage();
	}
	
	
	
	
	
	
	
	
	
}
