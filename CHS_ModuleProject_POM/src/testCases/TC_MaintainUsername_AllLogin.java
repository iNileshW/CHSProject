package testCases;

import org.testng.annotations.Test;

import appModules.LeftFrameSwitch_Action;
import appModules.LogIn_Action;
import appModules.LogIn_User_Action;
import appModules.MainFrameSwitch_Action;
import utility.Constant;
import appModules.Menu_Action;
import appModules.WindowResize_Action;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
public class TC_MaintainUsername_AllLogin {
	public WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  Menu_Action.Execute(driver,utility.Constant.Module10);
	  MainFrameSwitch_Action.Execute(driver);
	  pageObjects.MaintainUsernamesPage.LogOut(driver).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	 
		  LogIn_User_Action.Execute1(driver);
		  
	  }
  
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  driver = LogIn_Action.Execute(driver,Constant.adminUser,Constant.adminPass);
	  LeftFrameSwitch_Action.Execute(driver);
	  WindowResize_Action.Execute(driver);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
