package testCases;

import org.testng.annotations.Test;

import appModules.LeftFrameSwitch_Action;
import appModules.LogIn_Action;
import utility.Constant;
import appModules.Menu_Action;
import appModules.PageNavigation_Action;
import appModules.WindowResize_Action;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import pageObjects.HomePage;
public class TC_Jobs_List_RecordPerPage {
	public WebDriver driver;
	
  @Test
  public void f() {
	  String Module = "Jobs List";
	  HomePage.Jobs_List(driver).click();
	  
	  Menu_Action.Execute(driver,Module);
	  driver.switchTo().defaultContent();
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainFrame")); 
	  
	  //new Select(new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(InpatientsPage.Records_per_page()))).selectByVisibleText("500");
	  /*for (int i=0;i<=5;i++) {
	  new Select(new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(pageObjects.JobsListPage.Recordpp(driver)))).selectByIndex(i);
	  if (i==0) {
		  pageObjects.JobsListPage.Page2(driver).click();
	  }
	  
	  }*/
	  	
	  String rcount = pageObjects.JobsListPage.RecordCount(driver).getText();
	  int count = Integer.parseInt(rcount.substring(15,17));
  	  
	  String[] ddcount = pageObjects.JobsListPage.Recordpp(driver).getText().split("\n");
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
		  PageNavigation_Action.Execute1(driver, pagecount, dd_value, pageObjects.JobsListPage.Recordpp(driver));
		  
		  System.out.println(ddcount[i]);
	  }
  }
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
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
