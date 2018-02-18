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
public class TC_Consultant_Edit_Reset_AllConsultant {
	public WebDriver driver;
	
  @Test
  public void f() {
	  		
	  Menu_Action.Execute(driver,utility.Constant.Module6);
	  MainFrameSwitch_Action.Execute(driver);
	  String r1 = pageObjects.WardsPage.RecordCount(driver).getText().substring(15,17);
		System.out.println(r1);
		int rcount = Integer.parseInt(r1);
	  //Click Edit & Back button
	  for(int i=2;i<=rcount;i=i+(rcount/3)) {
	  driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr["+i+"]/td[1]/a")).click();
	  pageObjects.WardsEditPage.BackToList(driver).click();
	  
	  }
	  
	  
	  }
  
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  /*System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	  LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  LeftFrameSwitch_Action.Execute(driver);*/
	  driver = LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  LeftFrameSwitch_Action.Execute(driver);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
