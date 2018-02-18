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
public class TC_Nurse_Handover_AddNewRecordReset {
	public WebDriver driver;
	
  @Test
  public void f() {
	  //HomePage.Nurse_Handover(driver).click();
		
	  Menu_Action.Execute(driver,utility.Constant.Module4);
	  MainFrameSwitch_Action.Execute(driver);
	  pageObjects.NurseHandoverPage.AddNew(driver).click();
	  //Select Ward
	  new Select(new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(pageObjects.NurseHandoverAddNewPage.Ward(driver)))).selectByIndex(10);
	  //Add Bed
	  pageObjects.NurseHandoverAddNewPage.Bed(driver).clear();
	  pageObjects.NurseHandoverAddNewPage.Bed(driver).sendKeys("8");
	  //Patient Name
	  pageObjects.NurseHandoverAddNewPage.Patient_Name(driver).clear();
	  pageObjects.NurseHandoverAddNewPage.Patient_Name(driver).sendKeys("Nilesh Automation Test8");
	  // Display a date in day, month, year format
	  Date date = Calendar.getInstance().getTime();
	  DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
      String today = formatter.format(date);
      //Enter DOB
	  pageObjects.NurseHandoverAddNewPage.DOB(driver).clear();
	  pageObjects.NurseHandoverAddNewPage.DOB(driver).sendKeys(today);
	  //Enter Unit No.
	  pageObjects.NurseHandoverAddNewPage.UnitNo(driver).clear();
	  pageObjects.NurseHandoverAddNewPage.UnitNo(driver).sendKeys("8");
	  //Select Sex
	  new Select(new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(pageObjects.NurseHandoverAddNewPage.Sex(driver)))).selectByVisibleText("Male");
	  //Select Consultant
	  new Select(new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(pageObjects.NurseHandoverAddNewPage.Consultant(driver)))).selectByIndex(10);
	  //Select Consultant
	  new Select(new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(pageObjects.NurseHandoverAddNewPage.Code(driver)))).selectByIndex(1);
	  //Enter Diagnosis
	  pageObjects.NurseHandoverAddNewPage.Diagnosis(driver).clear();
	  pageObjects.NurseHandoverAddNewPage.Diagnosis(driver).sendKeys("Pass");
	  //Enter Allergies
	  pageObjects.NurseHandoverAddNewPage.Allergies(driver).clear();
	  pageObjects.NurseHandoverAddNewPage.Allergies(driver).sendKeys("Pass");
	  //Enter Nurses
	  pageObjects.NurseHandoverAddNewPage.Nurses(driver).clear();
	  pageObjects.NurseHandoverAddNewPage.Nurses(driver).sendKeys("Test");
	  //Enter Social Service
	  pageObjects.NurseHandoverAddNewPage.SS(driver).clear();
	  pageObjects.NurseHandoverAddNewPage.SS(driver).sendKeys("Test");
	  //Enter Team
	  pageObjects.NurseHandoverAddNewPage.Team(driver).clear();
	  pageObjects.NurseHandoverAddNewPage.Team(driver).sendKeys("Test");
	  //Enter Notes
	  pageObjects.NurseHandoverAddNewPage.Notes(driver).clear();
	  pageObjects.NurseHandoverAddNewPage.Notes(driver).sendKeys("Test");
	  //Press Reset
	  pageObjects.NurseHandoverAddNewPage.Reset(driver).click();
	  assertEquals("",pageObjects.NurseHandoverAddNewPage.Notes(driver).getText());
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
