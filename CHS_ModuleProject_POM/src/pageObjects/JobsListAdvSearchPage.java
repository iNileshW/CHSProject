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
public class JobsListAdvSearchPage {

private static WebElement element = null;
	
	public static WebElement Back_To_List(WebDriver driver) {
		element = driver.findElement(By.linkText("Back to list"));
				return element;
	}
	
	public static WebElement All_Cond(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/input[1]"));
				return element;		
	}
				
	public static WebElement Any_Cond(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div/input[2]"));
				return element;	
	}
	
	public static WebElement Patient_NotCB(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[4]/td[2]/input"));
				return element;	
	}
	
	public static WebElement Patient_Condn(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[4]/td[3]/select"));
				return element;	
	}
	
	public static WebElement Patient_Txtbox(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[4]/td[4]/input"));
				return element;	
	}
	
	public static WebElement Consul_NotCB(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[5]/td[2]/input"));
				return element;	
	}
	
	public static WebElement Consul_Condn(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[5]/td[3]/select"));
				return element;	
	}
	
	public static WebElement Consul_DropDown(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[5]/td[4]/select"));
				return element;	
	}
	
	public static WebElement Date_NotCB(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[6]/td[2]/select"));
				return element;	
	}
	
	public static WebElement Date_Condn(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[6]/td[3]/select"));
				return element;	
	}
	
	public static WebElement Date_Txtbox(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[6]/td[4]/input[1]"));
				return element;	
	}
	
	public static WebElement Type_Not(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[7]/td[2]/input"));
				return element;	
	}
	
	public static WebElement Type_Condn(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[7]/td[3]/input"));
				return element;	
	}
	
	public static WebElement Type_DropDown(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[7]/td[4]/input"));
				return element;	
	}
	
	public static WebElement Status_Not(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[8]/td[2]/select"));
				return element;	
	}
	
	public static WebElement Status_Condn(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[8]/td[2]/select"));
				return element;	
	}
	
	public static WebElement Status_DropDown(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[8]/td[4]/select"));
				return element;	
	}
	
	
	public static WebElement Search_Button(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[9]/td/input[1]"));
				return element;	
	}
	
	public static WebElement Reset_Button(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[9]/td/input[2]"));
				return element;	
	}
	
}
