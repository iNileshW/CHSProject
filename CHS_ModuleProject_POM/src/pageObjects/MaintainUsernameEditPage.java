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
public class MaintainUsernameEditPage {

private static WebElement element = null;
	
	public static WebElement EditPage(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/h1"));
				return element;
	}

	public static WebElement Back_To_List(WebDriver driver) {
		element = driver.findElement(By.linkText("Back to list"));
				return element;
	}
	
	public static WebElement Save_Button(WebDriver driver) {
		element = driver.findElement(By.id("submit1"));
				return element;
	}
	
	public static WebElement Record_Added_Msg(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/div[1]"));
				return element;
	}
	
	public static WebElement Reset_Button(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[5]/td/input[2]"));
				return element;
	}
	
	public static WebElement logintxtbox(WebDriver driver) {
		element = driver.findElement(By.name("value_Login"));
				return element;
	}
	
	public static WebElement Nametxtbox(WebDriver driver) {
		element = driver.findElement(By.xpath("value_Name"));
				return element;
	}
	public static WebElement Passwordtxtbox(WebDriver driver) {
		element = driver.findElement(By.xpath("value_Password"));
				return element;
	}
	public static WebElement UserTypedd(WebDriver driver) {
		element = driver.findElement(By.xpath("value_User_Type"));
				return element;				
	}
	
}
