package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC001";
		testCaseDescription="IRCTC Registeration Form";
		author="Deepika";
		category="Smoke";
		url=" https://www.irctc.co.in/nget/train-search";
		
	}
	
	
	
	@Test
	public void irctcRegistration1() {
		
		new HomePage()
		.clickOnRegister()
		.waitForPageLoad(4000)
		.enterUserName("Deepika123")
		.enterUserPassword("Secret123$")
		.enterConfirmUserPassword("Secret123$")
		.waitForPageLoad(4000)
		.clickOnPreferredLanguage()
		.clickOnPreferredLanguageOption()
		.waitForPageLoad(2000)
		.clickOnSecurityQuestion()
		. clickOnSecurityQuestionOptions()
		.enterSecurityAnswer("vijay")
		.clickOnContinue()
		.waitForPageLoad(3000)
		.enterFirstName("deepika")
		.enterMiddleName("karthick")
		.enterLastName("v")
		.clickOnOccupation()
		.clickOnOccupationOptions()
		.waitForPageLoad(3000)
		.clickOnDateOfBirth()
		.waitForPageLoad(2000)
		.selectMonth("March")
		.selectyear("1996")
		.clickDate("13")
		.clickOnMartialStatus()
		.selectNationality("India")
		.clickOnGender()
		.enterEmail("deepikavenkatesh04@gmail.com")
		.enterMobile("9876543201")
		.selectNationality1("India")
		.waitForPageLoad(3000)
		.clickOnContinue1()
		.enterResAddress1("no.6")
		.enterResAddress2("thirumalai nagar")
		.enterResAddress3("perungudi")
		.enterResPinCode("641006")
		.waitForPageLoad(3000)
		.selectCity("Select city")
		.selectPostOffice("Select a Post Office")
		.waitForPageLoad(2000)
		.enterResPhone("9876543210")
		.waitForPageLoad(3000)
		.clickOnCopyResidenceAddress()
		.waitForPageLoad(2000)
		.enterOffAddress1("floorno-3")
		.enterOffAddress2("thiru nagar")
		.enterOffAddress3("thiruvanmaiyur")
		.clickOnCountry()
		.clickOnCountryOptions()
		.waitForPageLoad(2000)
		.enterOffPinCode("600096")
		.waitForPageLoad(2000)
		.enterOffState("Tamilnadu")
		.enterOffCity("chennai")
		.enterOffPostOff("Perungudi")
		.enterOffPhone("8765432109");
		
		
	}

}
