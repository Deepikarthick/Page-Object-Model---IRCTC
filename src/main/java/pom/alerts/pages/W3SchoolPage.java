package pom.alerts.pages;


import wrappers.GenericWrappers;

public class W3SchoolPage extends GenericWrappers {

	
	public  W3SchoolPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public W3SchoolPage switchOnFrame(String framevalue) {

		switchFrame(framevalue);
		return this;
		}
	
	public W3SchoolPage clickOnTryIt() {
		clickByXpathNoSnap(prop.getProperty("W3SchoolPage.clickOnTryIt.XPath"));
		return this;
	}
	
	 public W3SchoolPage getTextFromAlert() {
		 getAlertText();
		 return this;
	 }
	    
	 public W3SchoolPage clickOnAccept()
    {
		acceptAlert();
		return this;
    }
	
	public W3SchoolPage switchOnDefaultContent() {
	
		defaultcontent();
		return this;
	}
	
	public W3OnlineWebTutorials clickOnHome() {
		clickByXpath(prop.getProperty("W3SchoolPage.clickOnHome.XPath"));
		return new W3OnlineWebTutorials();
	}
	
	public W3SchoolPage getApplicationText(String text) {
		
		verifyTextContainsByXpath(prop.getProperty("W3SchoolPage.getApplicationText.XPath"), text);
		return this;
	}
	
	public W3SchoolPage clickOnRefresh() {
		refresh();
		return this;
	}
	
	public W3SchoolPage clickOnDismissAlert() {
		dismissAlert();
		return this;
	}
	
	public W3SchoolPage sendTextToAlert(String value) {
		sendAlertText(value);
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
