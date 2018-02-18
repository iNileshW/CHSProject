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
public class EditPage {

private static WebElement element = null;
	
	public static WebElement Back_To_List(WebDriver driver) {
		element = driver.findElement(By.linkText("Back to list"));
				return element;
	}
	public static WebElement Consultant(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/select"));
				return element;
	}
	
	public static WebElement Date(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
				return element;
	}
	
	public static WebElement Type(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[4]/td[2]/select"));
				return element;
	}
	
	public static WebElement Status(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[5]/td[2]/select"));
				return element;
	}
	
	public static WebElement Name(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[6]/td[2]/input"));
				return element;
	}
	
	public static WebElement Result(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[7]/td[2]/textarea"));
				return element;
	}
	
	public static WebElement Notes(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[8]/td[2]/textarea"));
				return element;
	}
	
	public static WebElement Save(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[9]/td/input[1]"));
				return element;
	}
	
	public static WebElement Reset(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[9]/td/input[2]"));
				return element;
	}
}
