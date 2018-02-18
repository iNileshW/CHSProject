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
public class TC_Archived_Patients_ArchivedJobsBack {
	
	public WebDriver driver;
  @Test
  public void f() {
	  
	  
	  Menu_Action.Execute(driver,utility.Constant.Module9);
	  MainFrameSwitch_Action.Execute(driver);
	 
	  
	  String r1 = pageObjects.ArchivedPatientsPage.RecordCount(driver).getText().substring(15,17);
		System.out.println(r1);
		int rcount = Integer.parseInt(r1);
	   for (int i=2;i<=(rcount+1);i=i+(rcount/3)) {
		   driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr["+i+"]/td[4]/a")).click();;
		   pageObjects.ArchivedPatients_ArchivedJobsPage.BackToTable(driver).click();
	   }
	  }
  
  /*private Select Select(List<WebElement> findElements) {
	// TODO Auto-generated method stub
	return null;
}*/

@BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  //System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
	  //driver = new FirefoxDriver();
	  //WindowResize_Action.Execute(driver);
	driver = LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  LeftFrameSwitch_Action.Execute(driver);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  
  }

}

