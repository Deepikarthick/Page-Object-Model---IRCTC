package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.W3SchoolPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers {

	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC009";
		testCaseDescription="Simple Alert";
		author="Deepika";
		category="Smoke";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		
	}
	
	
	@Test
	public void SimpleAlert() {
		
		
	
		new W3SchoolPage()
		.waitForPageLoad(3000)
		.switchOnFrame("iframeResult")
		.clickOnTryIt()
		.getTextFromAlert()
		.clickOnAccept()
		.switchOnDefaultContent()
		.waitForPageLoad(3000)
		.clickOnHome();
		
	}	
}
