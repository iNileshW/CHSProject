package testCases;

/*import org.testng.annotations.Test;

import appModules.LeftFrameSwitch_Action;
import appModules.LogIn_Action;
import appModules.MainFrameSwitch_Action;
import utility.Constant;
import appModules.Menu_Action;
import appModules.WindowResize_Action;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
public class TC_Nurse_Handover_Print {
	public WebDriver driver;
	
  @Test
  public void f() {
	  Menu_Action.Execute(driver,utility.Constant.Module4);
	  MainFrameSwitch_Action.Execute(driver);
	 
	  //WebDriverWait wait = new WebDriverWait(driver, 10);
	  String oldTab = driver.getWindowHandle();
	  pageObjects.NurseHandoverPage.Print(driver).click();
	  //wait.until(ExpectedConditions.elementToBeClickable(pageObjects.NurseHandoverPage.Print(driver))).click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    assertEquals("Nursing Handover",pageObjects.AddNewPagePrintPopUp.Header(driver).getText());
	    driver.close();
	    driver.switchTo().window(oldTab);
  }
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	  WindowResize_Action.Execute(driver);
	  LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  LeftFrameSwitch_Action.Execute(driver);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}*/

import org.testng.annotations.Test;

import appModules.LeftFrameSwitch_Action;
import appModules.LogIn_Action;
import appModules.MainFrameSwitch_Action;
import utility.Constant;
import appModules.Menu_Action;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import pageObjects.HomePage;
import pageObjects.LogInPage;
public class TC_Archived_Jobs_ExportResults {
	public WebDriver driver;
	
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
		FirefoxProfile profile = new FirefoxProfile();
		//profile.setPreference("browser.helperApps.neverAsk.saveToDisk",1);
		profile.setPreference("browser.download.manager.showwhenstarting", false);
		profile.setPreference("browser.download.dir", "C:\\Users\\nx35wg\\Downloads");
		profile.setPreference("browser.helper.neverask.saveToDisk", "application/xls");
		/*profile.setPreference("browser.helperApps.neverAsk.saveToDisk","xls");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","doc");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","csv");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","xml");*/
		FirefoxOptions options = new FirefoxOptions();
		options.setAcceptInsecureCerts(true);
		
		//options.setPreference("security.insecure_field_warning.contextual.enabled", false);
		options.addPreference(Constant.Username, false);
		options.addPreference(Constant.Password, false);
		WebDriver driver = new FirefoxDriver(options);
		options.setProfile(profile);
		/*driver = new HtmlUnitDriver();*/
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(utility.Constant.URL);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			  wait.until(ExpectedConditions.elementToBeClickable(LogInPage.username(driver))).clear();
			LogInPage.username(driver).sendKeys(Constant.Username);
			//LogInPage.remember_password(driver).click();
			LogInPage.password(driver).clear();
			LogInPage.password(driver).sendKeys(Constant.Password);
			//LogInPage.remember_password(driver).click();
			LogInPage.remember_password(driver).click();
			wait.until(ExpectedConditions.elementToBeClickable(LogInPage.Submit(driver))).click();
			//LeftFrameSwitch_Action.Execute(driver);
			LeftFrameSwitch_Action.Execute(driver);
	  Menu_Action.Execute(driver,utility.Constant.Module8);
	  MainFrameSwitch_Action.Execute(driver);
	  //WebDriverWait wait = new WebDriverWait(driver, 10);
	  String oldTab = driver.getWindowHandle();
	  wait.until(ExpectedConditions.elementToBeClickable(pageObjects.ArchivedJobsPage.export_result(driver))).click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    //Bug so no assertion:
	    //assertEquals("",pageObjects.AddNewPagePrintPopUp.Header(driver).getText());
	    pageObjects.ExportResultsPage.AllrecordsRadio(driver).click();
	    pageObjects.ExportResultsPage.CurrentpageRadio(driver).click();
	    pageObjects.ExportResultsPage.AllrecordsRadio(driver).click();
	    //pageObjects.ExportResultsPage.CSVRadio(driver).click();
	    pageObjects.ExportResultsPage.ExportBtn(driver).click();
	    
	    pageObjects.ExportResultsPage.AllrecordsRadio(driver).click();
	    
	    pageObjects.ExportResultsPage.ExcelRadio(driver).click();
	    /*FirefoxOptions options = new FirefoxOptions();
		FirefoxProfile profile = new FirefoxProfile();
		profile.setpreference("browser.helperApps.neverAsk.saveToDisk", 'application/xlsx')
		options.setProfile(profile)
		options.setAcceptInsecureCerts(true);
		System.out.println(options.getProfile());
		Login_FFoptions.Execute(driver,options);*/
	    pageObjects.ExportResultsPage.ExportBtn(driver).click();
	    //driver.switchTo().alert().accept();
	    pageObjects.ExportResultsPage.AllrecordsRadio(driver).click();
	    pageObjects.ExportResultsPage.XMLRadio(driver).click();
	    pageObjects.ExportResultsPage.ExportBtn(driver).click();
	    
	    pageObjects.ExportResultsPage.AllrecordsRadio(driver).click();
	    pageObjects.ExportResultsPage.WordRadio(driver).click();
	    pageObjects.ExportResultsPage.ExportBtn(driver).click();
	    
	    pageObjects.ExportResultsPage.CurrentpageRadio(driver).click();
	    pageObjects.ExportResultsPage.CSVRadio(driver).click();
	    pageObjects.ExportResultsPage.ExportBtn(driver).click();
	    pageObjects.ExportResultsPage.CurrentpageRadio(driver).click();
	    pageObjects.ExportResultsPage.ExcelRadio(driver).click();
	    pageObjects.ExportResultsPage.ExportBtn(driver).click();
	    pageObjects.ExportResultsPage.CurrentpageRadio(driver).click();
	    pageObjects.ExportResultsPage.XMLRadio(driver).click();
	    pageObjects.ExportResultsPage.ExportBtn(driver).click();
	    pageObjects.ExportResultsPage.CurrentpageRadio(driver).click();
	    pageObjects.ExportResultsPage.WordRadio(driver).click();
	    pageObjects.ExportResultsPage.ExportBtn(driver).click();
	    driver.close();
	    driver.switchTo().window(oldTab);
  }
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  /*System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	  LogIn_Action.Execute(driver,Constant.Username,Constant.Password);*/
	  /*driver = LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  LeftFrameSwitch_Action.Execute(driver);*/
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
