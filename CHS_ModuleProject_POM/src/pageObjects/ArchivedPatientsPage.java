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
public class ArchivedPatientsPage {

private static WebElement element = null;
	

	public static WebElement Archived_Patients_Page(WebDriver driver) {
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
	
	public static WebElement export_result(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[1]/tbody/tr/td[4]/table/tbody/tr/td[11]/a"));
				return element;
	}
		
	public static WebElement Print(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[1]/tbody/tr/td[4]/table/tbody/tr/td[14]/a"));
				return element;
	}
	
	public static WebElement Recordpp(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[3]/select"));
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
	
	public static WebElement ArchivedJobs1(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr[2]/td[4]/a"));
				return element;
	}
		
	public static WebElement Patient_Name(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr[1]/td[5]/table/tbody/tr/td[1]/a"));
				return element;
	}
	
	public static WebElement DOB(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr[1]/td[6]/table/tbody/tr/td[1]/a"));
				return element;
	}
	
	public static WebElement UnitNo(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr[1]/td[7]/table/tbody/tr/td[1]/a"));
				return element;
	}
	
	public static WebElement Sex(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr[1]/td[8]/table/tbody/tr/td[1]/a"));
				return element;
	}
	
	public static WebElement Ward(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr[1]/td[9]/table/tbody/tr/td[1]/a"));
				return element;
	}
	
	public static WebElement Bed(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr[1]/td[10]/table/tbody/tr/td[1]/a"));
				return element;
	}
	
	public static WebElement Consultant(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form[2]/table/tbody/tr[1]/td[11]/table/tbody/tr/td[1]/a"));
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
		element = driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[2]"));
				return element;
	}
	
	public static WebElement Page2(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr/td/a[1]"));
				return element;
	}
	
	public static WebElement Page3(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr/td/a[2]"));
				return element;
	}
}
