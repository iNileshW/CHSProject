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
public class MaintainUsernamesPage {

private static WebElement element = null;
	

	public static WebElement Maintain_Username_Page(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[1]/tbody/tr/td[2]/font/b"));
				return element;
	}
	
	public static WebElement AddNew(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[1]/a"));
				return element;
	}
	
	public static WebElement LogOut(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[1]/tbody/tr/td[4]/table/tbody/tr/td[2]/a"));
				return element;
	}
	
	public static WebElement CPassword(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[1]/tbody/tr/td[4]/table/tbody/tr/td[4]/a"));
				return element;
	}
	
	public static WebElement Adv_Search(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[1]/tbody/tr/td[4]/table/tbody/tr/td[9]/a"));
				return element;
	}
	
	public static WebElement select_type(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[2]/select[1]"));
				return element;
	}
		
	public static WebElement select_condn(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[2]/select[2]"));
				return element;
	}	
	
	public static WebElement searchtxt(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[2]/input[1]"));
				return element;
	}
	
	public static WebElement searchbtn(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[2]/input[2]"));
				return element;
	}
	
	public static WebElement showallbtn(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[2]/input[3]"));
				return element;
	}
	
	public static WebElement Recordpp(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[4]/select"));
				return element;
	}
	
	public static WebElement SelectUnselect(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/a[1]"));
				return element;
	}
	
	public static WebElement Delete(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/a[2]"));
				return element;
	}
	
	public static WebElement User_Type(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr[1]/td[4]/table/tbody/tr/td[1]/a"));
				return element;
	}
	
	public static WebElement Login(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr[1]/td[5]/table/tbody/tr/td[1]/a"));
				return element;
	}
	
	public static WebElement Name(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr[1]/td[6]/table/tbody/tr/td[1]/a"));
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
	
	public static WebElement CheckBox1(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr[2]/td[3]/input[1]"));
				return element;
	}
	
	public static WebElement RecordCount(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[3]"));
				return element;
	}
	
	public static WebElement Page2(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr/td/a[1]"));
				return element;
	}
	
}
