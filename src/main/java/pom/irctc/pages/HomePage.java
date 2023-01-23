package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
	public HomePage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public RegisterationPage clickOnRegister() {
		clickByXpath(prop.getProperty("HomePage.clickOnRegister.XPath"));
		return new RegisterationPage();
	}
	
	public HomePage mouseHoverOnHolidays() {
		clickByXpath(prop.getProperty("HomePage.mouseHoverOnHolidays.XPath"));
		return this;
	}
	
	public HomePage mouseHoverOnStays() {
		clickByXpath(prop.getProperty("HomePage.mouseHoverOnStays.XPath"));
		return new HomePage();
	}
	
	public AccomadationPage clickOnLounge() {
		clickByXpath(prop.getProperty("HomePage.clickOnLounge.XPath"));
		return new AccomadationPage();
	}
	
	public AccomadationPage switchWindow() {
		switchToLastWindow();
		return new AccomadationPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
