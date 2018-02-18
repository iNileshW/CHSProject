/**
 * 
 */
package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Constant;
import utility.ExcelUtils;

/**
 * @author NX35WG
 *In this we will read the values from the Excel sheet to use them as the test data and write the test result in the Excel.
 */
public class Apache_POI_TC {

	private static WebDriver driver = null;
	public static void main(String[] args) throws Exception {
		 //This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method
		
		ExcelUtils.setExcelFile (Constant.Path_TestData,"Sheet1");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(Constant.URL);
		ExcelUtils.setCellData("Pass", 1, 3);
	}
}
