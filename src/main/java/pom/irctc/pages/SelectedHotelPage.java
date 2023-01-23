package pom.irctc.pages;

import wrappers.GenericWrappers;

public class SelectedHotelPage extends GenericWrappers {

	public SelectedHotelPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public SelectedHotelPage switchToNextWindow() {
		switchToLastWindow();
		return this ;
	}
	
	public SelectedHotelPage getHotelName() {
		getTextByXpath(prop.getProperty("SelectedHotelPage.getHotelName.XPath"));
		return this;
	}
	
	public SelectedHotelPage getPrice() {
		getTextByXpath(prop.getProperty("SelectedHotelPage.getPrice.XPath"));
		return this;
	}
	
	public SelectedHotelPersonalDetailsPage clickOnContinueBook() {
		clickByXpath(prop.getProperty("SelectedHotelPage.clickOnContinueBook.XPath"));
		return new SelectedHotelPersonalDetailsPage();
	}
	
	
	
}
