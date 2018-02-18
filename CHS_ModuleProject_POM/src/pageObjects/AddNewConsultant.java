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
public class AddNewConsultant {

	
private static WebElement element = null;

	public static WebElement backtolist(WebDriver driver) {
		element = driver.findElement(By.linkText("Back to list"));
				return element;
	}
	
	public static WebElement Consultant_Name(WebDriver driver) {
		element = driver.findElement(By.name("newitem"));
				return element;
	}
	
	public static WebElement Save_Button(WebDriver driver) {
		element = driver.findElement(By.id("submit1"));
				return element;
	}
	
	public static WebElement close_window(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/div/input[3]"));
				return element;
	}
	public static WebElement Reset_Button(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td/input[2]"));
				return element;
	}			
	public static WebElement Consultant_Txtbox(WebDriver driver) {
		element = driver.findElement(By.name("value_Consultant"));
				return element;
	}
							
	}

