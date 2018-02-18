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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import pageObjects.HomePage;
public class TC_Ward_RoundSheet_RecordPerPage {
	public WebDriver driver;
	
  @Test
  public void f() {
	 // HomePage.Ward_Round_Sheet(driver).click();
	  
	  Menu_Action.Execute(driver,utility.Constant.Module3);
	  MainFrameSwitch_Action.Execute(driver);
	  //WebElement Rpp = pageObjects.WardRoundSheetPage.Recordpp(driver).click();
	  //String rcount = pageObjects.WardRoundSheetPage.RecordCount(driver).getText();
	  //PageNavigation_Action.Execute(driver, pageObjects.WardRoundSheetPage.Recordpp(driver), rcount);
	  String rcount = pageObjects.WardRoundSheetPage.RecordCount(driver).getText();

	  int count = Integer.parseInt(rcount.substring(15,17));
	  System.out.println(count);
	  
	 /* for (int i=0;i<=5;i++) {//for records per page dropdown
		  //https://stackoverflow.com/questions/4540684/java-round-up-any-number
		  new Select(pageObjects.WardRoundSheetPage.Recordpp(driver)).selectByIndex(i);
		  String ddselection=pageObjects.WardRoundSheetPage.Recordpp(driver).getAttribute("value");
		  System.out.println(ddselection);
		  int divisor = Integer.parseInt(ddselection);
		  System.out.println(divisor);
		  int pagecount = (int) Math.ceil(count/divisor);
		  System.out.println(pagecount);
		  //Page navigation loop
		  for (int j=1;j<(pagecount+1);j++) { //for number of pages calculation
			  driver.findElement(By.xpath("html/body/table[3]/tbody/tr/td/a["+j+"]")).click();
			  }
		   String ddselection1="utility.Constant.DDSelect_"+[i];
		  int divisor = Integer.parseInt(ddselection);
		  int pagecount = (int) Math.ceil(count/divisor);
		  System.out.println(pagecount);
		  for (int j=1;j<pagecount;j++) { //for number of pages calculation
		  driver.findElement(By.xpath("html/body/table[3]/tbody/tr/td/a["+j+"]")).click();
		  }
	  }*/
	  
	  //int count = Integer.parseInt(rcount.substring(15,17));
  	  
	  String[] ddcount = pageObjects.WardRoundSheetPage.Recordpp(driver).getText().split("\n");
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
		  PageNavigation_Action.Execute1(driver, pagecount, dd_value, pageObjects.WardRoundSheetPage.Recordpp(driver));
		  
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
