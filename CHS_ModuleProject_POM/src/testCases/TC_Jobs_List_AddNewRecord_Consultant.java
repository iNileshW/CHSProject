package testCases;

import org.testng.annotations.Test;

import appModules.Driver_Close_Action;
import appModules.LeftFrameSwitch_Action;
import appModules.LogIn_Action;
import utility.Constant;
import appModules.Menu_Action;
import appModules.WindowResize_Action;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import pageObjects.HomePage;
public class TC_Jobs_List_AddNewRecord_Consultant {
	public WebDriver driver;
	
  @Test
  public void f() {
	  String Module = "Jobs List";
	  HomePage.Jobs_List(driver).click();
	 
	  Menu_Action.Execute(driver,Module);
	  driver.switchTo().defaultContent();
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainFrame")); 
	  pageObjects.JobsListPage.AddNew(driver).click();
	  //click on add new consultant
	  pageObjects.JobsListAddNewPage.AddNewConsultant(driver).click();
	  String oldTab = driver.getWindowHandle();
	  wait.until(ExpectedConditions.elementToBeClickable(pageObjects.JobsListAddNewPage.AddNewConsultant(driver))).click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    pageObjects.AddNewConsultant.Consultant_Name(driver).clear();
	    pageObjects.AddNewConsultant.Consultant_Name(driver).sendKeys("ABC");
	    pageObjects.AddNewConsultant.Save_Button(driver).click();
	    
	    /*DesiredCapabilities capabilities = DesiredCapabilities.firefox();   
	    capabilities.setCapability("marionette", false);
	    @SuppressWarnings("deprecation")
		WebDriver driver = new FirefoxDriver(capabilities);*/
	    
	    //pageObjects.JobsListAddNewConsultant.close_window(driver).click();
	    //driver.close();
	    driver.switchTo().window(oldTab);
	    new Select(new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(pageObjects.JobsListAddNewPage.Type(driver)))).selectByVisibleText("Bloods");
	  //new Select(new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(pageObjects.JobsListAddNewPage.Consultant(driver)))).selectByIndex(10);
	  
	  // Display a date in day, month, year format
	    
	    pageObjects.JobsListAddNewPage.SelectDate(driver).click();
	    Date date = Calendar.getInstance().getTime();
	  DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
      String today = formatter.format(date);
      pageObjects.JobsListAddNewPage.SelectDate(driver).clear();
	  
	  pageObjects.JobsListAddNewPage.SelectDate(driver).sendKeys(today);
	  
	  
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
	  
	  /*System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
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
	  Driver_Close_Action.Execute();
  }

}
