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
public class TC_Ward_RoundSheet_AdvSearch {
	public WebDriver driver;
	
  @Test
  public void f() {
	  Menu_Action.Execute(driver,utility.Constant.Module3);
	  MainFrameSwitch_Action.Execute(driver);
	 
	  pageObjects.WardRoundSheetPage.Adv_Search(driver).click();
	  pageObjects.WardRoundSheetAdvSearchPage.Search_Button(driver).click();
	 		
	  pageObjects.WardRoundSheetPage.Adv_Search(driver).click();
	  
	  do {
	  for (int i=0;i<=7;i++) {//for records per page dropdown
		  //https://stackoverflow.com/questions/4540684/java-round-up-any-number
		  new Select(pageObjects.WardRoundSheetAdvSearchPage.Consultant_Condn(driver)).selectByIndex(i);
		  /*String ddselection=pageObjects.WardRoundSheetPage.Recordpp(driver).getAttribute("value");
		  System.out.println(ddselection);*/
		  pageObjects.WardRoundSheetAdvSearchPage.Search_Button(driver).click();
		  pageObjects.WardRoundSheetPage.Adv_Search(driver).click();
		  pageObjects.WardRoundSheetAdvSearchPage.Consultant_NotCB(driver).isSelected();
	  }
	  }while(pageObjects.WardRoundSheetAdvSearchPage.Consultant_NotCB(driver).isSelected());
	  LeftFrameSwitch_Action.Execute(driver);
	  Menu_Action.Execute(driver,utility.Constant.Module3);
	  MainFrameSwitch_Action.Execute(driver);
	  
  }
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  /*System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	  WindowResize_Action.Execute(driver);
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
