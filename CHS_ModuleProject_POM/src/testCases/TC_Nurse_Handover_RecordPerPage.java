package testCases;

import org.testng.annotations.Test;

import appModules.LeftFrameSwitch_Action;
import appModules.LogIn_Action;
import appModules.MainFrameSwitch_Action;
import utility.Constant;
import appModules.Menu_Action;
import appModules.PageNavigation_Action;
import appModules.WindowResize_Action;

import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import pageObjects.HomePage;
public class TC_Nurse_Handover_RecordPerPage {
	public WebDriver driver;
	
  @Test
  public void f() {
	  
	  Menu_Action.Execute(driver,utility.Constant.Module4);
	  MainFrameSwitch_Action.Execute(driver);
	  //WebElement Rpp = pageObjects.WardRoundSheetPage.Recordpp(driver).click();
	  String rcount = pageObjects.NurseHandoverPage.RecordCount(driver).getText();
	  //PageNavigation_Action.Execute(driver, pageObjects.NurseHandoverPage.Recordpp(driver),rcount);
	  
	  int count = Integer.parseInt(rcount.substring(15,17));
  	  
	  String[] ddcount = pageObjects.NurseHandoverPage.Recordpp(driver).getText().split("\n");
	  int ddc = ddcount.length;
	  //System.out.println(ddc);
	  int pagecount =0;
	  for(int i=0; i<ddc; i++) {
		  int k = Integer.parseInt(ddcount[i]);
		  String dd_value = ddcount[i];
		  int remainder = count%k; 
		  if((remainder<5)&(remainder>1)) {
			  System.out.println(count%k);
			  pagecount = ((int) Math.ceil(count/k)+1);
			  
		  }
		  else {
			  pagecount = (int) Math.ceil(count/k)+1;
			  
		  }
		  PageNavigation_Action.Execute1(driver, pagecount, dd_value, pageObjects.NurseHandoverPage.Recordpp(driver));
		  
		  System.out.println(ddcount[i]);
	  }
  }
    
@BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	  LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  WindowResize_Action.Execute(driver);
	  LeftFrameSwitch_Action.Execute(driver);
	  /* WebDriverWait wait = new WebDriverWait(driver,10);
	  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("leftFrame"));*/
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
