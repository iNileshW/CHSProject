/**
 * 
 */
package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import appModules.LogIn_Action;
import pageObjects.HomePage;
import pageObjects.LogInPage;

/**
 * @author NX35WG
 *
 */
public class Module_TC {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LogIn_Action.Execute(driver,"nilesh","123456");
		HomePage.Jobs_List(driver).click();
		
	}
}