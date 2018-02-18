package testCases;

import org.testng.annotations.Test;

import appModules.LogIn_Action;
import utility.Constant;
import appModules.Menu_Action;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import pageObjects.HomePage;
public class TC_Jobs_List_ChangePwdLogin {
	public WebDriver driver;
	
  @Test
  public void f() {
	  String Module = "Jobs List";
	  HomePage.Jobs_List(driver).click();
	 
	  Menu_Action.Execute(driver,Module);
	  driver.switchTo().defaultContent();
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainFrame")); 
	  /*assertEquals("Current Jobs",pageObjects.JobsListAddNewPage.Add_New_Page(driver).getText());*/
	  pageObjects.JobsListPage.CPassword(driver).click();
	  
	  assertEquals("Change password",pageObjects.ChangePwd.changePwdPage(driver).getText());
	  pageObjects.ChangePwd.Back(driver).click();
	  //changing password to new
	  pageObjects.JobsListPage.CPassword(driver).click();
	  pageObjects.ChangePwd.opass(driver).clear();
	  pageObjects.ChangePwd.opass(driver).sendKeys(Constant.Password);
	  pageObjects.ChangePwd.cpass(driver).clear();
	  /*pageObjects.ChangePwd.cpass(driver).sendKeys(Constant.cPassword);*/
	  pageObjects.ChangePwd.cpass(driver).sendKeys(Constant.Password);
	  pageObjects.ChangePwd.newpass(driver).clear();
	  /*pageObjects.ChangePwd.newpass(driver).sendKeys(Constant.cPassword);*/
	  pageObjects.ChangePwd.newpass(driver).sendKeys(Constant.Password);
	  pageObjects.ChangePwd.Submit(driver).click();
	  assertEquals("Password was changed\nBack",pageObjects.ChangePwd.msgChangePwd(driver).getText());
	  pageObjects.ChangePwd.Back(driver).click();
	  
	  /*wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainFrame")); 
	  assertEquals("Current Jobs",pageObjects.JobsListAddNewPage.Add_New_Page(driver).getText());*/
	  
	  //Logout & try Log in with old password
	  pageObjects.JobsListPage.LogOut(driver).click();
	  LogIn_Action.Execute(driver,Constant.Username,Constant.cPassword);
	  assertEquals("Invalid Login",pageObjects.LogInPage.validationmsg(driver).getText());
	  //Logout & Login
	  //pageObjects.JobsListPage.LogOut(driver).click();
	  /*LogIn_Action.Execute(driver,Constant.Username,Constant.cPassword);*/
	  LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  WebDriverWait wait1 = new WebDriverWait(driver,10);
	  wait1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("leftFrame"));
	  Menu_Action.Execute(driver,Module);
	  driver.switchTo().defaultContent();
	  WebDriverWait wait11 = new WebDriverWait(driver, 10);
	  wait11.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainFrame")); 
	  //pageObjects.JobsListChangePwd.Back(driver).click();
	  
	  //Validation check for different passwords
	  pageObjects.JobsListPage.CPassword(driver).click();
	  pageObjects.ChangePwd.opass(driver).clear();
	  /*pageObjects.ChangePwd.opass(driver).sendKeys(Constant.cPassword);*/
	  pageObjects.ChangePwd.opass(driver).sendKeys(Constant.Password);
	  pageObjects.ChangePwd.cpass(driver).clear();
	  /*pageObjects.ChangePwd.cpass(driver).sendKeys(Constant.cPassword);*/
	  pageObjects.ChangePwd.cpass(driver).sendKeys(Constant.Password);
	  pageObjects.ChangePwd.newpass(driver).clear();
	  pageObjects.ChangePwd.newpass(driver).sendKeys(Constant.cPassword);
	  pageObjects.ChangePwd.Submit(driver).click();
	  driver.switchTo().alert().dismiss();
	  
	  //Change password Back to original
	  pageObjects.ChangePwd.newpass(driver).clear();
	  pageObjects.ChangePwd.newpass(driver).sendKeys(Constant.Password);
	  pageObjects.ChangePwd.Submit(driver).click();
	  pageObjects.ChangePwd.Back(driver).click();
	  
	  //Logout & Login again
	  pageObjects.JobsListPage.LogOut(driver).click();
	  LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  WebDriverWait wait111 = new WebDriverWait(driver,10);
	  wait111.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("leftFrame"));
	  Menu_Action.Execute(driver,Module);
	  driver.switchTo().defaultContent();
	  WebDriverWait wait1111 = new WebDriverWait(driver, 10);
	  wait1111.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainFrame"));
  }
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	  LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  WebDriverWait wait = new WebDriverWait(driver,10);
	  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("leftFrame"));
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
