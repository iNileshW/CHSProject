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
public class AddNewWardList {

	
private static WebElement element = null;
	
	public static WebElement Ward_Name(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
				return element;
	}
	
	public static WebElement Save_Button(WebDriver driver) {
		element = driver.findElement(By.id("submit1"));
				return element;
	}
	
	public static WebElement reset_Button(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td/input[2]"));
				return element;
	}
	
	public static WebElement backtolist(WebDriver driver) {
		element = driver.findElement(By.linkText("Back to list"));
				return element;
	}
}
