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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import pageObjects.HomePage;
public class TC_Archived_Jobs_AddNew_Back {
	public WebDriver driver;
	
  @Test
  public void f() {
	  Menu_Action.Execute(driver,utility.Constant.Module8);
	  MainFrameSwitch_Action.Execute(driver);
	 
	  pageObjects.ArchivedJobsPage.AddNew(driver).click();
	  assertEquals("Archived Jobs, Add new record",pageObjects.ArchivedJobsAddNewPage.Add_New_Page(driver).getText());
	  pageObjects.JobsListAddNewPage.Back_To_List(driver).click();
	  
  }
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  driver = LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  LeftFrameSwitch_Action.Execute(driver);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
