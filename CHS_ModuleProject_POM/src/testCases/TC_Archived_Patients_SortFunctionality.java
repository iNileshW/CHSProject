package testCases;

import org.testng.annotations.Test;

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
import pageObjects.HomePage;
public class TC_Archived_Patients_SortFunctionality {
	WebDriver driver;
	
  @Test
  public void f() {
	  //LeftFrameSwitch_Action.Execute(driver);
	  Menu_Action.Execute(driver,utility.Constant.Module8);
	  MainFrameSwitch_Action.Execute(driver);
	  
	  pageObjects.ArchivedJobsPage.Patient_Name(driver).click();
	  pageObjects.ArchivedJobsPage.Patient_Name(driver).click();
	  pageObjects.ArchivedJobsPage.Consultant(driver).click();
	  pageObjects.ArchivedJobsPage.Consultant(driver).click();
	  pageObjects.ArchivedJobsPage.Date(driver).click();
	  pageObjects.ArchivedJobsPage.Date(driver).click();
	  pageObjects.ArchivedJobsPage.Type(driver).click();
	  pageObjects.ArchivedJobsPage.Type(driver).click();
	  pageObjects.ArchivedJobsPage.Status(driver).click();
	  pageObjects.ArchivedJobsPage.Status(driver).click();
	  pageObjects.ArchivedJobsPage.Name(driver).click();
	  pageObjects.ArchivedJobsPage.Name(driver).click();
	  pageObjects.ArchivedJobsPage.Results(driver).click();
	  pageObjects.ArchivedJobsPage.Results(driver).click();
	  pageObjects.ArchivedJobsPage.Notes(driver).click();
	  pageObjects.ArchivedJobsPage.Notes(driver).click();
  }
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	 /* System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	  WindowResize_Action.Execute(driver);*/
	  //LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  driver = LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  LeftFrameSwitch_Action.Execute(driver);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
