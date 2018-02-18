/**
 * 
 */
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * @author NX35WG
 *
 */
public class AddNewPagePrintPopUp {

private static WebElement element = null;
	
	public static WebElement Header(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/h1"));
				return element;
	}
}
