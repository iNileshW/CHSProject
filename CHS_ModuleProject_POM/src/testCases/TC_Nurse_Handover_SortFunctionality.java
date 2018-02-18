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
public class TC_Nurse_Handover_SortFunctionality {
	public WebDriver driver;
	
  @Test
  public void f() {
	  
	  HomePage.Nurse_Handover(driver).click();
		
	  Menu_Action.Execute(driver,utility.Constant.Module4);
	  MainFrameSwitch_Action.Execute(driver);
	  pageObjects.NurseHandoverPage.Ward(driver).click();
	  pageObjects.NurseHandoverPage.Ward(driver).click();
	  pageObjects.NurseHandoverPage.Patient_Name(driver).click();
	  pageObjects.NurseHandoverPage.Patient_Name(driver).click();
	  pageObjects.NurseHandoverPage.Sex(driver).click();
	  pageObjects.NurseHandoverPage.Sex(driver).click();
	  pageObjects.NurseHandoverPage.Code(driver).click();
	  pageObjects.NurseHandoverPage.Code(driver).click();
	  pageObjects.NurseHandoverPage.Diagnosis(driver).click();
	  pageObjects.NurseHandoverPage.Diagnosis(driver).click();
	  pageObjects.NurseHandoverPage.Allergies(driver).click();
	  pageObjects.NurseHandoverPage.Allergies(driver).click();
	  pageObjects.NurseHandoverPage.Nurses(driver).click();
	  pageObjects.NurseHandoverPage.Nurses(driver).click();
	  pageObjects.NurseHandoverPage.SS(driver).click();
	  pageObjects.NurseHandoverPage.SS(driver).click();
	  pageObjects.NurseHandoverPage.Notes(driver).click();
	  pageObjects.NurseHandoverPage.Notes(driver).click();
  }
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  /*System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	  WindowResize_Action.Execute(driver);
	  LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  LeftFrameSwitch_Action.Execute(driver);*/
	  driver = LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  LeftFrameSwitch_Action.Execute(driver);
	  WindowResize_Action.Execute(driver);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
