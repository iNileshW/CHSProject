package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LogInPage {

private static WebElement element = null;
	
	public static WebElement username(WebDriver driver) {
		element = driver.findElement(By.name("username"));
				return element;
	}
	
	public static WebElement password(WebDriver driver) {
		element = driver.findElement(By.name("password"));
				return element;
	}
	
	public static WebElement remember_password(WebDriver driver) {
		element = driver.findElement(By.name("remember_password"));
				return element;
	}
	
	public static WebElement Submit(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/form/table/tbody/tr[2]/td/div/table/tbody/tr[5]/td/input[2]"));
				return element;
	}
	
	public static WebElement validationmsg(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/form/table/tbody/tr[2]/td/div/table/tbody/tr[7]/td/font"));
				return element;
	}
}
