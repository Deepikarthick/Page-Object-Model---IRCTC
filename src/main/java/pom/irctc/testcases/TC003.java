package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC003";
		testCaseDescription="Charter Service";
		author="Deepika";
		category="Smoke";
		url="https://www.irctc.co.in";
		
	}
	
	@Test
	public void irctcRegistration3() {
	
         new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToNextWindow()
		.waitForPageLoad(4000)
		.clickOnSidebarCollapse()
		.waitForPageLoad(3000)
		.clickOnCharter()
		.waitForPageLoad(5000)
		.clickOnEnquiryForm()
		.waitForPageLoad(4000)
		.enterName("deepika")
		.enterOrganization("abc Technologies")
		.enterAddress("no:6,thirumalai nagar,chennai")
		.enterMobile("987654321")
		.enterEmail("deepikavenkatesh04@gmail.com")
		.selectRequestFor("Saloon Charter")
		.enterOriginStation("chennai")
		.enterDestinationStation("coimbatore")
		.clickOnCheckInDate()
		.scrollDown()
		.waitForPageLoad(3000)
		.clickOnCheckInDateOptions()
		.waitForPageLoad(4000)
		.clickOnCheckOutDate()
		.waitForPageLoad(4000)
		.clickOnCheckOutDateOptions()
		.waitForPageLoad(3000)
		.enterDurationPeriod("4")
		.enterCoachDetails("3-tier AC coach")
		.enterNumPassenger("3")
		.enterCharterPurpose("privacy")
		.enterAdditionalServicesRequired("no")
		.clickOnsubmit()
		.waitForPageLoad(2000)
		.getText("Mobile no. not valid");
	
	
	
	
	
	
	
	
	
	
}
}