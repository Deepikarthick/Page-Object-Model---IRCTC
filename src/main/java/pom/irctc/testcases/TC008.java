package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.PhpTravelsPage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers {
	
	@BeforeClass	
public void beforeClass() {
		
		testCaseName="TC008";
		testCaseDescription="PHP Travels registration";
		author="Deepika";
		category="Smoke";
		url="https://www.phptravels.org/register.php";
		
	}
	
	  
	@Test
	public void PhpTravels() {
	
	new PhpTravelsPage()
	
	.waitForPageLoad(4000)
	.enterFirstName("Deepika")
	.enterLastName("karthick")
	.enterEmailAddress("deepikavenkatesh04@gmail.com")
	.enterPhoneNumber("9876543210")
	.enterCompanyName("ABC Technologies")
	.enterInputAddress1("6,thiru nagar")
	.enterInputAddress2("perungudi")
	.enterCity("chennai")
	.enterState("Tamil nadu")
	.enterPostcode("600096")
	.selectCountry("India")
	.enterMobileNumber("9876543120")
	.enterNewPassword("Deepika@123")
	.enterConfirmPassword("Deepika@123");
		
}	
	
}
