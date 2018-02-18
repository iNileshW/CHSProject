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

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import pageObjects.HomePage;
public class TC_Jobs_List_AddNew_Back {
	public WebDriver driver;
	
  @Test
  public void f() {
	  HomePage.Jobs_List(driver).click();
		
	  Menu_Action.Execute(driver,utility.Constant.Module2);
	  MainFrameSwitch_Action.Execute(driver);
	 
	  pageObjects.JobsListPage.AddNew(driver).click();
	  assertEquals("Current Jobs, Add new record",pageObjects.JobsListAddNewPage.Add_New_Page(driver).getText());
	  pageObjects.JobsListAddNewPage.Back_To_List(driver).click();
  }
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	 /* System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
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
