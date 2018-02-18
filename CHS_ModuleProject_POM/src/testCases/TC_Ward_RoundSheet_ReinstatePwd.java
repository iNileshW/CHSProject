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
public class TC_Ward_RoundSheet_ReinstatePwd {
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
	  /*String oldTab = driver.getWindowHandle();
	  wait.until(ExpectedConditions.elementToBeClickable(pageObjects.JobsListPage.Print(driver))).click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    assertEquals("Current Jobs",pageObjects.JobsListAddNewPagePrintPopUp.CurrentJobs(driver).getText());
	    driver.close();
	    driver.switchTo().window(oldTab);*/
	  assertEquals("Change password",pageObjects.ChangePwd.changePwdPage(driver).getText());
	  pageObjects.ChangePwd.Back(driver).click();
	  //changing password to new
	  pageObjects.JobsListPage.CPassword(driver).click();
	  pageObjects.ChangePwd.opass(driver).clear();
	  pageObjects.ChangePwd.opass(driver).sendKeys("123456");
	  pageObjects.ChangePwd.cpass(driver).clear();
	  pageObjects.ChangePwd.cpass(driver).sendKeys("1234567");
	  pageObjects.ChangePwd.newpass(driver).clear();
	  pageObjects.ChangePwd.newpass(driver).sendKeys("1234567");
	  pageObjects.ChangePwd.Submit(driver).click();
	  assertEquals("Password was changed\nBack",pageObjects.ChangePwd.msgChangePwd(driver).getText());
	  pageObjects.ChangePwd.Back(driver).click();
	  
	  /*wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainFrame")); 
	  assertEquals("Current Jobs",pageObjects.JobsListAddNewPage.Add_New_Page(driver).getText());*/
	  
	  //changing password back
	  pageObjects.JobsListPage.CPassword(driver).click();
	  pageObjects.ChangePwd.opass(driver).clear();
	  pageObjects.ChangePwd.opass(driver).sendKeys("1234567");
	  pageObjects.ChangePwd.cpass(driver).clear();
	  pageObjects.ChangePwd.cpass(driver).sendKeys("123456");
	  pageObjects.ChangePwd.newpass(driver).clear();
	  pageObjects.ChangePwd.newpass(driver).sendKeys("123456");
	  pageObjects.ChangePwd.Submit(driver).click();
	  pageObjects.ChangePwd.Back(driver).click();
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
