package testCases;

import org.testng.annotations.Test;

import appModules.LeftFrameSwitch_Action;
import appModules.LogInEntry_Nologin_Action;
import appModules.LogInEntry_Yeslogin_Action;
import appModules.LogIn_Action;
import appModules.LogIn_Secure_Action;
import appModules.LogIn_User_Action;
import appModules.MainFrameSwitch_Action;
import utility.Constant;
import appModules.Menu_Action;
import appModules.WindowResize_Action;
import pageObjects.LogInPage;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;


public class TC_Archived_Patients_ChangePwdLogin {
	public WebDriver driver;
	
  @Test
  public void f() {
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  Menu_Action.Execute(driver,utility.Constant.Module9);
	  MainFrameSwitch_Action.Execute(driver);
	 
	  pageObjects.ArchivedJobsPage.CPassword(driver).click();
	  
	  assertEquals("Change password",pageObjects.ChangePwd.changePwdPage(driver).getText());
	  pageObjects.ChangePwd.Back(driver).click();
	  //changing password to new
	  pageObjects.ArchivedJobsPage.CPassword(driver).click();
	  pageObjects.ChangePwd.opass(driver).clear();
	  pageObjects.ChangePwd.opass(driver).sendKeys(Constant.Password);
	  pageObjects.ChangePwd.cpass(driver).clear();
	  pageObjects.ChangePwd.cpass(driver).sendKeys(Constant.Password);
	  pageObjects.ChangePwd.newpass(driver).clear();
	  pageObjects.ChangePwd.newpass(driver).sendKeys(Constant.Password);
	  pageObjects.ChangePwd.Submit(driver).click();
	  assertEquals("Password was changed\nBack",pageObjects.ChangePwd.msgChangePwd(driver).getText());
	  pageObjects.ChangePwd.Back(driver).click();
	  
	  //Logout & try Log in with old password
	  pageObjects.ArchivedJobsPage.LogOut(driver).click();
	  driver.close();
	  /*LogInEntry_Nologin_Action.Execute(Constant.Username,Constant.cPassword);*/
	  //LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
		
	  
	  //Logout & Login
	  //pageObjects.JobsListPage.LogOut(driver).click();
	  driver = LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  LeftFrameSwitch_Action.Execute(driver);
	  Menu_Action.Execute(driver,utility.Constant.Module9);
	  MainFrameSwitch_Action.Execute(driver);
	  //pageObjects.JobsListChangePwd.Back(driver).click();
	  
	  //Validation check for different passwords
	  pageObjects.JobsListPage.CPassword(driver).click();
	  pageObjects.ChangePwd.opass(driver).clear();
	  pageObjects.ChangePwd.opass(driver).sendKeys(Constant.Password);
	  pageObjects.ChangePwd.cpass(driver).clear();
	  pageObjects.ChangePwd.cpass(driver).sendKeys(Constant.cPassword);
	  pageObjects.ChangePwd.newpass(driver).clear();
	  pageObjects.ChangePwd.newpass(driver).sendKeys(Constant.Password);
	  pageObjects.ChangePwd.Submit(driver).click();
	  driver.switchTo().alert().dismiss();
	  
	  //Change password Back to original
	  pageObjects.ChangePwd.cpass(driver).clear();
	  pageObjects.ChangePwd.cpass(driver).sendKeys(Constant.Password);
	  pageObjects.ChangePwd.Submit(driver).click();
	  pageObjects.ChangePwd.Back(driver).click();
	  
	  //Logout & Login again
	  pageObjects.ArchivedPatientsPage.LogOut(driver).click();
	  driver.close();
	  driver = LogIn_Secure_Action.Execute(Constant.Username,Constant.Password);
	  LeftFrameSwitch_Action.Execute(driver);
	  Menu_Action.Execute(driver,utility.Constant.Module9);
	  MainFrameSwitch_Action.Execute(driver);
  }
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	 /* System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	  WindowResize_Action.Execute(driver);*/
	  //driver = LogIn_Secure_Action.Execute(Constant.Username,Constant.Password);
	  driver = LogIn_Action.Execute(driver, Constant.Username,Constant.Password);
	  LeftFrameSwitch_Action.Execute(driver);
	  WindowResize_Action.Execute(driver);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
