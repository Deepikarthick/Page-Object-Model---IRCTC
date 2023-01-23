package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelsListPage extends GenericWrappers {
	
	public HotelsListPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public SelectedHotelPage clickOnFirstDisplayedHotel() {
		clickByXpath(prop.getProperty("HotelsListPage.clickOnFirstDisplayedHotel.XPath"));
		return new SelectedHotelPage();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
