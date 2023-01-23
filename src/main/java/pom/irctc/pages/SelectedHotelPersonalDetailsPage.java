package pom.irctc.pages;

import wrappers.GenericWrappers;

public class SelectedHotelPersonalDetailsPage extends GenericWrappers {

	public SelectedHotelPersonalDetailsPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public SelectedHotelPersonalDetailsPage selectTitle(String value) {
		selectvaluebyxpath(prop.getProperty("SelectedHotelPersonalDetailsPage.selectTitle.XPath"), value);
		return this;
	}
	
	
	public SelectedHotelPersonalDetailsPage enterFirstName(String data) {
	     enterByXpath(prop.getProperty("SelectedHotelPersonalDetailsPage.enterFirstName.XPath"), data);
		return this;
	}
	
	
	public SelectedHotelPersonalDetailsPage enterLastName(String data) {
	     enterByXpath(prop.getProperty("SelectedHotelPersonalDetailsPage.enterLastName.XPath"), data);
		return this;
	}
	
	public SelectedHotelPersonalDetailsPage selectCountry(String value) {
		selectvaluebyxpath(prop.getProperty("SelectedHotelPersonalDetailsPage.selectCountry.XPath"), value);
		return this;
	}
	
	public SelectedHotelPersonalDetailsPage selectState(String value) {
		selectvaluebyxpath(prop.getProperty("SelectedHotelPersonalDetailsPage.selectState.XPath"), value);
		return this;
	}
	
	public  SelectedHotelPersonalDetailsPage selectGst(String value) {
		selectvaluebyxpath(prop.getProperty("SelectedHotelPersonalDetailsPage.selectGst.XPath"), value);
		return this;
	}
	
	public  SelectedHotelPersonalDetailsPage enterGstNumber(String data) {
		enterByXpath(prop.getProperty("SelectedHotelPersonalDetailsPage.enterGstNumber.XPath"), data);
		return this;
	}
		
		public  SelectedHotelPersonalDetailsPage enterCompanyName(String data) {
			enterByXpath(prop.getProperty("SelectedHotelPersonalDetailsPage.enterCompanyName.XPath"), data);
			return this;
		}	
		
		public  SelectedHotelPersonalDetailsPage enterCompanyAddress(String data) {
			enterByXpath(prop.getProperty("SelectedHotelPersonalDetailsPage.enterCompanyAddress.XPath"), data);
			return this;
		}	
		
		public SelectedHotelPersonalDetailsPage scrollingDown()  {
		    keyScrollDown();
			return this;
		}
		
		public SelectedHotelPersonalDetailsPage verifyErrorMessageDisplayedUnderGst(String text) {
			verifyTextByXpath(prop.getProperty("SelectedHotelPersonalDetailsPage.verifyErrorMessageDisplayedUnderGst.XPath"), text);
			return this;
		}
		
		public SelectedHotelPersonalDetailsPage clickOnGo() {
			clickByXpath(prop.getProperty("SelectedHotelPersonalDetailsPage.clickOnGo.XPath"));
			return this;
		}	
		
		
		public PaymentPage clickOnContinue() {
		clickByXpath(prop.getProperty("SelectedHotelPersonalDetailsPage.clickOnContinue.XPath"));
		return new PaymentPage();
	}
		
		
		
	
	
	
	
	
}
