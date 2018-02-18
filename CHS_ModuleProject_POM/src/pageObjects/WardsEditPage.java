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
public class WardsEditPage {

private static WebElement element = null;
	
	public static WebElement BackToList(WebDriver driver) {
		element = driver.findElement(By.linkText("Back to list"));
				return element;
	}
	public static WebElement SaveBtn(WebDriver driver) {
		element = driver.findElement(By.id("submit1"));
				return element;
	}
	
	public static WebElement ResetBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td/input[2]"));
				return element;
	}	
}
