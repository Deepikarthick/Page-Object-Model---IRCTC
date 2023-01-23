package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccomadationPage extends GenericWrappers {

	public  AccomadationPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	public  AccomadationPage switchToNextWindow() {
		switchToLastWindow();
		return this ;
	}
	
	public AccomadationPage clickOnSidebarCollapse() {
		clickByXpath(prop.getProperty("AccomadationPage.clickOnSidebarCollapse.XPath"));
		return this;
	}
	
	public FTRService clickOnBookTrain(){
	clickByXpath(prop.getProperty("AccomadationPage.clickOnBookTrain.XPath"));
	return new FTRService();
	}
	
	
	public CharterPage clickOnCharter() {
		clickByXpath(prop.getProperty("AccomadationPage.clickOnCharter.XPath"));
		return new CharterPage();
	}
	
	public IrctcHotelsPage clickOnHotelsIcon() {
		clickByXpath(prop.getProperty("AccomadationPage.clickOnHotelsIcon.XPath"));
		return new IrctcHotelsPage ();
	}
	
	
	
	
	
	
	
	
	
	
	
}
