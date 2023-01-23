package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC002  extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC002";
		testCaseDescription="FTR Service";
		author="Deepika";
		category="Smoke";
		url="https://www.irctc.co.in";
		
	}

	
	@Test
	public void irctcRegistration2() {
		
		
		new HomePage()
		.waitForPageLoad(3000)
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToNextWindow()
		.waitForPageLoad(3000)
		.clickOnSidebarCollapse()
		.clickOnBookTrain()
		.switchToNextWindow()
		.waitForPageLoad(3000)
		.clickOnUserSignup()
		.waitForPageLoad(4000)
		.enterUserId("Deepika_123")
		.enterPassword("Deepi_1234")
		.enterConfirmPassword("Deepi_1234")
		.clickOnSecques("2")
		.waitForPageLoad(2000)
		.enterSecurityAnswer("Vijay")
		.clickOnDateOfBirth()
		.selectMonth("Mar")
		.selectYear("1996")
		.clickOnDate()
		.clickOnGender()
		.clickOnMartialStatus()
		.enteremailId("deepikavenkatesh04@gmail.com")
		.selectOccupation("Public")
		.enterFirstName("deepika")
		.enterMiddleName("karthick")
		.enterLastNmae("V")
		.selectNationality("94")
		.enterFlatNo("NO/6")
		.enterStreet("Thirumalai Nagar")
		.enterArea("perungudi")
		.selectCountry("94")
		.enterMobile("9876543210")
		.scrollingDown()
		.enterPincode("600096")
		.waitForPageLoad(4000)
		.clickOnSameAddress()
		.waitForPageLoad(3000)
		.enterFlatNoOffice("NO/4")
		.enterStreetOffice("church road")
		.enterAreaOffice("Tharamani")
		.selectCountryOffice("94")
		.enterMobileOffice("9876543120")
		.enterPincodeOffice("600096")
		.scrollingDown()
		.selectCityOffice("Kanchipuram")
		.selectStateOffice("TAMIL NADU")
		.selectPostOffice1("Perungudi S.O");
			
	}
	
	
}
