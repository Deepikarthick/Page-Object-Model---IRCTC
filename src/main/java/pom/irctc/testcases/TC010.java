package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.W3SchoolPage;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC010";
		testCaseDescription="Confirmation Alert";
		author="Deepika";
		category="Smoke";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
		
	}
	

	@Test	
public void ConfirmationAlert() {
		
		
		new W3SchoolPage()
		.waitForPageLoad(5000)
		.switchOnFrame("iframeResult")
		.clickOnTryIt()
		.getTextFromAlert()
		.clickOnAccept()
		.getApplicationText("You pressed OK!")
		.clickOnRefresh()
		.waitForPageLoad(4000)
		.switchOnFrame("iframeResult")
		.clickOnTryIt()
		.getTextFromAlert()
		.clickOnDismissAlert()
		.getApplicationText("You pressed Cancel!")
		.switchOnDefaultContent()
		.clickOnHome();
}
}
