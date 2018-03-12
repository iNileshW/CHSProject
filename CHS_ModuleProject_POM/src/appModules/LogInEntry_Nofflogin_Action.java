/**
 * 
 */
package appModules;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.LogInPage;
import utility.Constant;
import utility.ExcelUtils;

/**
 * @author NX35WG
 *
 */
public class LogInEntry_Nofflogin_Action {
	public static WebDriver driver;
	
	public static WebDriver Execute(String gUsername, String gPassword) {
		System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
		/*ProfilesIni prof = new ProfilesIni();	
		FirefoxProfile ffProfile= prof.getProfile ("AutoProfile");
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setAcceptInsecureCerts(true); 
		ffProfile.setAcceptUntrustedCertificates(true); 
		ffProfile.setAssumeUntrustedCertificateIssuer(false);
		//firefoxOptions.setProfile(ffProfile);
		
        WebDriver driver = new FirefoxDriver (firefoxOptions);*/
		FirefoxOptions options = new FirefoxOptions();
		options.setAcceptInsecureCerts(true);
		//options.setPreference("security.insecure_field_warning.contextual.enabled", false);
		options.addPreference(gUsername, false);
		options.addPreference(gPassword,false);
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(utility.Constant.URL);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.elementToBeClickable(LogInPage.username(driver))).clear();
		LogInPage.username(driver).sendKeys(gUsername);
		//driver.close();
		LogInPage.remember_password(driver).click();
		LogInPage.password(driver).clear();
		LogInPage.password(driver).sendKeys(gPassword);
		LogInPage.remember_password(driver).click();
		LogInPage.remember_password(driver).click();
		wait.until(ExpectedConditions.elementToBeClickable(LogInPage.Submit(driver))).click();
		assertEquals("Invalid Login",pageObjects.LogInPage.validationmsg(driver).getText());
		driver.close();
			return driver;
	}
			}
		
		//try {
			/*System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
			  //Driver_Action.Execute().navigate().to("http://13.59.25.55:8888/chs/");
				driver = new FirefoxDriver();
				driver.get("http://13.59.25.55:8888/chs/");
			  WindowResize_Action.Execute(driver);
			  LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
			  LeftFrameSwitch_Action.Execute(driver);
			  
			  Dimension d = new Dimension(620,650);
				//Resize the current window to the given dimension
				driver.manage().window().setSize(d);
				driver.manage().window().setPosition(new Point(0,0));
				
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.elementToBeClickable(LogInPage.username(driver))).clear();
		LogInPage.username(driver).sendKeys(Constant.Username);
		LogInPage.password(driver).clear();
		LogInPage.password(driver).sendKeys(Constant.Password);
		LogInPage.remember_password(driver).click();
		wait.until(ExpectedConditions.elementToBeClickable(LogInPage.Submit(driver))).click();
		return driver;
	}
}*/
		/*if(LogInPage.validationmsg(driver).getText().equals("Invalid Login")) {
			LogInPage.password(driver).clear();
			LogInPage.password(driver).sendKeys(utility.Constant.cPassword);
		}
		
		}*/
		/*catch(Exception e){
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://13.59.25.55:8888/chs/");
			WebDriverWait wait = new WebDriverWait(driver, 10);
			  wait.until(ExpectedConditions.elementToBeClickable(LogInPage.username(driver))).clear();
			LogInPage.username(driver).sendKeys(Constant.Username);
			LogInPage.password(driver).clear();
			LogInPage.password(driver).sendKeys(utility.Constant.cPassword);
			LogInPage.remember_password(driver).click();
			wait.until(ExpectedConditions.elementToBeClickable(LogInPage.Submit(driver))).click();
			System.out.println("Changed password Used");
		}*/
	
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
	

