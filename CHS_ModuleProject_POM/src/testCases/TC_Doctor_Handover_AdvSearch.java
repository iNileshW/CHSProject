package testCases;

import org.testng.annotations.Test;

import appModules.LeftFrameSwitch_Action;
import appModules.LogIn_Action;
import appModules.MainFrameSwitch_Action;
import utility.Constant;
import appModules.Menu_Action;
import appModules.WindowResize_Action;

import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
public class TC_Doctor_Handover_AdvSearch {
	public WebDriver driver;
	
  @Test
  public void f() {
	  Menu_Action.Execute(driver,utility.Constant.Module5);
	  MainFrameSwitch_Action.Execute(driver);
	 
	  pageObjects.DoctorHandoverSignOutSheetPage.Adv_Search(driver).click();
	  pageObjects.DoctorHandoverSheetAdvSearchPage.Search_Button(driver).click();
	  //searching with no condition	
	  pageObjects.DoctorHandoverSignOutSheetPage.Adv_Search(driver).click();
	 
	  pageObjects.DoctorHandoverSheetAdvSearchPage.Search_Button(driver).click();
	  //Getting record count
	  String rcount = pageObjects.DoctorHandoverSignOutSheetPage.RecordCount(driver).getText().substring(15,17);
	  System.out.printf("Records matching = %s",rcount);
	  pageObjects.DoctorHandoverSignOutSheetPage.Adv_Search(driver).click();
	  //for(l=2;l<=(rcount+1;l++)) {//counter for using ward data from previous test case of nurse handover
	  //int k = 0;//counter for not check box
	  do {//do1 - for all & any condition
			  do {//do2-for not check box
				  for (int j=0;j<2;j++)
				  {//for 1 - 2 x 2 for loops as in 1 the previous for loop condition need to be removed	  
					  if(j==0)
					  {//if 1 - for ward condition removal
						  for (int i=0;i<=7;i=i+4) 
						  {//for 2 - counter for dropdown of condition.
					  	  //for records per page dropdown. 7 as last choice is empty
							  new Select(pageObjects.DoctorHandoverSheetAdvSearchPage.Ward_Condn(driver)).selectByIndex(i);
							  pageObjects.DoctorHandoverSheetAdvSearchPage.Ward_Txtbox(driver).clear();
							  pageObjects.DoctorHandoverSheetAdvSearchPage.Ward_Txtbox(driver).sendKeys("children");
							  pageObjects.DoctorHandoverSheetAdvSearchPage.Search_Button(driver).click();
							  String rcount1 = pageObjects.DoctorHandoverSignOutSheetPage.RecordCount(driver).getText().substring(15,17);
							  System.out.printf("Records matching = %s\n",rcount1);
							  
							  pageObjects.DoctorHandoverSignOutSheetPage.Adv_Search(driver).click();
						  }//for 2	  
					  
					  
					  for (int i=0;i<=7;i=i+4) 
					  {//for 3 - counter for dropdown of condition.
						  //for records per page dropdown. 7 as last choice is empty
						  pageObjects.DoctorHandoverSheetAdvSearchPage.Ward_Txtbox(driver).clear();//to remove ward cond
						  new Select(pageObjects.DoctorHandoverSheetAdvSearchPage.Consultant_Condn(driver)).selectByIndex(i);
						  pageObjects.DoctorHandoverSheetAdvSearchPage.Consultant_Txtbox(driver).clear();
						  pageObjects.DoctorHandoverSheetAdvSearchPage.Consultant_Txtbox(driver).sendKeys("Visha Long");
						  pageObjects.DoctorHandoverSheetAdvSearchPage.Search_Button(driver).click();
						  String rcount1 = pageObjects.DoctorHandoverSignOutSheetPage.RecordCount(driver).getText().substring(15,17);
						  System.out.printf("Records matching = %s\n",rcount1);
						  pageObjects.DoctorHandoverSignOutSheetPage.Adv_Search(driver).click();
						  
					  	}//for 3
					  }//if 1
					  else if(j==1) {
						//if 2 - for ward condition removal
						  for (int i=0;i<=7;i=i+4) 
						  {//for 4 - counter for dropdown of condition.
					  	  //for records per page dropdown. 7 as last choice is empty
							  new Select(pageObjects.DoctorHandoverSheetAdvSearchPage.Consultant_Condn(driver)).selectByIndex(i);
							  //pageObjects.DoctorHandoverSheetAdvSearchPage.Ward_Txtbox(driver).clear();
							  //pageObjects.DoctorHandoverSheetAdvSearchPage.Ward_Txtbox(driver).sendKeys("children");
							  pageObjects.DoctorHandoverSheetAdvSearchPage.Search_Button(driver).click();
							  String rcount1 = pageObjects.DoctorHandoverSignOutSheetPage.RecordCount(driver).getText().substring(15,17);
							  System.out.printf("Records matching = %s\n",rcount1);
							  
							  pageObjects.DoctorHandoverSignOutSheetPage.Adv_Search(driver).click();
						  }//for 4	  
					  
					  
					  for (int i=0;i<=7;i=i+4) 
					  {//for 5 - counter for dropdown of condition.
						  //for records per page dropdown. 7 as last choice is empty
						  new Select(pageObjects.DoctorHandoverSheetAdvSearchPage.Consultant_Condn(driver)).selectByIndex(i);
						  //pageObjects.DoctorHandoverSheetAdvSearchPage.Consultant_Txtbox(driver).clear();
						  //pageObjects.DoctorHandoverSheetAdvSearchPage.Consultant_Txtbox(driver).sendKeys("Visha Long");
						  pageObjects.DoctorHandoverSheetAdvSearchPage.Search_Button(driver).click();
						  String rcount1 = pageObjects.DoctorHandoverSignOutSheetPage.RecordCount(driver).getText().substring(15,17);
						  System.out.printf("Records matching = %s\n",rcount1);
						  pageObjects.DoctorHandoverSignOutSheetPage.Adv_Search(driver).click();
						  
					  	}//for5
					  }//eif 2
				  }//for1
			  pageObjects.DoctorHandoverSheetAdvSearchPage.Ward_NotCB(driver).click();
			  //pageObjects.DoctorHandoverSheetAdvSearchPage.Consultant_NotCB(driver).click();
			  }while(pageObjects.DoctorHandoverSheetAdvSearchPage.Consultant_NotCB(driver).isSelected());
			  pageObjects.WardRoundSheetAdvSearchPage.Any_Cond(driver).click();
	  }while(pageObjects.WardRoundSheetAdvSearchPage.All_Cond(driver).isSelected());
	  
	  LeftFrameSwitch_Action.Execute(driver);
	  Menu_Action.Execute(driver,utility.Constant.Module5);
	  MainFrameSwitch_Action.Execute(driver);
	  
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
