package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.FacebookHomePage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC007";
		testCaseDescription="To verify Facebook registion for the new user";
		author="Deepika";
		category="Smoke";
		url="https://www.facebook.com";
		
	}
	
	
	@Test
	public void facebookSignup() {
		
		 new FacebookHomePage()
		.clickOnCreateNewAccount()
		.waitForPageLoad(3000)
		.enterFirstName("Deepika")
		.enterLastName("karthick")
		.enterEmailAddress("deepikarthick@gmail.com")
		.reEnterEmailAddress("deepikarthick@gmail.com")
		.enterPassword("deepiAgarshan@4618")
		.selectDay("13")
		.selectMonth("Mar")
		.selectYear("1996")
		.clickOnGender();
		
		
	}

}
