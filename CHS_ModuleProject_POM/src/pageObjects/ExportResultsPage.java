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
public class ExportResultsPage {

private static WebElement element = null;
	
	public static WebElement AllrecordsRadio(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[1]/input[1]"));
				return element;
	}
		
	public static WebElement CurrentpageRadio(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[1]/input[2]"));
				return element;
	}
	
	public static WebElement ExcelRadio(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input[1]"));
				return element;
	}
	
	public static WebElement WordRadio(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input[2]"));
				return element;
	}
	
	public static WebElement CSVRadio(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[2]/input[3]"));
				return element;
	}
	
	public static WebElement XMLRadio(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input[4]"));
				return element;
	}
	
	public static WebElement ExportBtn(WebDriver driver) {
		element = driver.findElement(By.id("btnSubmit"));
				return element;
	}
	
	
	
}
