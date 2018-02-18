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
public class WardsPage {

private static WebElement element = null;
	
	public static WebElement AddNew(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[1]/a"));
				return element;
	}
	public static WebElement WardList(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[1]/tbody/tr/td[2]/font/b"));
				return element;
	}
	
	public static WebElement RecordCount(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[2]"));
				return element;
	}
	
	public static WebElement Recordpp(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[3]/select"));
				return element;
	}
	
	public static WebElement Edit1(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr[2]/td[1]/a"));
				return element;
	}
	
	public static WebElement View1(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr[2]/td[2]/a"));
				return element;
	}
	
	public static WebElement Page2(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr/td/a"));
				return element;
	}
	
	public static WebElement Notes(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[8]/td[2]/textarea"));
				return element;
	}
	
	public static WebElement WardsColTitle(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr[1]/td[3]/table/tbody/tr/td[1]/a"));
				return element;
	}
}
