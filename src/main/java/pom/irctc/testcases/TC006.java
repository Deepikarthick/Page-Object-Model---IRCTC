package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.indianfrro.pages.UserRegisterationForm;
import wrappers.ProjectWrappers;


public class TC006 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC006";
		testCaseDescription="User Registeration for Form C and Form S";
		author="Deepika";
		category="Smoke";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		
	}
	
	
	
	@Test
	public void irctcRegistration6(){
		
		new UserRegisterationForm()
		.clickOnSignUpRegisteration()
		.waitForPageLoad(3000)
		.enterUserId("Deepika123")
		.enterPassword("Deepika@123")
		.enterConfirmPassword("Depika@123")
		.selectSecurityQuestion("2")
		.enterSecurityAnswer("Ganga hospital")
		.enterUserName("Deepika")
		.selectOnGender("F")
		.enterUserDesignation("software engineer")
		.enterUserEmailId("deepikavenkatesh04@gmail.com")
		.enterUserMobile("9876543210")
		.enterUserPhone("244680")
		.enterName("Deepika")
		.enterCapacity("2")
		.waitForPageLoad(2000)
		.enterAddress("6,thirumalai nagar,perungudi")
		.selectOnState("28")
		.waitForPageLoad(2000)
		.selectCity("4C")
		.selectAccomadionType("GH")
		.selectStarRating("3s")
		.enterEmail("deepikavenkatesh04@gmail.com")
		.enterMyContact("9876543211")
		.enterPhoneContact("244680")
		.enterName1("karthick")
		.enterAddress1("6,thirumalai nagar,perungudi")
		.waitForPageLoad(4000)
		.clickOnState1("28")
		.waitForPageLoad(2000)
		.clickOnCity1("CHENNAI")
		.enterEmailId("deepikavenkatesh04@gmail.com")
		.enterPhone1("9566432109")
		.enterMobile1("357901");
		
	
	}
		
}
