package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Reporting {
	
	public static ExtentReports report;
	
	public static ExtentTest test;
	
	public String testCaseName, testCaseDescription;
	
	public String author, category;
	
	public void startReport() {
		 report = new ExtentReports("./reports/Result3.html", false);
	}
	
	
	/**
	 * This method will take snapshot of the browser
	 * @author Basha - LibertyTestingCenter
	 */
	public abstract long takeSnap();
	
	public void startTest(String testName, String description) {
		 test = report.startTest(testName, description);
		 test.assignAuthor(author);
		 test.assignCategory(category);
	}
	
	
	public void reportStep(String details, String status) {
		
		long snapNumber = takeSnap();
		
		if(status.equals("pass")) {
			test.log(LogStatus.PASS, details +test.addScreenCapture("../reports/screenshots/"+snapNumber+".png"));
		} else if(status.equals("fail")) {
			test.log(LogStatus.FAIL, details +test.addScreenCapture("../reports/screenshots/"+snapNumber+".png"));
		} else if(status.equals("info")) {
			test.log(LogStatus.INFO, details +test.addScreenCapture("../reports/screenshots/"+snapNumber+".png"));
		} else if(status.equals("warning")) {
			test.log(LogStatus.WARNING, details +test.addScreenCapture("../reports/screenshots/"+snapNumber+".png"));
		}
	}
	
	
	public void reportStep(String details, String status, boolean snap) {
		
		if(!snap) {
		
		if(status.equals("pass")) {
			test.log(LogStatus.PASS, details);
		} else if(status.equals("fail")) {
			test.log(LogStatus.FAIL, details );
		} else if(status.equals("info")) {
			test.log(LogStatus.INFO, details);
		} else if(status.equals("warning")) {
			test.log(LogStatus.WARNING, details );
		}
		}
	}
	
	
	public void endTest() {
		report.endTest(test);
	}

	
	public void endReport() {
		report.flush();
	}
	
}
