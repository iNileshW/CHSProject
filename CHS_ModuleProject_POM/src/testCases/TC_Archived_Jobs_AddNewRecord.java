package testCases;

import org.testng.annotations.Test;

import appModules.LeftFrameSwitch_Action;
import appModules.LogIn_Action;
import appModules.MainFrameSwitch_Action;
import utility.Constant;
import appModules.Menu_Action;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
public class TC_Archived_Jobs_AddNewRecord {
	public WebDriver driver;
	
  @Test
  public void f() {
	  	
	  Menu_Action.Execute(driver,utility.Constant.Module8);
	  MainFrameSwitch_Action.Execute(driver);
	  pageObjects.ArchivedJobsPage.AddNew(driver).click();
	  //Press Save
	  pageObjects.ArchivedJobsAddNewPage.Save_Button(driver).click();
	  assertEquals("<<< Record was added >>>",pageObjects.ArchivedJobsAddNewPage.Record_Added_Msg(driver).getText());
  }
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
/*	  System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	  LogIn_Action.Execute(driver,Constant.Username,Constant.Password);*/
	  driver = LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  LeftFrameSwitch_Action.Execute(driver);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
