package testCases;

import org.testng.annotations.Test;

import appModules.LeftFrameSwitch_Action;
import appModules.LogIn_Action;
import appModules.MainFrameSwitch_Action;
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
public class TC_Doctor_Handover_SortFunctionality {
	public WebDriver driver;
	
  @Test
  public void f() {
	  
	  HomePage.Ward_Round_Sheet(driver).click();
	  
	  Menu_Action.Execute(driver,utility.Constant.Module5);
	  MainFrameSwitch_Action.Execute(driver);
	  pageObjects.DoctorHandoverSignOutSheetPage.Location(driver).click();
	  pageObjects.DoctorHandoverSignOutSheetPage.Location(driver).click();
	  pageObjects.DoctorHandoverSignOutSheetPage.Patient(driver).click();
	  pageObjects.DoctorHandoverSignOutSheetPage.Patient(driver).click();
	  pageObjects.DoctorHandoverSignOutSheetPage.Sex(driver).click();
	  pageObjects.DoctorHandoverSignOutSheetPage.Sex(driver).click();
	  pageObjects.DoctorHandoverSignOutSheetPage.Code(driver).click();
	  pageObjects.DoctorHandoverSignOutSheetPage.Code(driver).click();
	  pageObjects.DoctorHandoverSignOutSheetPage.Diagnosis(driver).click();
	  pageObjects.DoctorHandoverSignOutSheetPage.Diagnosis(driver).click();
	  pageObjects.DoctorHandoverSignOutSheetPage.Allergies(driver).click();
	  pageObjects.DoctorHandoverSignOutSheetPage.Allergies(driver).click();
	  pageObjects.DoctorHandoverSignOutSheetPage.Notes(driver).click();
	  pageObjects.DoctorHandoverSignOutSheetPage.Notes(driver).click();
	  
  }
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	  WindowResize_Action.Execute(driver);
	  LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  LeftFrameSwitch_Action.Execute(driver);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
