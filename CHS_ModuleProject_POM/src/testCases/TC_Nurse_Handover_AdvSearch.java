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
public class TC_Nurse_Handover_AdvSearch {
	
	public WebDriver driver;
  @Test
  public void f() {
	  
	  
	  Menu_Action.Execute(driver,utility.Constant.Module4);
	  MainFrameSwitch_Action.Execute(driver);
	 
	  pageObjects.NurseHandoverPage.Adv_Search(driver).click();
	  pageObjects.NurseHandoverAdvSearchPage.Search_Button(driver).click();
	  String rcount = pageObjects.NurseHandoverPage.RecordCount(driver).getText().substring(15,17);
	  System.out.printf("Records matching = %s",rcount);
	  
	  pageObjects.NurseHandoverPage.Adv_Search(driver).click();
	  int k = 0;//counter for not check box
	  do 
	  {
		  int i=0;//counter for dropdown of condition
	  	  new Select(pageObjects.NurseHandoverAdvSearchPage.Ward_Condn(driver)).selectByIndex(i);
	  	  //count of consultant in dropdown
	  	  String[] options = driver.findElement(By.name("value_Ward")).getText().split("\n");
	  	  int c = options.length;
	  	  //int c = selenium.getXpathCount()
	  	  //List <WebElement> num = driver.findElements(By.cssSelector("propHead"));
	  	  //int c = Select(driver.findElements(By.name("value_Ward"))).getOptions().size();
	  	  //List <WebElement> wardcount = wardc.getOptions();
	  	  //System.out.println(wardcount.size());
	  	  //int count = wardcount.size(); 
	  	  if (k==0) 
		  	  {
			  	  for (int j=0;j<=c-1;j=j+(c/3)) //loop for dropdown of ward 
			  	  {
				  	  new Select(pageObjects.NurseHandoverAdvSearchPage.Ward_DropDown(driver)).selectByIndex(j);
				  	  pageObjects.NurseHandoverAdvSearchPage.Search_Button(driver).click();
				  	  pageObjects.NurseHandoverPage.Adv_Search(driver).click();
			  	  }
		  	  }
	  	  else if(k==1) 
	  	  	{
		  		for (int j=0;j<=c-1;j=j+c/3) 
		  		{
		  			if (j==1)
		  			{
		  				pageObjects.NurseHandoverAdvSearchPage.Ward_NotCB(driver).click();
		  			}
		  			new Select(pageObjects.NurseHandoverAdvSearchPage.Ward_DropDown(driver)).selectByIndex(j);
			  	  	pageObjects.NurseHandoverAdvSearchPage.Search_Button(driver).click();
			  	  	pageObjects.NurseHandoverPage.Adv_Search(driver).click();
		  		}
		  	}	
	  	  	k++;
	  	pageObjects.NurseHandoverAdvSearchPage.Ward_NotCB(driver).click();
	  }while(pageObjects.NurseHandoverAdvSearchPage.Ward_NotCB(driver).isSelected());
	  LeftFrameSwitch_Action.Execute(driver);
	 /* Menu_Action.Execute(driver,utility.Constant.Module4);
	  MainFrameSwitch_Action.Execute(driver);*/
	  
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

