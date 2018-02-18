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
public class DoctorHandoverSheetAdvSearchPage {

private static WebElement element = null;
	
	public static WebElement Back_To_List(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td/input[3]"));
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
	
	public static WebElement Ward_NotCB(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[4]/td[2]/input"));
				return element;	
	}
	
	public static WebElement Ward_Condn(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[4]/td[3]/select"));
				return element;	
	}
	
	public static WebElement Ward_Txtbox(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[4]/td[4]/input"));
				return element;	
	}
	
	public static WebElement Consultant_NotCB(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[5]/td[2]/input"));
				return element;	
	}
	
	public static WebElement Consultant_Condn(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[5]/td[3]/select"));
				return element;	
	}
	
	public static WebElement Consultant_Txtbox(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[5]/td[4]/input"));
				return element;	
	}
	
	public static WebElement Search_Button(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[6]/td/input[1]"));
				return element;	
	}
	
	public static WebElement Reset_Button(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[6]/td/input[2]"));
				return element;	
	}
	
}
