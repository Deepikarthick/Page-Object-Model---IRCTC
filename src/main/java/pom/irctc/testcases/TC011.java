package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.W3SchoolPage;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers {
	
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC011";
		testCaseDescription="Prompt Alert";
		author="Deepika";
		category="Smoke";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		
	}
	
	@Test
	public void PromptAlert() {
		
		new W3SchoolPage()
		.waitForPageLoad(4000)
		.switchOnFrame("iframeResult")
		.clickOnTryIt()
		.sendTextToAlert("deepika")
		.getTextFromAlert()
		.clickOnAccept()
		.getApplicationText("deepika")
		.clickOnRefresh()
		.waitForPageLoad(4000)
		.waitForPageLoad(4000)
		.switchOnFrame("iframeResult")
		.clickOnTryIt()
		.sendTextToAlert("deepika")
		.getTextFromAlert()
		.clickOnDismissAlert()
		.getApplicationText("deepika")
		.switchOnDefaultContent()
		.clickOnHome();
		
		
	}
	}
	
	
	
	
	
	
	
	
	

