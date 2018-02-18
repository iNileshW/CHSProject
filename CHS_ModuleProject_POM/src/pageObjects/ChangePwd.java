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
public class ChangePwd {

	private static WebElement element = null;
	
	public static WebElement changePwdPage(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/form/table/tbody/tr[1]/td/b/font"));
				return element;
	}
	
	public static WebElement opass(WebDriver driver) {
		element = driver.findElement(By.name("opass"));
				return element;
	}
	
	public static WebElement newpass(WebDriver driver) {
		element = driver.findElement(By.name("newpass"));
				return element;
	}
	
	public static WebElement cpass(WebDriver driver) {
		element = driver.findElement(By.name("cpass"));
				return element;
	}
	
	public static WebElement Submit(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/form/table/tbody/tr[2]/td/div/table/tbody/tr[5]/td/input[2]"));
				return element;
	}
	
	public static WebElement Back(WebDriver driver) {
		element = driver.findElement(By.linkText("Back"));
				return element;
	}
	
	public static WebElement msgChangePwd(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr/td/div/table/tbody/tr/td"));
				return element;
	}
}
