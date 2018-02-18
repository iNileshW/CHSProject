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
public class NurseHandoverAddNewPage {

private static WebElement element = null;
	
	public static WebElement Add_New_Page(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/h1"));
				return element;
	}

	public static WebElement Back_To_List(WebDriver driver) {
		element = driver.findElement(By.linkText("Back to list"));
				return element;
	}
	
	public static WebElement Ward(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/select"));
				return element;
	}
	
	public static WebElement Bed(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input"));
				return element;
	}
	
	public static WebElement Patient_Name(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input"));
				return element;
	}
	
	public static WebElement DOB(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[4]/td[2]/input[1]"));
				return element;
	}
	
	public static WebElement UnitNo(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[5]/td[2]/input"));
				return element;
	}
	
	public static WebElement Sex(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[6]/td[2]/select"));
				return element;
	}
	
	public static WebElement Consultant(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[7]/td[2]/select"));
				return element;
	}
	
	public static WebElement Code(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[8]/td[2]/select"));
				return element;
	}
	
	public static WebElement Diagnosis(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[9]/td[2]/textarea"));
				return element;
	}
	
	public static WebElement Allergies(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[10]/td[2]/input"));
				return element;
	}
	
	public static WebElement Nurses(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[11]/td[2]/input"));
				return element;
	}
	
	public static WebElement SS(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[12]/td[2]/input"));
				return element;
	}
	
	public static WebElement Team(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[13]/td[2]/input"));
				return element;
	}
	
	public static WebElement Notes(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[14]/td[2]/textarea"));
				return element;
	}
	
	public static WebElement Save(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[15]/td/input[1]"));
				return element;
	}
	
	public static WebElement Reset(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[15]/td/input[2]"));
				return element;
	}
}
