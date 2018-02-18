/**
 * 
 */
package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.HomePage;
import pageObjects.LogInPage;
/**
 * @author NX35WG
 *
 */
public class POM_TC {

	/**
	 * @param args
	 */
	
	private static WebDriver driver = null;
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://13.59.25.55:8888/chs/");
		LogInPage.username(driver).clear();
		LogInPage.username(driver).sendKeys("nilesh");
		LogInPage.password(driver).clear();
		LogInPage.password(driver).sendKeys("123456");
		LogInPage.remember_password(driver).click();
		LogInPage.Submit(driver).click();
		HomePage.Jobs_List(driver).click();
		
	}

}
