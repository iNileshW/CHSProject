package testCases;

import org.testng.annotations.Test;

import appModules.Driver_Action;
import appModules.LeftFrameSwitch_Action;
import appModules.LogIn_Action;
import appModules.MainFrameSwitch_Action;
import utility.Constant;
import appModules.Menu_Action;
import appModules.WindowResize_Action;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import pageObjects.HomePage;
public class TC_Jobs_List_AddNewRecord {
	public WebDriver driver;
	
  @Test
  public void f() {
	  HomePage.Jobs_List(driver).click();
		
	  Menu_Action.Execute(driver,utility.Constant.Module2);
	  MainFrameSwitch_Action.Execute(driver);
	  pageObjects.JobsListPage.AddNew(driver).click();
	  /*assertEquals("Current Jobs, Add new record",pageObjects.JobsListAddNewPage.Add_New_Page(driver).getText());
	  pageObjects.JobsListAddNewPage.Back_To_List(driver).click();*/
	  new Select(new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(pageObjects.JobsListAddNewPage.Consultant(driver)))).selectByIndex(10);
	  
	  // Display a date in day, month, year format
	  Date date = Calendar.getInstance().getTime();
	  DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
      String today = formatter.format(date);
      
	  pageObjects.JobsListAddNewPage.SelectDate(driver).clear();
	  pageObjects.JobsListAddNewPage.SelectDate(driver).sendKeys(today);
	  
	  new Select(new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(pageObjects.JobsListAddNewPage.Type(driver)))).selectByVisibleText("Bloods");
	  new Select(new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(pageObjects.JobsListAddNewPage.Status(driver)))).selectByVisibleText("To do");
	  pageObjects.JobsListAddNewPage.Name(driver).clear();
	  pageObjects.JobsListAddNewPage.Name(driver).sendKeys("Nilesh Automation Test8");
	  pageObjects.JobsListAddNewPage.Result(driver).clear();
	  pageObjects.JobsListAddNewPage.Result(driver).sendKeys("Pass");
	  pageObjects.JobsListAddNewPage.Notes(driver).clear();
	  pageObjects.JobsListAddNewPage.Notes(driver).sendKeys("Test");
	  
  }
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  //LogIn_Action.Execute();
	  /*System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	  LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  LeftFrameSwitch_Action.Execute(driver);*/
	  /*System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	  LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  WebDriverWait wait = new WebDriverWait(driver,10);
	  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("leftFrame"));*/
	  /*driver = LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  LeftFrameSwitch_Action.Execute(driver);
	  WindowResize_Action.Execute(driver);*/
	  driver = LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  LeftFrameSwitch_Action.Execute(driver);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
