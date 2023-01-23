package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers {

	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC004";
		testCaseDescription="IRCTC Registeration for Hotel Booking 1";
		author="Deepika";
		category="Smoke";
		url="https://www.irctc.co.in";
		
	}
	
	@Test
	public void irctcRegistration4() {
		
		new HomePage()
		.waitForPageLoad(3000)
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToNextWindow()
		.waitForPageLoad(5000)
		.clickOnHotelsIcon()
		.switchToNextWindow()
		.waitForPageLoad(5000)
		.clickOnLogin()
		.waitForPageLoad(6000)
		.clickOnGuestUserLoginIn()
		.waitForPageLoad(3000)
		.enterEmailId("deepikavenkatesh04@gmail.com")
		.enterMobileNumber("6369349061")
		.clickOnLogin1()
		.waitForPageLoad(5000)
		.enterDestinationPlace("chennai")
		.waitForPageLoad(3000)
		.clickOnDestination()
		.waitForPageLoad(3000)
		.clickOnCheckInDateSelection()
		.waitForPageLoad(4000)
		.clickOnCheckInDate()
		.waitForPageLoad(4000)
		.clickOnCheckoutDateSelection()
		.waitForPageLoad(4000)
		.clickOnCheckOutDate()
		.waitForPageLoad(3000)
		.clickOnRoomSelection()
		.clickOnRoomSelectionOption("1")
		.clickOnAdultSelectionOption("3")
		.waitForPageLoad(3000)
		.scrollDown()
		.waitForPageLoad(3000)
		.clickOnDone()
		.waitForPageLoad(5000)
		.scrollUp()
		.clickOnFindHotels()
		.waitForPageLoad(10000)
		.clickOnFirstDisplayedHotel()
		.waitForPageLoad(4000)
		.switchToNextWindow()
		.waitForPageLoad(3000)
		.getHotelName()
		.waitForPageLoad(2000)
		.getPrice()
		.clickOnContinueBook()
		.waitForPageLoad(5000)
		.selectTitle("2")
		.enterFirstName("Deepika")
		.enterLastName("karthick")
		.selectCountry("India")
		.waitForPageLoad(4000)
		.selectState("TN")
		.waitForPageLoad(4000)
		.selectGst("No")
		.waitForPageLoad(5000)
		.clickOnContinue()
		.waitForPageLoad(5000)
		.clickOnAgree()
		.waitForPageLoad(4000)
		.clickOnMakePayment()
		.waitForPageLoad(3000)
		.clickOnVerify()
		.verifyErrorMessageDisplayed("otp is required.");
			
	}

	
	

	
	
}
