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
public class ArchivedJobsAdvSearchPage {

private static WebElement element = null;
	
	public static WebElement Back_To_List(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[12]/td/input[3]"));
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
	
	public static WebElement Patient_Name_NotCB(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[4]/td[2]/input"));
				return element;	
	}
	
	public static WebElement Patient_Name_cond(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[4]/td[3]/select"));
				return element;	
	}
	
	
	public static WebElement Patient_Name_txtbox(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[4]/td[4]/input"));
				return element;	
	}
	
	public static WebElement Consultant_Name_NotCB(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[5]/td[2]/input"));
				return element;	
	}
	
	public static WebElement Consultant_Name_txtbox(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[4]/input"));
				return element;	
	}

	public static WebElement Consultant_cond(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[5]/td[3]/select"));
				return element;	
	}
	
	public static WebElement Date_NotCB(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[6]/td[2]/input"));
				return element;	
	}
	
	public static WebElement Date_cond(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[6]/td[3]/select"));
				return element;	
	}
	
	public static WebElement Date_txtbox(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[6]/td[4]/input[1]"));
				return element;	
	}

	public static WebElement Type_NotCB(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[7]/td[2]/input"));
				return element;	
	}
	
	public static WebElement Type_cond(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[7]/td[3]/select"));
				return element;	
	}
	
	public static WebElement Type_txtbox(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[7]/td[4]/input"));
				return element;	
	}

	public static WebElement Status_NotCB(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[8]/td[2]/input"));
				return element;	
	}
	
	public static WebElement Status_cond(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[8]/td[3]/select"));
				return element;	
	}
	
	public static WebElement Status_txtbox(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[8]/td[4]/input"));
				return element;	
	}
	
	public static WebElement Name_NotCB(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[9]/td[2]/input"));
				return element;	
	}
	
	public static WebElement Name_cond(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[9]/td[3]/select"));
				return element;	
	}

	public static WebElement Name_txtbox(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[9]/td[4]/input"));
				return element;	
	}

	public static WebElement Result_NotCB(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[10]/td[2]/input"));
				return element;	
	}
	
	public static WebElement Result_cond(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[10]/td[3]/select"));
				return element;	
	}
	
	public static WebElement Result_txtbox(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[10]/td[4]/input"));
				return element;	
	}

	public static WebElement Notes_NotCB(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[11]/td[2]/input"));
				return element;	
	}
	
	public static WebElement Notes_cond(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[11]/td[3]/select"));
				return element;	
	}
	
	public static WebElement Notes_txtbox(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[11]/td[4]/input"));
				return element;	
	}
	
	
	/*public static WebElement Patient_Name_Condn(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[4]/td[3]/select"));
				return element;	
	}*/
	
	/*public static WebElement Consultant_NotCB(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[4]/td[2]/input"));
				return element;	
	}
	
	public static WebElement Consultant_Condn(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[5]/td[3]/select"));
				return element;	
	}
	
	public static WebElement Consultant_Txtbox(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[5]/td[4]/select"));
				return element;	
	}
	
	public static WebElement Date_NotCB(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[4]/td[2]/input"));
				return element;	
	}
	
	public static WebElement Date_Condn(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[6]/td[3]/select"));
				return element;	
	}
	
	public static WebElement Date_Txtbox(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[6]/td[4]/select"));
				return element;	
	}

	public static WebElement Type_NotCB(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[4]/td[2]/input"));
				return element;	
	}
	
	public static WebElement Type_Condn(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[7]/td[3]/select"));
				return element;	
	}
	
	public static WebElement Type_Txtbox(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[7]/td[4]/select"));
				return element;	
	}

	public static WebElement Status_NotCB(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[8]/td[2]/input"));
				return element;	
	}
	
	public static WebElement Status_Condn(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[8]/td[3]/select"));
				return element;	
	}
	
	public static WebElement Status_Txtbox(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[8]/td[4]/select"));
				return element;	
	}

	public static WebElement Name_NotCB(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[9]/td[2]/input"));
				return element;	
	}
	
	public static WebElement Name_Condn(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[9]/td[3]/select"));
				return element;	
	}
	
	public static WebElement Name_DropDown(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[9]/td[4]/select"));
				return element;	
	}

	public static WebElement Result_NotCB(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[10]/td[2]/input"));
				return element;	
	}
	
	public static WebElement Result_Condn(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[10]/td[3]/select"));
				return element;	
	}
	
	public static WebElement Result_DropDown(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[10]/td[4]/select"));
				return element;	
	}

	public static WebElement Notes_NotCB(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[11]/td[2]/input"));
				return element;	
	}
	
	public static WebElement Notes_Condn(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[11]/td[3]/select"));
				return element;	
	}
	
	public static WebElement Notes_Txtbox(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/form/table/tbody/tr[11]/td[4]/select"));
				return element;	
	}
*/	
	public static WebElement Search_Button(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[12]/td/input[1]"));
				return element;	
	}
	
	public static WebElement Reset_Button(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[12]/td/input[2]"));
				return element;	
	}
	
}
