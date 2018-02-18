package testCases;

import org.testng.annotations.Test;

import appModules.LeftFrameSwitch_Action;
import appModules.LogIn_Action;
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
public class TC_Jobs_List_SortFunctionality {
	public WebDriver driver;
	
  @Test
  public void f() {
	  String Module = "Jobs List";
	  HomePage.Jobs_List(driver).click();
	  
	  Menu_Action.Execute(driver,Module);
	  driver.switchTo().defaultContent();
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainFrame")); 
	  pageObjects.JobsListPage.Patient_Name(driver).click();
	  pageObjects.JobsListPage.Consultant(driver).click();
	  pageObjects.JobsListPage.Consultant(driver).click();
	  pageObjects.JobsListPage.Date(driver).click();
	  pageObjects.JobsListPage.Date(driver).click();
	  pageObjects.JobsListPage.Type(driver).click();
	  pageObjects.JobsListPage.Type(driver).click();
	  pageObjects.JobsListPage.Status(driver).click();
	  pageObjects.JobsListPage.Status(driver).click();
	  pageObjects.JobsListPage.Name(driver).click();
	  pageObjects.JobsListPage.Name(driver).click();
	  pageObjects.JobsListPage.Result(driver).click();
	  pageObjects.JobsListPage.Result(driver).click();
	  pageObjects.JobsListPage.Notes(driver).click();
	  pageObjects.JobsListPage.Notes(driver).click();
	  
  }
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	 /* System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	  LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  WebDriverWait wait = new WebDriverWait(driver,10);
	  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("leftFrame"));*/
	  driver = LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  LeftFrameSwitch_Action.Execute(driver);
	  WindowResize_Action.Execute(driver);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
