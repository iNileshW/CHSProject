package testCases;

import org.testng.annotations.Test;

import appModules.LeftFrameSwitch_Action;
import appModules.LogIn_Action;
import appModules.MainFrameSwitch_Action;
import utility.Constant;
import appModules.Menu_Action;
import appModules.WindowResize_Action;

import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
public class TC_Archived_Patients_AddNewRecordReset {
	public WebDriver driver;
	
  @Test
  public void f() {
	  //HomePage.Nurse_Handover(driver).click();
		
	  Menu_Action.Execute(driver,utility.Constant.Module9);
	  MainFrameSwitch_Action.Execute(driver);
	  pageObjects.ArchivedPatientsPage.AddNew(driver).click();
	  //Press Reset
	  pageObjects.ArchivedPatientsAddNewPage.Reset_Button(driver).click();
	  
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
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
