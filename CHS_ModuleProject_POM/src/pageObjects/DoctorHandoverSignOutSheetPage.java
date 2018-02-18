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
public class DoctorHandoverSignOutSheetPage {

private static WebElement element = null;
	

	public static WebElement Sign_Out_Sheet_Page(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td[2]/font/b"));
				return element;
	}
	
	public static WebElement Recordpp(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/select"));
				return element;
	}
	
	public static WebElement Location(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr[1]/td[1]/table/tbody/tr/td[1]/a"));
				return element;
	}
	
	public static WebElement Patient(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr[1]/td[1]/table/tbody/tr/td[1]/a"));
				return element;
	}
	
	public static WebElement Sex(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr[1]/td[3]/table/tbody/tr/td[1]/a"));
				return element;
	}
	
	public static WebElement Diagnosis(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr[1]/td[4]/table/tbody/tr/td[1]/a"));
				return element;
	}
	
	public static WebElement Allergies(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr[1]/td[5]/table/tbody/tr/td[1]/a"));
				return element;
	}
	
	public static WebElement Code(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr[1]/td[6]/table/tbody/tr/td[1]/a"));
				return element;
	}
	
	public static WebElement Notes(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr[1]/td[7]/table/tbody/tr/td[1]/a"));
				return element;
	}
	
	public static WebElement RecordCount(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]"));
				return element;
	}
	
	public static WebElement Page2(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[3]/tbody/tr/td/a[1]"));
				return element;
	}
	
	public static WebElement Page3(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[3]/tbody/tr/td/a[2]"));
				return element;
	}
	
	public static WebElement Page4(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[3]/tbody/tr/td/a[3]"));
				return element;
	}
	
	public static WebElement LogOut(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td[4]/table/tbody/tr/td[2]/a"));
				return element;
	}
	
	public static WebElement CPassword(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[1]/tbody/tr/td[4]/table/tbody/tr/td[4]/a"));
				return element;
	}
	
	public static WebElement Adv_Search(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[1]/tbody/tr/td[4]/table/tbody/tr/td[6]/a"));
				return element;
	}
	
	public static WebElement Print(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[1]/tbody/tr/td[4]/table/tbody/tr/td[9]/a"));
				return element;
	}
	
}
