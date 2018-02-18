package testCases;

import org.testng.annotations.Test;

import appModules.LogIn_Action;
import utility.Constant;
import appModules.Menu_Action;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import pageObjects.HomePage;
public class TC_Jobs_List_Select_Unselect {
	public WebDriver driver;
	
  @Test
  public void f() {
	  String Module = "Jobs List";
	  HomePage.Jobs_List(driver).click();
	 
	  Menu_Action.Execute(driver,Module);
	  driver.switchTo().defaultContent();
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainFrame")); 
	  pageObjects.JobsListPage.SelectUnselect(driver).click();
	  //check of all records selected
	  for(int i=2;i<=19;i++) {
	  boolean selected = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr["+i+"]/td[3]/input[1]")).isSelected();
	  System.out.printf("Record %d is %b\n",i-1, selected);
	  }
	  
	  //check of all records unselected
	  pageObjects.JobsListPage.SelectUnselect(driver).click();
	  //check of all records selected
	  for(int i=2;i<=19;i++) {
	  boolean selected = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr["+i+"]/td[3]/input[1]")).isSelected();
	  System.out.printf("Record %d is %b\n",i-1, selected);
	  }
  }
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	  LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  WebDriverWait wait = new WebDriverWait(driver,10);
	  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("leftFrame"));
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
