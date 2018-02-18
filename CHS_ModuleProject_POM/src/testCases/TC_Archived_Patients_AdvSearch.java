package testCases;

import org.testng.annotations.Test;

import appModules.LeftFrameSwitch_Action;
import appModules.LogIn_Action;
import appModules.MainFrameSwitch_Action;
import appModules.Menu_Action;
import appModules.WindowResize_Action;
import utility.Constant;

import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
public class TC_Archived_Patients_AdvSearch {
	
	public WebDriver driver;
  @Test
  public void f() {
	  
	  
	  Menu_Action.Execute(driver,utility.Constant.Module9);
	  MainFrameSwitch_Action.Execute(driver);
	 
	  pageObjects.ArchivedPatientsPage.Adv_Search(driver).click();
	  pageObjects.ArchivedPatientsAdvSearchPage.Search_Button(driver).click();
	  String rcount = pageObjects.ArchivedPatientsPage.RecordCount(driver).getText().substring(15,17);
	  System.out.printf("Records matching = %s",rcount);
	  
	  pageObjects.ArchivedPatientsPage.Adv_Search(driver).click();
	  String[] ddcount = pageObjects.ArchivedPatientsAdvSearchPage.Patient_Name_cond(driver).getText().split("\n");
	  int ddc = ddcount.length;
	  int ddi = ddc/3;
	  int k=0;
	  int m=0;
	  pageObjects.ArchivedPatientsAdvSearchPage.Any_Cond(driver).click();
	  do//For not CB 
	  {
	  do//For All/any condition
	  {
	  for(int l=0;l<ddc;l=(l+ddi)) {	  
	  new Select (pageObjects.ArchivedPatientsAdvSearchPage.Patient_Name_cond(driver)).selectByIndex(l);
	  pageObjects.ArchivedPatientsAdvSearchPage.Patient_Name_txtbox(driver).clear();
	  pageObjects.ArchivedPatientsAdvSearchPage.Patient_Name_txtbox(driver).sendKeys(Constant.Patient_Name1);
	  pageObjects.ArchivedPatientsAdvSearchPage.Search_Button(driver).click();
	  pageObjects.ArchivedPatientsPage.Adv_Search(driver).click();
	  }
	  
	  for(int l=0;l<ddc;l=(l+ddi)) {
		  
		  new Select (pageObjects.ArchivedPatientsAdvSearchPage.Unit_No_cond(driver)).selectByIndex(l);
		  pageObjects.ArchivedPatientsAdvSearchPage.Unit_No_txtbox(driver).clear();
		  pageObjects.ArchivedPatientsAdvSearchPage.Unit_No_txtbox(driver).sendKeys(Constant.UnitNo);
		  pageObjects.ArchivedPatientsAdvSearchPage.Search_Button(driver).click();
		  pageObjects.ArchivedPatientsPage.Adv_Search(driver).click();
		  }
	  
	  for(int l=0;l<ddc;l=(l+ddi)) {
		  
		  new Select (pageObjects.ArchivedPatientsAdvSearchPage.Ward_cond(driver)).selectByIndex(l);
		  pageObjects.ArchivedPatientsAdvSearchPage.Ward_txtbox(driver).clear();
		  pageObjects.ArchivedPatientsAdvSearchPage.Ward_txtbox(driver).sendKeys(Constant.UnitNo);
		  pageObjects.ArchivedPatientsAdvSearchPage.Search_Button(driver).click();
		  pageObjects.ArchivedPatientsPage.Adv_Search(driver).click();
		  }
	  
	  for(int l=0;l<ddc;l=(l+ddi)) {
		  
		  new Select (pageObjects.ArchivedPatientsAdvSearchPage.Consultant_cond(driver)).selectByIndex(l);
		  pageObjects.ArchivedPatientsAdvSearchPage.Consultant_txtbox(driver).clear();
		  pageObjects.ArchivedPatientsAdvSearchPage.Consultant_txtbox(driver).sendKeys(Constant.Type);
		  pageObjects.ArchivedPatientsAdvSearchPage.Search_Button(driver).click();
		  pageObjects.ArchivedPatientsPage.Adv_Search(driver).click();
		  }
	  
	  	  //pageObjects.ArchivedJobsPage.Adv_Search(driver).click();
	  pageObjects.ArchivedPatientsAdvSearchPage.All_Cond(driver).click();
	  k++;
	  }while(k<2);
		  //pageObjects.ArchivedJobsPage.Adv_Search(driver).click();
	  	  pageObjects.ArchivedPatientsAdvSearchPage.Patient_Name_NotCB(driver).click();
	  	  pageObjects.ArchivedPatientsAdvSearchPage.Unit_No_NotCB(driver).click();
	  	pageObjects.ArchivedPatientsAdvSearchPage.Ward_NotCB(driver).click();
	  	pageObjects.ArchivedPatientsAdvSearchPage.Consultant_NotCB(driver).click();
	  	m++;
  }while(m<2);
}
  
  /*private Select Select(List<WebElement> findElements) {
	// TODO Auto-generated method stub
	return null;
}*/

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

