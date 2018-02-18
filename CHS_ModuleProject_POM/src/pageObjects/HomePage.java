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
public class HomePage {
private static WebElement element = null;
	
	public static WebElement Inpatients(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/a[1]"));
				return element;
	}
	
	public static WebElement Jobs_List(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/a[2]"));
				return element;
	}
	
	public static WebElement Ward_Round_Sheet(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/a[3]"));
				return element;
	}
	
	public static WebElement Nurse_Handover(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/a[4]"));
				return element;
	}
	
	public static WebElement Doctor_Handover(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/a[5]"));
				return element;
	}
	
	public static WebElement Wards(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/a[6]"));
				return element;
	}
	
	public static WebElement Consultants(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/a[7]"));
				return element;
	}
	
	public static WebElement Archived_Jobs(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/a[8]"));
				return element;
	}
	
	public static WebElement Archived_Patients(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/a[9]"));
				return element;
	}
	
	public static WebElement Maintain_Usernames(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/a[10]"));
				return element;
	}
	
	
}
