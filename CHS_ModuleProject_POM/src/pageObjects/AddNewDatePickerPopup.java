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
public class AddNewDatePickerPopup {

private static WebElement element = null;
	
	public static WebElement Month(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/font/select[1]"));
				return element;
	}
	
	public static WebElement Year(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/font/select[1]"));
				return element;
	}

	/*public static WebElement Day(WebDriver driver, Date) {
		element = driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/font/select[1]"));
				return element;
	}*/
}
