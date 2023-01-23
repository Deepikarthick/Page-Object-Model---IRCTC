package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FTRRegisterationPage extends GenericWrappers {

	public  FTRRegisterationPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public FTRRegisterationPage  enterUserId(String data) {
		enterByXpath(prop.getProperty("FTRRegisterationPage.enterUserId.XPath"), data);
		return this;
	}
	
	public FTRRegisterationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("FTRRegisterationPage.enterPassword.XPath"), data);
		return this;
	}
	
	
	public FTRRegisterationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("FTRRegisterationPage.enterConfirmPassword.XPath"), data);
		return this;
	}
	
	
	public FTRRegisterationPage clickOnSecques(String value) {
		selectvaluebyxpath(prop.getProperty("FTRRegisterationPage.clickOnSecques.XPath"), value);
		return this;
	}
	
	public FTRRegisterationPage enterSecurityAnswer(String data) {
		enterByXpath(prop.getProperty("FTRRegisterationPage.enterSecurityAnswer.XPath"), data);
		return this;
	}
	
	public FTRRegisterationPage clickOnDateOfBirth() {
		clickByXpath(prop.getProperty("FTRRegisterationPage.clickOnDateOfBirth.XPath"));
		return this;
	}
	public FTRRegisterationPage selectMonth(String value) {
		selectVisibileTextByxpath(prop.getProperty("FTRRegisterationPage.selectMonth.XPath"), value);
		return this;
	}
	public FTRRegisterationPage selectYear(String value) {
		selectVisibileTextByxpath(prop.getProperty("FTRRegisterationPage.selectYear.XPath"), value);
		return this;
	}
	
	public FTRRegisterationPage clickOnDate() {
		clickByXpath(prop.getProperty("FTRRegisterationPage.clickOnDate.XPath"));
		return this;
	}
	public FTRRegisterationPage clickOnGender() {
		clickByXpath(prop.getProperty("FTRRegisterationPage.clickOnGender.XPath"));
		return this;
	}
	
	public FTRRegisterationPage clickOnMartialStatus() {
		clickByXpath(prop.getProperty("FTRRegisterationPage.clickOnMartialStatus.XPath"));
		return this;
	}
	
	public FTRRegisterationPage enteremailId(String data) {
		enterByXpath(prop.getProperty("FTRRegisterationPage.enteremailId.XPath"), data);
		return this;
	}
	
	public FTRRegisterationPage selectOccupation(String value) {
		selectvaluebyxpath(prop.getProperty("FTRRegisterationPage.selectOccupation.XPath"), value);
		return this;
	}
	public FTRRegisterationPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("FTRRegisterationPage.enterFirstName.XPath"), data);
		return this;
	}
	
	public FTRRegisterationPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("FTRRegisterationPage.enterMiddleName.XPath"), data);
		return this;
	}
	
	public FTRRegisterationPage enterLastNmae(String data) {
		enterByXpath(prop.getProperty("FTRRegisterationPage.enterLastNmae.XPath"), data);
		return this;
	}
	
	public FTRRegisterationPage selectNationality(String value) {
		selectvaluebyxpath(prop.getProperty("FTRRegisterationPage.selectNationality.XPath"), value);
		return this;
	}
	
	public FTRRegisterationPage enterFlatNo(String data) {
		enterByXpath(prop.getProperty("FTRRegisterationPage.enterFlatNo.XPath"), data);
		return this;
	}
	
	public FTRRegisterationPage enterStreet(String data) {
		enterByXpath(prop.getProperty("FTRRegisterationPage.enterStreet.XPath"), data);
		return this;
	}
	
	public FTRRegisterationPage enterArea(String data) {
		enterByXpath(prop.getProperty("FTRRegisterationPage.enterArea.XPath"), data);
		return this;
	}
	
	public FTRRegisterationPage selectCountry(String value) {
		selectvaluebyxpath(prop.getProperty("FTRRegisterationPage.selectCountry.XPath"), value);
		return this;
	}
	
	public FTRRegisterationPage enterMobile(String data) {
		enterByXpath(prop.getProperty("FTRRegisterationPage.enterMobile.XPath"), data);
		return this;
	}
	
	public FTRRegisterationPage scrollingDown()  {
	    keyScrollDown();
		return this;
	}
	
	public FTRRegisterationPage enterPincode(String data) {
		enterByXpath(prop.getProperty("FTRRegisterationPage.enterPincode.XPath"), data);
		return this;
	}
	
	//public FTRRegisterationPage selectTown(String value) {
		//selectvaluebyxpath("//select[@id='city']", value);
		//return this;
//	}
	
	//public FTRRegisterationPage selectState(String value) {
	//	selectvaluebyxpath("//select[@name='state']", value);
	//	return this;
	//}
	
	public FTRRegisterationPage selectPostOffice(String value) {
		selectvaluebyxpath(prop.getProperty("FTRRegisterationPage.selectPostOffice.XPath"), value);
		return this;
	}
	
	public FTRRegisterationPage clickOnSameAddress() {
		clickByXpath(prop.getProperty("FTRRegisterationPage.clickOnSameAddress.XPath"));
		return this;
	}
	
	public FTRRegisterationPage enterFlatNoOffice(String data) {
		enterByXpath(prop.getProperty("FTRRegisterationPage.enterFlatNoOffice.XPath"), data);
		return this;
	}
	
	public FTRRegisterationPage enterStreetOffice(String data) {
		enterByXpath(prop.getProperty("FTRRegisterationPage.enterStreetOffice.XPath"), data);
		return this;
	}
	
	public FTRRegisterationPage enterAreaOffice(String data) {
		enterByXpath(prop.getProperty("FTRRegisterationPage.enterAreaOffice.XPath"), data);
		return this;
	}
	
	public FTRRegisterationPage selectCountryOffice(String value) {
		selectvaluebyxpath(prop.getProperty("FTRRegisterationPage.selectCountryOffice.XPath"), value);
		return this;
	}
	public FTRRegisterationPage enterMobileOffice(String data) {
		enterByXpath(prop.getProperty("FTRRegisterationPage.enterMobileOffice.XPath"), data);
		return this;
	}
	
	public FTRRegisterationPage enterPincodeOffice(String data) {
		enterByXpath(prop.getProperty("FTRRegisterationPage.enterPincodeOffice.XPath"), data);
		return this;
	}
	
	public FTRRegisterationPage selectCityOffice(String value) {
		selectvaluebyxpath(prop.getProperty("FTRRegisterationPage.selectCityOffice.XPath"), value);
		return this;
	}
	
	public FTRRegisterationPage selectStateOffice(String value) {
		selectvaluebyxpath(prop.getProperty("FTRRegisterationPage.selectStateOffice.XPath"), value);
		return this;
	}
	
	public FTRRegisterationPage selectPostOffice1(String value) {
		selectvaluebyxpath(prop.getProperty("FTRRegisterationPage.selectPostOffice1.XPath"), value);
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
