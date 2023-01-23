package wrappers;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.SysexMessage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;


public  class GenericWrappers extends Reporting implements Wrappers {
	
  public static RemoteWebDriver driver;
  
  public static Properties prop;
  
  	public void loadObjects() {
  		
  		try {
  			 prop = new Properties();
  			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  		
  	}
  	
  	public void unloadObjects() {
  		prop=null;
  	}
	
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				 driver = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivrers/IEDriverServer.exe");
				 driver = new InternetExplorerDriver();
			}
			
			driver.manage().window().maximize();
			driver.get(url); 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//System.out.println("The browser "+browser+" is launced with the given url "+url+" successfully");
			
			reportStep("The browser "+browser+" is launced with the given url "+url+" successfully", "pass");
			
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("the browser "+browser+" is not launced due to session not created error");
			reportStep("The browser "+browser+" is not launced due to session not created error", "fail");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("the browser "+browser+" is not launced as url doesnt contain http/https");
			reportStep("The browser "+browser+" is not launced as url doesnt contain http/https", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("the browser "+browser+" is not launced due to unknown error");
			reportStep("The browser "+browser+" is not launced due to unknown error", "fail");
		}
		
		}
		
	
	
	
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementById(idValue).sendKeys(data);
			
			//System.out.println("The element with id "+idValue+" is entered with data "+data);
			reportStep("The element with id "+idValue+" is entered with data "+data, "Pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idValue+"is not found in the dom");
			reportStep("The element with id "+idValue+"is not found in the dom", "fail");
			
			}catch (ElementNotVisibleException e) {
			// TODO: handle exception
				//System.err.println("The element with the id "+idValue+" is not visible in the application");
				reportStep("The element with the id "+idValue+" is not visible in the application", "fail");
				
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+idValue+" is not interactable in the application");
			reportStep("The element with the id "+idValue+" is not interactable in the application", "fail");
			
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+idValue+" is not stable in the application");
			reportStep("The element with the id "+idValue+" is not stable in the application", "fail");
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with the id "+idValue+" is not entered with the data "+data+" due to unknown error");
			reportStep("The element with the id "+idValue+" is not entered with the data "+data+" due to unknown error", "fail");
		}
		//finally {
			//takeSnap();
		//}
		
	}

	
	
	
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
	
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			
			//System.out.println("The element with name "+nameValue+" is entered with data "+data);
			reportStep("The element with name "+nameValue+" is entered with data "+data, "Pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the name "+nameValue+" is not found in the dom");
			reportStep("The element with the name "+nameValue+" is not found in the dom", "fail");
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the name "+nameValue+" is not visible in the application");
			reportStep("The element with the name "+nameValue+" is not visible in the application", "fail");
			
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the name "+nameValue+" is not interactable in the application");
			reportStep("The element with the name "+nameValue+" is not interactable in the application", "fail");
			
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the name "+nameValue+" is not stable in the application");
			reportStep("The element with the name "+nameValue+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the name "+nameValue+" is not entered with the data "+data+" due to unknown error");
			reportStep("The element with the name "+nameValue+" is not entered with the data "+data+" due to unknown error", "fail");
		}
		//finally {
			//takeSnap();
		//}
			
	}
	
	
	
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
	
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data, Keys.TAB);
			
			//System.out.println("The element with the xpath "+xpathValue+" is entered with the "+data);
			reportStep("The element with the xpath "+xpathValue+" is entered with the "+data, "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//System.err.println("The element with the xpath "+xpathValue+" is not found in the dom");
		reportStep("The element with the xpath "+xpathValue+" is not found in the dom", "fail");
		
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathValue+" is not visible in the application");
			reportStep("The element with the xpath "+xpathValue+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathValue+" is not interactable in the application");
			reportStep("The element with the xpath "+xpathValue+" is not interactable in the application", "fail");
			
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("the element with the xpath "+xpathValue+" is not stable in the application");
			reportStep("The element with the xpath "+xpathValue+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathValue+" is not entered with the data "+data+" due to unknown error");
			reportStep("The element with the xpath "+xpathValue+" is not entered with the data "+data+" due to unknown error", "fail");
		}
		//finally {
			//takeSnap();
		//}
		
	}

	
	
	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		
		try {
			String actualTitle = driver.getTitle(); 
			 if(title.equals(actualTitle)) {
				// System.out.println("The title of the page "+actualTitle+" is matched with the expected "+title);
				 reportStep("The title of the page "+actualTitle+" is matched with the expected "+title, "pass");
			 }else {
				// System.out.println("The title of the page "+actualTitle+"  is not  matched with the expected "+title );
				 reportStep("The title of the page "+actualTitle+"  is not  matched with the expected "+title, "fail");
			 }
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The title of the page "+title+" is not verified due to unknown error");
			reportStep("The title of the page "+title+" is not verified due to unknown error", "fail");
		}
		//finally {
			//takeSnap();
		//}
		
		}

	
	
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		
		
		try {
			String actualText = driver.findElementById(id).getText();
			
         if(text.equals(actualText)) {
			//System.out.println("The element with the id "+id+" is holding the text "+actualText+" is matched with the expected text "+text);
			reportStep("The element with the id "+id+" is holding the text "+actualText+" is matched with the expected text "+text, "pass");
           }else {
			  // System.err.println("The element with the id "+id+" is holding the text "+actualText+" is noy matched with the expected text "+text);
			   reportStep("The element with the id "+id+" is holding the text "+actualText+" is noy matched with the expected text "+text, "fail");
         }
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the id "+id+" is not found in the dom");
			reportStep("The element with the id "+id+" is not found in the dom", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not visible in the application");
			reportStep("The element with the id "+id+" is not visible in the application", "fail");
			
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not interactable in the application");
			reportStep("The element with the id "+id+" is not interactable in the application", "fail");
			
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not stable in the application");
			reportStep("The element with the id "+id+" is not stable in the application", "fail");
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" holding the text "+text+" is not verified due to unknown error");
			reportStep("The element with the id "+id+" holding the text "+text+" is not verified due to unknown error", "fail");
			
		}
		//finally {
			//takeSnap();
		//}
		
		}

	
	
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
	
		
	    try {
			String actualText1 = driver.findElementByXPath(xpath).getText();
			
			if(actualText1.equals(text)) {
				//System.out.println("The element with the xpath "+xpath+" holding the text "+actualText1+" is matched with the expected text "+text);
				reportStep("The element with the xpath "+xpath+" holding the text "+actualText1+" is matched with the expected text "+text, "pass");
				
			}else {
					//System.err.println("The element with the xpath "+xpath+"holdind the text "+actualText1+" is not matched with the expected text "+text);
					reportStep("The element with the xpath "+xpath+"holdind the text "+actualText1+" is not matched with the expected text "+text, "fail");
				}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//System.err.println("The element with the xpath "+xpath+" is not found in the dom");	
		reportStep("The element with the xpath "+xpath+" is not found in the dom", "fail");
		
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpath+" is not visible in the application");
			reportStep("The element with the xpath "+xpath+" is not visible in the application", "fail");
			
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpath+" is  not interactable in the application");
			reportStep("The element with the xpath "+xpath+" is  not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpath+" is  not stable in the application");
			reportStep("The element with the xpath "+xpath+" is  not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with the xpath "+xpath+" holding the text "+text+" is not verified due to unknown error");
			reportStep("The element with the xpath "+xpath+" holding the text "+text+" is not verified due to unknown error", "fail");
		}
	    }
	

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
		try {
			String actualText2 = driver.findElementByXPath(xpath).getText();
			if(actualText2.contains(actualText2)) {
				//System.out.println("The element with the xpath "+xpath+" holding the text "+actualText2+" is matched with the expected text "+text);
				reportStep("The element with the xpath "+xpath+" holding the text "+actualText2+" is matched with the expected text "+text, "pass");
			}else {
				//System.err.println("The element with the xpath "+xpath+" holding the text "+actualText2+" is not matched with the expected text "+text);
				reportStep("The element with the xpath "+xpath+" holding the text "+actualText2+" is not matched with the expected text "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the xpath "+xpath+" is not found in the dom");
			reportStep("The element with the xpath "+xpath+" is not found in the dom", "fail");
		
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpath+" is not visible in the appication");
			reportStep("The element with the xpath "+xpath+" is not visible in the appication","fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpath+" is not interactable in the application");
			reportStep("The element with the xpath "+xpath+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpath+" is not stable in the application");
			reportStep("The element with the xpath "+xpath+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpath+" holding the text "+text+" is not verified due to unknown error");
			reportStep("The element with the xpath "+xpath+" holding the text "+text+" is not verified due to unknown error", "fail");
		}
		//finally {
			//takeSnap();
		//}
	}
	
	

	public void clickById(String id) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementById(id).click();
			//System.out.println("The element with the id "+id+" is clicked");
			reportStep("The element with the id "+id+" is clicked", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the id "+id+" is not found in the dom");
			reportStep("The element with the id "+id+" is not found in the dom", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not visible in the application");
			reportStep("The element with the id "+id+" is not visible in the application", "fail");
			}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
				
			//System.err.println("The element with the id "+id+" is not clickable in the appliction");
			reportStep("The element with the id "+id+" is not clickable in the appliction", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is  not stable in the application");
			reportStep("The element with the id "+id+" is  not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not clickable due to some unknown error");
			reportStep("The element with the id "+id+" is not clickable due to some unknown error", "fail");
		}
		//finally {
			//takeSnap();
		//}
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
	
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with the classname "+classVal+" is clicked");
			reportStep("The element with the classname "+classVal+" is clicked", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the classname "+classVal+" is not found in the dom");
			reportStep("The element with the classname "+classVal+" is not found in the dom", "fail");
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the classname "+classVal+" is not visible in the application");
			reportStep("The element with the classname "+classVal+" is not visible in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with the classame "+classVal+" is not clickable in the application");
			reportStep("The element with the classame "+classVal+" is not clickable in the application", "fail");
			
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the classname "+classVal+" is not stable in the application");
			reportStep("The element with the classname "+classVal+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the classname "+classVal+" is not clickable due to unknown error");
			reportStep("The element with the classname "+classVal+" is not clickable due to unknown error", "fail");
		}
		//finally {
			//takeSnap();
		//}
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with the name "+name+" is clicked");
			reportStep("The element with the name "+name+" is clicked", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the name "+name+" is not found in the dom");
			reportStep("The element with the name "+name+" is not found in the dom", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the name "+name+" is not visible in the application");
			reportStep("The element with the name "+name+" is not visible in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with the name "+name+" is not clickable in the application");
			reportStep("The element with the name "+name+" is not clickable in the applicatiom", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the name "+name+" is not stable in the application");
			reportStep("The element with the name "+name+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the name "+name+"is not clickable due to unknown error");
			reportStep("The element with the name "+name+"is not clickable due to unknown error", "fail");
		}
		//finally {
			//takeSnap();
		//}
		}

	
	
	public void clickByLink(String name) {
		// TODO Auto-generated method stub
	
		
			try {
				driver.findElementByLinkText(name).click();
				//System.out.println("The element with the link "+name+" is clicked");
				reportStep("The element with the link "+name+" is clicked", "pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with the link "+name+" is not found in the dom");
				reportStep("The element with the link "+name+" is not found in the dom", "fail");
			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with the link "+name+" is not visible in the application");
				reportStep("The element with the link "+name+" is not visible in the application", "fail");
			}catch (ElementClickInterceptedException e) {
				// TODO: handle exception
				//System.err.println("The element with the link "+name+" is not clickable in the application");
				reportStep("The element with the link "+name+" is not clickable in the application", "fail");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with the link "+name+" is  not stable in the application ");
				reportStep("The element with the link "+name+" is  not stable in the application ", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The element with the link "+name+" is not clickable due to unknown error");
				reportStep("The element with the link "+name+" is not clickable due to unknown error", "fail");
			}
			//finally {
				//takeSnap();
			//}
	
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with the link "+name+" is clicked");
			reportStep("The element with the link "+name+" is clicked", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//System.err.println("The element with the link "+name+" is not found in the dom");
			reportStep("The element with the link "+name+" is not found in the dom", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the link "+name+" is not visible in the application");
		    reportStep("The element with the link "+name+" is not visible in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with the link "+name+" is not clickable in the application");
			reportStep("The element with the link "+name+" is not clickable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the link "+name+" is not stable in the application");
			reportStep("The element with the link "+name+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the link "+name+" is not clickable due to unknown error");
			reportStep("The element with the link "+name+" is not clickable due to unknown error", "fail");
		}
		
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with the xpath "+xpathVal+" is clicked");
			reportStep("The element with the xpath "+xpathVal+" is clicked", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//System.err.println("The element with the xpath "+xpathVal+"is  not found in the dom");
			reportStep("The element with the xpath "+xpathVal+"is  not found in the dom", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
	   // System.err.println("The element with the xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with the xpath "+xpathVal+" is not visible in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			e.printStackTrace();
			//System.err.println("The element with the xpath "+xpathVal+" is not clickable in the application");
			reportStep("The element with the xpath "+xpathVal+" is not clickable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			e.printStackTrace();
			//System.err.println("The element with the xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with the xpath "+xpathVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with the xpath "+xpathVal+" is not stable in the application", "fail");
			}catch (WebDriverException e) {
			// TODO: handle exception
				e.printStackTrace();
			//System.err.println("The element with the xpath "+xpathVal+"is not clickable due to unknown error");
				reportStep("The element with the xpath "+xpathVal+"is not clickable due to unknown error", "fail");
		}
		//finally {
			//takeSnap();
		//}
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with the xpath "+xpathVal+" is clicked");
			reportStep("The element with the xpath "+xpathVal+" is clicked", "pass", false);
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//System.err.println("The element with the xpath "+xpathVal+" is not found in the dom");
			reportStep("The element with the xpath "+xpathVal+" is not found in the dom", "fail", false);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with the xpath "+xpathVal+" is not visible in the application", "fail", false);
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not clickable in the application");
			reportStep("The element with the xpath "+xpathVal+" is not clickable in the application", "fail", false);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with the xpath "+xpathVal+" is not stable in the application", "fail", false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with thexpath "+xpathVal+" is not clickable due to unknown error");
			reportStep("The element with thexpath "+xpathVal+" is not clickable due to unknown error","fail", false);
		}
		
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String actualText3 = null;
		 try {
		  actualText3 = driver.findElementById(idVal).getText();
		//System.out.println("The element with the id "+idVal+" is entered with text "+actualText3);
		  reportStep("The element with the id "+idVal+" is entered with text "+actualText3,"pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the id "+idVal+" is not found in the dom");
			reportStep("The element with the id "+idVal+" is not found in the dom", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+idVal+" is not visible in the application");
			reportStep("The element with the id "+idVal+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e2) {
				// TODO: handle exception
			//System.err.println("The element with the id "+idVal+" is not interactable in the application");
			reportStep("The element with the id "+idVal+" is not interactable in the application", "fail");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with the id "+idVal+" is not stable in the application");
				reportStep("The element with the id "+idVal+" is not stable in the application", "fail");
			}catch (WebDriverException e) {
			// TODO: handle exception
				//System.err.println("The element with the id "+idVal+" is not entered with text  due to unknown error");
				reportStep("The element with the id "+idVal+" is not entered with text  due to unknown error", "fail");
		}
		 
		 return actualText3;
	}
	
	

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String actualText4 = null;
		try {
			 actualText4 = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The element with the xpath "+xpathVal+" is entered with the "+actualText4);
			 reportStep("The element with the xpath "+xpathVal+" is getting the text", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the xpath "+xpathVal+" is found in the dom");
			reportStep("The element with the xpath "+xpathVal+" is found in the dom", "fail");
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with the xpath "+xpathVal+" is not visible in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with the xpath "+xpathVal+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath "+xpathVal+"is not entered with text due to unknown error");
			reportStep("The element with the xpath "+xpathVal+"is not getting the text due to unknown error", "fail");
		}
		//finally {
			//takeSnap();
		//}
		return actualText4;
	}
	
	
	

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
	
		 try {
			WebElement text = driver.findElementById(id);
			  Select sel = new Select(text);
			 sel.selectByVisibleText(value);
			//System.out.println("The element with the id "+id+"selects the dropdown visibletext"); 
			 reportStep("The element with the id "+id+"selects the dropdown visibletext", "pass");
			 
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the id "+id+" is not found in the dom");
			reportStep("The element with the id "+id+" is not found in the dom", "fail");
		
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not visible in the appication");
			reportStep("The element with the id "+id+" is not visible in the appication", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not selectable in the application");
			reportStep("The element with the id "+id+" is not selectable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not stable in the application");
			reportStep("The element with the id "+id+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not selecting the dropdown visibletext due to unknown error ");
			reportStep("The element with the id "+id+" is not selecting the dropdown visibletext due to unknown error ", "fail");
		}
		 //finally {
			//takeSnap();
		//}
	}


	
	
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement index = driver.findElementById(id);
			Select sel1 = new Select(index);
			sel1 .selectByIndex(value);
			//System.out.println("The element with the id "+id+" selected the dropdown selectbyindex");
			reportStep("The element with the id "+id+" selected the dropdown selectbyindex", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
	      //  System.err.println("The element with the id "+id+" is not found in the dom");
			reportStep("The element with the id "+id+" is not found in the dom", "fail");
		}catch (ElementNotVisibleException  e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is  not visible in the application");
			reportStep("The element with the id "+id+" is  not visible in the application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not selectable in the appication");
			reportStep("The element with the id "+id+" is not selectable in the appication", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not stable in the application");
			reportStep("The element with the id "+id+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not selecting the dropdown selectbyindex due to unknown error");
			reportStep("The element with the id "+id+" is not selecting the dropdown selectbyindex due to unknown error", "fail");
		}
		//finally {
			//takeSnap();
		//}
	}

	
	
	
	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		
		try {
			Set<String> allWinds = driver.getWindowHandles();
			
			for(String eachId : allWinds) 
			{
			driver.switchTo().window(eachId);
			break;
			}
			//System.out.println("Switching to parent window is done successfully ");
			reportStep("Switching to parent window is done successfully ", "pass");
			
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The window is not present in the application");
			reportStep("The window is not present in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Switching to parent window is failed due to unknown error ");
			reportStep("Switching to parent window is failed due to unknown error ", "fail");
		}
		//finally {
			//takeSnap();
		//}
		}

	
	
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		
		try {
			Set<String> allWinds = driver.getWindowHandles();
				
			for(String eachId : allWinds)
			{
			driver.switchTo().window(eachId);	
			}
			//System.out.println("switching to last window is done succesfully ");
			reportStep("switching to last window is done succesfully ", "pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The window is not present in the application");
			reportStep("The window is not present in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Switching to last window is failed due to unknown error ");
			reportStep("Switching to last window is failed due to unknown error ","fail");
		}
		//finally {
			//takeSnap();
		//}
		
	}

	
	public void acceptAlert() {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().alert().accept();
			//System.out.println("The alert is accepted");
			reportStep("The alert is accepted", "pass", false);
			
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert is not present in the application");
			reportStep("The alert is not present in the application", "fail", false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alerttext is not accepted due to unknown error");
			reportStep("The alerttext is not accepted due to unknown error", "fail", false);
		}
	}

	
	
	public void dismissAlert() {
		// TODO Auto-generated method stub
		
		
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The alert is dismissed");
			reportStep("The alert is dismissed", "pass", false);
			
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert is not present in the application");
			reportStep("The alert is not present in the application", "fail", false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert is not dismissed due to unknown error ");
			reportStep("The alert is not dismissed due to unknown error ", "fail", false);
		}
		
	}

	
	
	public String getAlertText() {
		// TODO Auto-generated method stub
		String alertText = null;
		 try {
			 alertText = driver.switchTo().alert().getText();
			//System.out.println("The text is captured from the alert");
			 reportStep("The text is captured from the alert", "pass", false);
			
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("the alert is not present in the application");
			reportStep("The alert is not present in the application", "fail", false);
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The alert is unhandled in the application");
			reportStep("The alert is unhandled in the application", "fail", false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert text is not captured due to unknown error");
			reportStep("The alert text is not captured due to unknown error", "fail", false);
		}
		 
		return alertText;
	}
	

	
	
	public long takeSnap()   {
		// TODO Auto-generated method stub
		
		long number = 0;
		   
		 try {
			 
			 
			number =  (long) (Math.floor(Math.random()*100000000)+100000);
			 
			 File temp = driver.getScreenshotAs(OutputType.FILE);
			  File dest = new File("./reports/screenshots/"+number+".png");
			FileUtils.copyFile(temp, dest);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//System.err.println("The I/O operations is interupted");
			reportStep("The I/O operations is interupted", "fail", false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Taking snap is not done due to unknown error");
			reportStep("Taking snap is not done due to unknown error", "fail", false);
		}
		 
		 return number;
	}

	
	
	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("The  active browser is closed successfully");
			reportStep("The  active browser is closed successfully", "pass", false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
		//System.err.println("The active browser is not closed due to unknown error");
			reportStep("The active browser is not closed due to unknown error", "fail", false);
		}
	}
	
	

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		
		try {
			driver.quit();
			//System.out.println("All the browser is closed successfully");
			reportStep("All the browser is closed successfully", "pass", false);
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
		//System.err.println("All the browers are not closed due to unknown error");
			reportStep("All the browers are not closed due to unknown error", "fail", false);
		}
		}




	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		
               try {
				Thread.sleep(time);
				//System.out.println("The interuption is done successfull");
				reportStep("Page loading is done sucessfully", "pass");
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			//System.err.println("The interruption is unsuccessfull");
				reportStep("Loading of page is unsuccessfull", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The interruption of the program is unsucessfull due to unknown error");
				reportStep("Loading of page is unsucessfull due to unknown error", "fail");
			}
	}




     public void defaultcontent() {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().defaultContent();
		   //System.out.println("switching to defaultcontent is done succesfully");
			reportStep("switching to defaultcontent is done succesfully", "pass");
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println(" switching to default content of the page is  unsuccessful due to unknown error");
			reportStep(" switching to default content of the page is  unsucessful due to unknown error", "fail");
		}
		//finally {
			//takeSnap();
		//}
	}




	public void selectvaluebyxpath(String xpath, String value) {
		// TODO Auto-generated method stub
		
         try {
			WebElement text1 = driver.findElementByXPath(xpath);
			Select sel2 = new Select(text1);
			sel2.selectByValue(value);
			 
		// System.out.println("The element with the xpath "+xpath+" selects the dropdown  by value");
			reportStep("The element with the xpath "+xpath+" selects the dropdown by value"+value, "pass");
			 
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
	    // System.err.println("The element with the xpath is not found in the dom");
			reportStep("The element with the xpath is not found in the dom", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath is not visible in the application");
			reportStep("The element with the xpath is not visible in the application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath is not selectable in the application");
			reportStep("The element with the xpath is not selectable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath is not stable in the application");
			reportStep("The element with the xpath is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			e.printStackTrace();
			//System.err.println("The element with the xpath is not selecting the dropdown value due to unknown error");
			reportStep("The element with the xpath is not selecting the dropdown value due to unknown error"+value, "fail");
		}
			//finally {
			//takeSnap();
		//}
		 
		 
	}




	public void selectVisibileTextByxpath(String xpath, String value) {
		// TODO Auto-generated method stub
	
		
		try {
			WebElement text2 = driver.findElementByXPath(xpath);
			Select sel3 = new Select(text2);
			sel3.selectByVisibleText(value);
			
			//System.out.println("The element with the xpath "+xpath+" selects the dropdown by visibletext" +value);
			reportStep("The element with the xpath "+xpath+" selects the dropdown by visibletext "+value, "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			 //System.err.println("The element with the xpath is not found in the dom");
			reportStep("The element with the xpath is not found in the dom", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath is not visible in the application");
			reportStep("The element with the xpath is not visible in the application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath is not selectable in the application");
			reportStep("The element with the xpath is not selectable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath is not stable in the application");
			reportStep("The element with the xpath is not stable in the application", "fail");
		}catch (WebDriverException e)
		{
		e.printStackTrace();	// TODO: handle exception
			System.err.println("The element with the xpath is not selecting the dropdown by visibleText due to unknown error");
			reportStep("The element with the xpath is not selecting the dropdown by visibleText due to unknown error" +value, "fail");
		}
		//finally {
			//takeSnap();
		//}
	}


	public void selectvaluebyid(String id, String value) {
		// TODO Auto-generated method stub
		
		
		try {
			WebElement text3 = driver.findElementById(id);
			Select sel4 = new Select(text3);
			sel4.selectByValue(value);
			//System.out.println("The element with the id "+id+" selects the dropdown by value");
			reportStep("The element with the id "+id+" selects the dropdown by value"+value, "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with the id is not found in the dom");
			reportStep("The element with the id is not found in the dom", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with the id is not visible in the dom");
			reportStep("The element with the id is not visible in the dom", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			// System.err.println("The element with the id is not selectable in the dom");
			reportStep("The element with the id is not selectable in the dom", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath is not stable in the dom");
			reportStep("The element with the xpath is not stable in the dom", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath is not selecting the dropdown by value due to unknown error");
			reportStep("The element with the xpath is not selecting the dropdown by value due to unknown error"+value,"fail");
		}
		//finally {
			//takeSnap();
		//}
	}




	public void keyScrollDown() {
		// TODO Auto-generated method stub
		
		
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
			
			//System.out.println("Scrolling down of the page is done successfully");
			reportStep("Scrolling down of the page is done successfully", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the xpath is not found in the dom");
			reportStep("The element with the xpath is not found in the dom", "fail");
		
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath is not visible in the application");
			reportStep("The element with the xpath is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath is not interactable in the application");
			reportStep("The element with the xpath is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath is not stable in the application");
			reportStep("The element with the xpath is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the xpath is not scrolling down the page due to unknown error");
			reportStep("The element with the xpath is not scrolling down the page due to unknown error", "fail");
		}
		//finally {
			//takeSnap();
		//}
	}




	public void switchFrame(String framevalue) {
		// TODO Auto-generated method stub
	
		
		try {
			driver.switchTo().frame(framevalue);
			//System.out.println("Successfully switched into the frame");
			reportStep("Successfully switched into the frame", "pass");
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("Switching to the frame is unsuccesfully);
			reportStep("Switching into the frame is unsucessfull", "fail");
			}
	}




	public void selectVisibleTextbyname(String name, String value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement text4 = driver.findElementByName(name);
			Select sel = new Select(text4);
			sel.selectByVisibleText(value);
			//System.out.println("The element with the name "+name+" selects the dropdown visibletext");
			reportStep("The element with the name "+name+" selects the dropdown visibletext"+value, "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the name is not found in the dom");	
			reportStep("The element with the name is not found in the dom", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the name is not visible in the application");
			reportStep("The element with the name is not visible in the application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with the name is not selectable in the application");
			reportStep("The element with the name is not selectable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the nmae is not stable in the application");
			reportStep("The element with the name is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the name is not selecting the dropdown by visibleText due to unknown error");
			reportStep("The element with the name is not selecting the dropdown by visibleText due to unknown error"+value, "fail");
		}
		//finally {
			//takeSnap();
		//}
		
	}




	public void selectvaluebyname(String name, String value) {
		// TODO Auto-generated method stub
		
		
		 try {
			WebElement text5 = driver.findElementByName(value);
			Select sel = new Select(text5);
			sel.selectByValue(value);
			// System.out.println("The element with the name "+name+" selects the dropdown value");
			reportStep("The element with the name "+name+" selects the dropdown value"+value, "pass");
			 	
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with the name is not found in the dom");
			reportStep("The element with the name is not found in the dom", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			 //System.err.println("The element with the name is not visible in the application");
			reportStep("The element with the name is not visible in the application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			// System.err.println("The element with the name is not selectable in the application");
			reportStep("The element with the name is not selectable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with the name is not stable in the application");
			reportStep("The element with the name is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The element with the name is not selecting the dropdown by value due to unknown error");
			reportStep("The element with the name is not selecting the dropdown by value due to unknown error"+value, "fail");
		}
		 //finally {
			//takeSnap();
		//}
	}




	public void verifyTextContainsById(String id, String text) {
		// TODO Auto-generated method stub
		
		
		try {
			String actualtext = driver.findElementById(id).getText();
			
			if(actualtext.contains(actualtext)) {
			//System.out.println("The element with the id  holding the text "+actualtext+" is matched with the expected text "+text);
				reportStep("The element with the id  holding the text "+actualtext+" is matched with the expected text "+text, "pass");
		}else {
			//System.err.println("The element with the id holding the text "+actualtext+" is not matched with the expected text "+text);
			reportStep("The element with the id holding the text "+actualtext+" is not matched with the expected text "+text, "fail");
		}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
	         // System.err.println("The element with the id "+id+" is not found in the dom");
			reportStep("The element with the id "+id+" is not found in the dom", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not visible in the application");
			reportStep("The element with the id "+id+" is not visible in the application", "fail");
		}catch(ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not interactable in the application");
			reportStep("The element with the id "+id+" is not interactable in the application", "fail");
			
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not stable in the application");
			reportStep("The element with the id "+id+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the id holding the text  is not matched with the text due to unknown error");
			reportStep("The element with the id holding the text  is not matched with the text due to unknown error", "fail");
			
		}
		//finally {
			//takeSnap();
		//}
	}


	public void refresh() {
		// TODO Auto-generated method stub
		
		
		try {
			driver.navigate().refresh();
			//System.out.println("The page is refreshed");
			reportStep("The page is refreshed", "pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
		  // System.err.println("The page is not refreshed due to unknown error");
			reportStep("The page is not refreshed due to unknown error", "fail");
		}
	}

	public void sendAlertText(String value) {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().alert().sendKeys(value);
			
			//System.out.println("Sending the alert text is successfull");
			reportStep("Sending the alert text is successfull", "pass", false);
			
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("No alert is present in the application");
			reportStep("No alert is present in the application", "fail", false);
		
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The alert is unhandled in the application");
			reportStep("The alert is unhandled in the application", "fail", false);
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Sending the alert text is unccessfull due to unknown error ");
			reportStep("Sending the alert text is unccessfull due to unknown error ", "fail", false);
		}
			
	}




	public void keyScrollUp() {
		// TODO Auto-generated method stub
		
	
	try {
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_UP);
		
		//System.out.println("Scrolling up of the page is done successfully");
		reportStep("Scrolling down of the page is done successfully", "pass");
		
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The element with the xpath is not found in the dom");
		reportStep("The element with the xpath is not found in the dom", "fail");
	
	}catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The element with the xpath is not visible in the application");
		reportStep("The element with the xpath is not visible in the application", "fail");
	}catch (ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The element with the xpath is not interactable in the application");
		reportStep("The element with the xpath is not interactable in the application", "fail");
	}catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The element with the xpath is not stable in the application");
		reportStep("The element with the xpath is not stable in the application", "fail");
	}catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The element with the xpath is not scrolling down the page due to unknown error");
		reportStep("The element with the xpath is not scrolling down the page due to unknown error", "fail");
	}
	//finally {
		//takeSnap();
	//}
}

	}


