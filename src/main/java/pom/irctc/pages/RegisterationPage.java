package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegisterationPage extends GenericWrappers {

	public  RegisterationPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public RegisterationPage enterUserName(String data) {
		enterByXpath(prop.getProperty("RegisterationPage.enterUserName.XPath"), data);
		return this;
	}
	
	public RegisterationPage enterUserPassword(String data){
		enterByXpath(prop.getProperty("RegisterationPage.enterUserPassword.XPath"), data);
		return this;
	}
	
	public RegisterationPage enterConfirmUserPassword(String data) {
		enterByXpath(prop.getProperty("RegisterationPage.enterConfirmUserPassword.XPath"), data);
		return this;
	}
	
	public RegisterationPage clickOnPreferredLanguage() {
		clickByXpath(prop.getProperty("RegisterationPage.clickOnPreferredLanguage.XPath"));
		return this;
	}
	
	public RegisterationPage clickOnPreferredLanguageOption() {
		clickByXpath(prop.getProperty("RegisterationPage.clickOnPreferredLanguageOption.XPath"));
		return this;
		
	}
	
	public RegisterationPage clickOnSecurityQuestion() {
		clickByXpath(prop.getProperty("RegisterationPage.clickOnSecurityQuestion.XPath"));
		return this;
	}
	
	public RegisterationPage clickOnSecurityQuestionOptions() {
		clickByXpath(prop.getProperty("RegisterationPage.clickOnSecurityQuestionOptions.XPath"));
		return this;
	}
	
	
	public RegisterationPage enterSecurityAnswer(String data) {
		enterByXpath(prop.getProperty("RegisterationPage.enterSecurityAnswer.XPath"), data);
		return this;

	}
	
	public RegisterationPage clickOnContinue() {
		clickByXpath(prop.getProperty("RegisterationPage.clickOnContinue.XPath"));
		return this;
		
	}
	
	public RegisterationPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("RegisterationPage.enterFirstName.XPath"), data);
		return this;
	}
	
	public RegisterationPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("RegisterationPage.enterMiddleName.XPath"), data);
		return this;
	}
	
	public RegisterationPage enterLastName(String data) {
		enterByXpath(prop.getProperty("RegisterationPage.enterLastName.XPath"), data);
		return this;
	}
	
	public RegisterationPage clickOnOccupation() {
		clickByXpath(prop.getProperty("RegisterationPage.clickOnOccupation.XPath"));
		return this;
	}	
	
	public RegisterationPage clickOnOccupationOptions() {
		clickByXpath(prop.getProperty("RegisterationPage.clickOnOccupationOptions.XPath"));
		return this;
	}
		
	public RegisterationPage clickOnDateOfBirth() {
		clickByXpath(prop.getProperty("RegisterationPage.clickOnDateOfBirth.XPath"));
		return this;
	}
	
	public RegisterationPage selectMonth(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegisterationPage.selectMonth.XPath"),value);
        return this;
	}
	
	public RegisterationPage selectyear(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegisterationPage.selectyear.XPath"), value);
        return this;
	}
	
	public RegisterationPage clickDate(String value) {
		clickByXpath(prop.getProperty("RegisterationPage.clickDate.XPath"));
        return this;
	}
	
	public RegisterationPage clickOnMartialStatus() {
		clickByXpath(prop.getProperty("RegisterationPage.clickOnMartialStatus.XPath"));
		return this;
	
	}
	public RegisterationPage selectNationality(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegisterationPage.selectNationality.XPath"), value);
		return this;
	}
	
	public RegisterationPage clickOnGender() {
		clickByXpath(prop.getProperty("RegisterationPage.clickOnGender.XPath"));
		return this;
	}
	
	public RegisterationPage enterEmail(String data) {
		enterByXpath(prop.getProperty("RegisterationPage.enterEmail.XPath"), data);
		return this;
	}
	
	public RegisterationPage enterMobile(String data) {
		enterByXpath(prop.getProperty("RegisterationPage.enterMobile.XPath"), data);
		return this;
	}
	
	public RegisterationPage selectNationality1(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegisterationPage.selectNationality1.XPath"), value);
		return this;
	}
	
	public RegisterationPage clickOnContinue1() {
		clickByXpath(prop.getProperty("RegisterationPage.clickOnContinue1.XPath"));
		return this;
	}
	
	public RegisterationPage enterResAddress1(String data) {
		enterByXpath(prop.getProperty("RegisterationPage.enterResAddress1.XPath"), data);
		return this;
	}
	
	public RegisterationPage enterResAddress2(String data) {
		enterByXpath(prop.getProperty("RegisterationPage.enterResAddress2.XPath"), data);
		return this;
	}

   public RegisterationPage enterResAddress3(String data) {
			enterByXpath(prop.getProperty("RegisterationPage.enterResAddress3.XPath"), data);
			return this;
   }
			
   public RegisterationPage enterResPinCode(String data) {
				enterByXpath(prop.getProperty("RegisterationPage.enterResPinCode.XPath"), data);
				return this;
   }
	
   public RegisterationPage enterState(String data) {
		enterByXpath(prop.getProperty("RegisterationPage.enterState.XPath"), data);
		return this;
  }
	
   public RegisterationPage selectCity(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegisterationPage.selectCity.XPath"), value);
		return this;
} 

   public RegisterationPage selectPostOffice(String value) {
		selectVisibileTextByxpath(prop.getProperty("RegisterationPage.selectPostOffice.XPath"), value);
		return this;
   }
	
   public RegisterationPage enterResPhone(String data) {
		enterByXpath(prop.getProperty("RegisterationPage.enterResPhone.XPath"), data);
		return this;
	}
   
   public RegisterationPage clickOnCopyResidenceAddress() {
	   clickByXpath(prop.getProperty("RegisterationPage.clickOnCopyResidenceAddress.XPath"));
	   return this;
   }
   
   public RegisterationPage enterOffAddress1(String data) {
	   enterByXpath(prop.getProperty("RegisterationPage.enterOffAddress1.XPath"), data);
	   return this;
   }
	
   public RegisterationPage enterOffAddress2(String data) {
	   enterByXpath(prop.getProperty("RegisterationPage.enterOffAddress2.XPath"), data);
	   return this;
   }
	
   public RegisterationPage enterOffAddress3(String data) {
	   enterByXpath(prop.getProperty("RegisterationPage.enterOffAddress3.XPath"), data);
	   return this;
   }
   
   public RegisterationPage clickOnCountry() {
	   clickByXpath(prop.getProperty("RegisterationPage.clickOnCountry.XPath"));
	   return this;
   }
   
   public RegisterationPage clickOnCountryOptions() {
	   clickByXpath(prop.getProperty("RegisterationPage.clickOnCountryOptions.XPath"));
	   return this;
   }
   
   public RegisterationPage enterOffPinCode(String data) {
	   enterByXpath(prop.getProperty("RegisterationPage.enterOffPinCode.XPath"), data);
	   return this;
   }
	
   public RegisterationPage enterOffState(String data) {
	   enterByXpath(prop.getProperty("RegisterationPage.enterOffState.XPath"), data);
	   return this;
   }
   
   public RegisterationPage enterOffCity(String data) {
	   enterByXpath(prop.getProperty("RegisterationPage.enterOffCity.XPath"), data);
	   return this;
   }
   
   public RegisterationPage enterOffPostOff(String data) {
	  enterByXpath(prop.getProperty("RegisterationPage.enterOffPostOff.XPath"), data);
	   return this;
   }
   
   public RegisterationPage enterOffPhone(String data) {
	   enterByXpath(prop.getProperty("RegisterationPage.enterOffPhone.XPath"), data);
	   return this;
   }
   
  
	
	
	
	
	
	
	
	
	
	
}
