package testCases;

import org.testng.annotations.Test;

import appModules.LeftFrameSwitch_Action;
import appModules.LogIn_Action;
import utility.Constant;
import appModules.Menu_Action;
import appModules.WindowResize_Action;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import pageObjects.HomePage;
public class TC_Jobs_List_AdvSearch {
	public WebDriver driver;
	
  @Test
  public void f() {
	  String Module = "Jobs List";
	  HomePage.Jobs_List(driver).click();
	 
	  Menu_Action.Execute(driver,Module);
	  driver.switchTo().defaultContent();
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainFrame")); 
	  pageObjects.JobsListPage.Adv_Search(driver).click();
	  pageObjects.JobsListAdvSearchPage.Search_Button(driver).click();
	  String r1 = pageObjects.JobsListPage.RecordCount(driver).getText().substring(15,17);
		System.out.println(r1);
		int rcount = Integer.parseInt(r1);
	  
		
	  pageObjects.JobsListPage.Adv_Search(driver).click();
	  new Select (new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(pageObjects.JobsListAdvSearchPage.Patient_Condn(driver)))).selectByVisibleText("Contains");
	  pageObjects.JobsListAdvSearchPage.Patient_Txtbox(driver).clear();
	  pageObjects.JobsListAdvSearchPage.Patient_Txtbox(driver).sendKeys(utility.Constant.Patient_Name1);
	  /*if (i=1) {
		  new Select (new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(pageObjects.JobsListAdvSearchPage.Consul_DropDown(driver)))).selectByValue(utility.Constant.Consultant_Name1);;
	  }*/
	  pageObjects.JobsListAdvSearchPage.Search_Button(driver).click();
	  String r2 = pageObjects.JobsListPage.RecordCount(driver).getText().substring(15,17);
		System.out.printf("%s Record Displayed matching condition of Patient name as %s\n",r2,utility.Constant.Patient_Name1);
		
		//Add 2nd condition for consultant
		pageObjects.JobsListPage.Adv_Search(driver).click();
		new Select (new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(pageObjects.JobsListAdvSearchPage.Consul_DropDown(driver)))).selectByVisibleText(utility.Constant.Consultant_Name1);
		pageObjects.JobsListAdvSearchPage.Search_Button(driver).click();
		  String r3 = pageObjects.JobsListPage.RecordCount(driver).getText().substring(15,17);
			System.out.printf("%s Record Displayed matching condition of Patient name as %s",r3,utility.Constant.Consultant_Name1);  
		
			//3rd condition - Change to any condition
			pageObjects.JobsListPage.Adv_Search(driver).click();
			pageObjects.JobsListAdvSearchPage.Any_Cond(driver).click();
			pageObjects.JobsListAdvSearchPage.Search_Button(driver).click();
			  String r4 = pageObjects.JobsListPage.RecordCount(driver).getText().substring(15,17);
				System.out.printf("%s Record Displayed matching condition of Patient name as %s or Consultant as %s\n",r4,utility.Constant.Patient_Name1,utility.Constant.Consultant_Name1);  
	 
			//4th condition - Change to Not for name
				pageObjects.JobsListPage.Adv_Search(driver).click();
				pageObjects.JobsListAdvSearchPage.All_Cond(driver).click();
				pageObjects.JobsListAdvSearchPage.Patient_NotCB(driver).click();
				pageObjects.JobsListAdvSearchPage.Search_Button(driver).click();
				  String r5 = pageObjects.JobsListPage.RecordCount(driver).getText().substring(15,17);
					System.out.printf("%s Record Displayed matching condition of not Patient name as %s but Consultant as %s\n",r5,utility.Constant.Patient_Name1,utility.Constant.Consultant_Name1);  
		 
				//}
	  
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
	  driver.close();
  }

}
