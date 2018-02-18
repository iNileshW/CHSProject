package testCases;

import org.testng.annotations.Test;

import appModules.LeftFrameSwitch_Action;
import appModules.LogIn_Action;
import appModules.MainFrameSwitch_Action;
import utility.Constant;
import appModules.Menu_Action;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import pageObjects.HomePage;
public class TC_Consultant_AddNewConsultant {
	public WebDriver driver;
	
  @Test
  public void f() {
	  		
	  Menu_Action.Execute(driver,utility.Constant.Module7);
	  MainFrameSwitch_Action.Execute(driver);
	  String r1 = pageObjects.ConsultantPage.RecordCount(driver).getText().substring(15,17);
		System.out.println(r1);
		int rcount = Integer.parseInt(r1);
	  //Click Edit & Back button
	  pageObjects.ConsultantPage.AddNew(driver).click();
	  pageObjects.AddNewConsultant.Consultant_Txtbox(driver).sendKeys(Constant.Consultant_Name4);
	  pageObjects.AddNewConsultant.Save_Button(driver).click();
	  String r2 = pageObjects.ConsultantPage.RecordCount(driver).getText().substring(15,17);
	  if(r1==r2) {
		  System.out.println("Consultant not added");
	  }
	  else {
		  System.out.println("Consultant Added");
	  }
}
	  
	  
	  
  
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	  LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  LeftFrameSwitch_Action.Execute(driver);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
