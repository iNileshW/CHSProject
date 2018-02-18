/**
 * 
 */
package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.LogInPage;
import utility.Constant;
import utility.ExcelUtils;

/**
 * @author NX35WG
 *
 */
public class LogIn_Admin_Action {
	public static WebDriver driver = null;
	
	public static void Execute(WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(utility.Constant.URL);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			  wait.until(ExpectedConditions.elementToBeClickable(LogInPage.username(driver))).clear();
			LogInPage.username(driver).sendKeys(utility.Constant.adminUser);
			LogInPage.password(driver).clear();
			LogInPage.password(driver).sendKeys(utility.Constant.adminPass);
			LogInPage.remember_password(driver).click();
			wait.until(ExpectedConditions.elementToBeClickable(LogInPage.Submit(driver))).click();
	}
			}
		
			
	//With Excel Sheet-->
	/*public static void Execute(WebDriver driver) throws Exception{
	
	driver.get("http://13.59.25.55:8888/chs/");
	
	String sUsername = ExcelUtils.getCellData(1,1);
	String sPassword = ExcelUtils.getCellData(1,2);
	LogInPage.username(driver).clear();
	LogInPage.username(driver).sendKeys(sUsername);
	LogInPage.password(driver).clear();
	LogInPage.password(driver).sendKeys(sPassword);
	LogInPage.remember_password(driver).click();
	LogInPage.Submit(driver).click();
	}*/
	

