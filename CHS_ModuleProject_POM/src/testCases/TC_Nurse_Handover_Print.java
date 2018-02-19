package testCases;

/*import org.testng.annotations.Test;

import appModules.LeftFrameSwitch_Action;
import appModules.LogIn_Action;
import appModules.MainFrameSwitch_Action;
import utility.Constant;
import appModules.Menu_Action;
import appModules.WindowResize_Action;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
public class TC_Nurse_Handover_Print {
	public WebDriver driver;
	
  @Test
  public void f() {
	  Menu_Action.Execute(driver,utility.Constant.Module4);
	  MainFrameSwitch_Action.Execute(driver);
	 
	  //WebDriverWait wait = new WebDriverWait(driver, 10);
	  String oldTab = driver.getWindowHandle();
	  pageObjects.NurseHandoverPage.Print(driver).click();
	  //wait.until(ExpectedConditions.elementToBeClickable(pageObjects.NurseHandoverPage.Print(driver))).click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    assertEquals("Nursing Handover",pageObjects.AddNewPagePrintPopUp.Header(driver).getText());
	    driver.close();
	    driver.switchTo().window(oldTab);
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

}*/

import org.testng.annotations.Test;

import appModules.LeftFrameSwitch_Action;
import appModules.LogIn_Action;
import appModules.MainFrameSwitch_Action;
import utility.Constant;
import appModules.Menu_Action;
import appModules.WindowResize_Action;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import pageObjects.HomePage;
public class TC_Nurse_Handover_Print {
	public WebDriver driver;
	
  @Test
  public void f() {
	  LeftFrameSwitch_Action.Execute(driver);
	  Menu_Action.Execute(driver,utility.Constant.Module4);
	  MainFrameSwitch_Action.Execute(driver);
	  
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  String oldTab = driver.getWindowHandle();
	  MainFrameSwitch_Action.Execute(driver);
	  java.util.List<WebElement> allLinks = driver.findElements(By.cssSelector("html>body>table>tbody>tr>td>table>tbody>tr>td>a"));
	  System.out.println(allLinks.iterator());
	  driver.findElement(By.xpath("//html/body/table[1]/tbody/tr/td[4]/table/tbody/tr/td[9]")).click();
	  //driver.findElement(By.cssSelector("html>body>table>tbody>tr>td>table>tbody>tr>td>a")).click();
	  //wait.until(ExpectedConditions.elementToBeClickable(pageObjects.NurseHandoverPage.Print(driver))).click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    assertEquals("Nursing Handover",pageObjects.AddNewPagePrintPopUp.Header(driver).getText());
	    driver.close();
	    driver.switchTo().window(oldTab);
  }
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  /*System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
	  driver = new FirefoxDriver();
	  LogIn_Action.Execute(driver,Constant.Username,Constant.Password);*/
	  driver = LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
	  LeftFrameSwitch_Action.Execute(driver);
	  WindowResize_Action.Execute(driver);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
