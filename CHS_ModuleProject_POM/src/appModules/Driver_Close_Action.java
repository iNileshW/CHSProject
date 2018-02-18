/**
 * 
 */
package appModules;

import org.openqa.selenium.WebDriver;

/**
 * @author NX35WG
 *
 */
public class Driver_Close_Action {

	public static WebDriver driver = null;
	public static void Execute() {
		driver.close();
		}
}