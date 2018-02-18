/**
 * 
 */
package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import appModules.LogIn_Action;
import pageObjects.HomePage;
import utility.Constant;

/**
 * @author NX35WG
 *
 */
public class Global_Var_TC {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(Constant.URL);
				
		LogIn_Action.Execute(driver,Constant.Username,Constant.Password);
		HomePage.Jobs_List(driver).click();
}

}