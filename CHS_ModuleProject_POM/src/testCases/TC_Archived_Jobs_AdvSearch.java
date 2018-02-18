package testCases;

import org.testng.annotations.Test;

import appModules.LeftFrameSwitch_Action;
import appModules.LogIn_Action;
import appModules.MainFrameSwitch_Action;
import appModules.Menu_Action;
import appModules.WindowResize_Action;
import utility.Constant;

import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
public class TC_Archived_Jobs_AdvSearch {
	
	public WebDriver driver;
  @Test
  public void f() {
	  Menu_Action.Execute(driver,utility.Constant.Module8);
	  MainFrameSwitch_Action.Execute(driver);
	 
	  pageObjects.ArchivedJobsPage.Adv_Search(driver).click();
	  pageObjects.ArchivedJobsAdvSearchPage.Search_Button(driver).click();
	  String rcount = pageObjects.ArchivedJobsPage.RecordCount(driver).getText().substring(15,17);
	  System.out.printf("Records matching = %s",rcount);
	  
	  pageObjects.ArchivedJobsPage.Adv_Search(driver).click();
	  String[] ddcount = pageObjects.ArchivedJobsAdvSearchPage.Patient_Name_cond(driver).getText().split("\n");
	  int ddc = ddcount.length;
	  int ddi = ddc/3;
	  int k=0;
	  int m=0;
	  pageObjects.ArchivedJobsAdvSearchPage.Any_Cond(driver).click();
	  do//For not CB 
	  {
	  do//For All/any condition
	  {
	  for(int l=0;l<ddc;l=(l+ddi)) {	  
	  new Select (pageObjects.ArchivedJobsAdvSearchPage.Patient_Name_cond(driver)).selectByIndex(l);
	  pageObjects.ArchivedJobsAdvSearchPage.Patient_Name_txtbox(driver).clear();
	  pageObjects.ArchivedJobsAdvSearchPage.Patient_Name_txtbox(driver).sendKeys(Constant.Patient_Name1);
	  pageObjects.ArchivedJobsAdvSearchPage.Search_Button(driver).click();
	  pageObjects.ArchivedJobsPage.Adv_Search(driver).click();
	  }
	  
	  for(int l=0;l<ddc;l=(l+ddi)) {
		  
		  new Select (pageObjects.ArchivedJobsAdvSearchPage.Consultant_cond(driver)).selectByIndex(l);
		  pageObjects.ArchivedJobsAdvSearchPage.Consultant_Name_txtbox(driver).clear();
		  pageObjects.ArchivedJobsAdvSearchPage.Consultant_Name_txtbox(driver).sendKeys(Constant.Consultant_Name1);
		  pageObjects.ArchivedJobsAdvSearchPage.Search_Button(driver).click();
		  pageObjects.ArchivedJobsPage.Adv_Search(driver).click();
		  }
	  
	  for(int l=0;l<ddc;l=(l+ddi)) {
		  
		  new Select (pageObjects.ArchivedJobsAdvSearchPage.Date_cond(driver)).selectByIndex(l);
		  pageObjects.ArchivedJobsAdvSearchPage.Date_txtbox(driver).clear();
		  pageObjects.ArchivedJobsAdvSearchPage.Date_txtbox(driver).sendKeys(Constant.cDate);
		  pageObjects.ArchivedJobsAdvSearchPage.Search_Button(driver).click();
		  pageObjects.ArchivedJobsPage.Adv_Search(driver).click();
		  }
	  
	  for(int l=0;l<ddc;l=(l+ddi)) {
		  
		  new Select (pageObjects.ArchivedJobsAdvSearchPage.Type_cond(driver)).selectByIndex(l);
		  pageObjects.ArchivedJobsAdvSearchPage.Type_txtbox(driver).clear();
		  pageObjects.ArchivedJobsAdvSearchPage.Type_txtbox(driver).sendKeys(Constant.Type);
		  pageObjects.ArchivedJobsAdvSearchPage.Search_Button(driver).click();
		  pageObjects.ArchivedJobsPage.Adv_Search(driver).click();
		  }
	  
	  for(int l=0;l<ddc;l=(l+ddi)) {
		  
		  new Select (pageObjects.ArchivedJobsAdvSearchPage.Status_cond(driver)).selectByIndex(l);
		  pageObjects.ArchivedJobsAdvSearchPage.Status_txtbox(driver).clear();
		  pageObjects.ArchivedJobsAdvSearchPage.Status_txtbox(driver).sendKeys(Constant.Status);
		  pageObjects.ArchivedJobsAdvSearchPage.Search_Button(driver).click();
		  pageObjects.ArchivedJobsPage.Adv_Search(driver).click();
		  }

	  for(int l=0;l<ddc;l=(l+ddi)) {
		  
		  new Select (pageObjects.ArchivedJobsAdvSearchPage.Name_cond(driver)).selectByIndex(l);
		  pageObjects.ArchivedJobsAdvSearchPage.Name_txtbox(driver).clear();
		  pageObjects.ArchivedJobsAdvSearchPage.Name_txtbox(driver).sendKeys(Constant.Patient_Name1);
		  pageObjects.ArchivedJobsAdvSearchPage.Search_Button(driver).click();
		  pageObjects.ArchivedJobsPage.Adv_Search(driver).click();
		  }
	  
	  for(int l=0;l<ddc;l=(l+ddi)) {
		  
		  new Select (pageObjects.ArchivedJobsAdvSearchPage.Result_cond(driver)).selectByIndex(l);
		  pageObjects.ArchivedJobsAdvSearchPage.Result_txtbox(driver).clear();
		  pageObjects.ArchivedJobsAdvSearchPage.Result_txtbox(driver).sendKeys(Constant.Notes);
		  pageObjects.ArchivedJobsAdvSearchPage.Search_Button(driver).click();
		  pageObjects.ArchivedJobsPage.Adv_Search(driver).click();
		  }
	  
	  for(int l=0;l<ddc;l=(l+ddi)) {
		  
		  new Select (pageObjects.ArchivedJobsAdvSearchPage.Notes_cond(driver)).selectByIndex(l);
		  pageObjects.ArchivedJobsAdvSearchPage.Notes_txtbox(driver).clear();
		  pageObjects.ArchivedJobsAdvSearchPage.Notes_txtbox(driver).sendKeys(Constant.Notes);
		  pageObjects.ArchivedJobsAdvSearchPage.Search_Button(driver).click();
		  pageObjects.ArchivedJobsPage.Adv_Search(driver).click();
		  }
	  //pageObjects.ArchivedJobsPage.Adv_Search(driver).click();
	  pageObjects.ArchivedJobsAdvSearchPage.All_Cond(driver).click();
	  k++;
	  }while(k<2);
		  //pageObjects.ArchivedJobsPage.Adv_Search(driver).click();
	  	  pageObjects.ArchivedJobsAdvSearchPage.Patient_Name_NotCB(driver).click();
	  	  pageObjects.ArchivedJobsAdvSearchPage.Consultant_Name_NotCB(driver).click();
	  	pageObjects.ArchivedJobsAdvSearchPage.Date_NotCB(driver).click();
	  	pageObjects.ArchivedJobsAdvSearchPage.Type_NotCB(driver).click();
	  	pageObjects.ArchivedJobsAdvSearchPage.Status_NotCB(driver).click();
	  	pageObjects.ArchivedJobsAdvSearchPage.Name_NotCB(driver).click();
	  	pageObjects.ArchivedJobsAdvSearchPage.Result_NotCB(driver).click();
	  	pageObjects.ArchivedJobsAdvSearchPage.Notes_NotCB(driver).click();
	  	m++;
  }while(m<2);
}
  
  /*private Select Select(List<WebElement> findElements) {
	// TODO Auto-generated method stub
	return null;
}*/

@BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  /*System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	  WindowResize_Action.Execute(driver);
	  LogIn_Action.Execute(driver,Constant.Username,Constant.Password);*/
	driver = LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  LeftFrameSwitch_Action.Execute(driver);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  
  }

}

