/**
 * 
 */
package appModules;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.LogInPage;
import utility.Constant;
import utility.ExcelUtils;

/**
 * @author NX35WG
 *
 */
public class LogIn_User_Action {
	
	public static WebDriver driver = null;
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	/*public static void Execute(WebDriver driver,int i) throws Exception {
			
			
	}*/
	//This method is to set the File path and to open the Excel file, Pass Excel Path and 
	//Sheetname as Arguments to this method
	public static void setExcelFile() throws Exception {
			try {
   			// Open the Excel file
			//FileInputStream ExcelFile = new FileInputStream(utility.Constant.Path_TestData+utility.Constant.File_TestData);
			FileInputStream ExcelFile = new FileInputStream(utility.Constant.Path_TestData);
			// Access the required test data sheet
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(utility.Constant.SheetName);
			} catch (Exception e){
				throw (e);
			}

	}
	
	//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num
    public static String getCellData(int RowNum, int ColNum) throws Exception{
			try{
				FileInputStream ExcelFile = new FileInputStream(utility.Constant.Path_TestData+utility.Constant.File_TestData);
				System.out.println(ExcelFile);
				// Access the required test data sheet
				ExcelWBook = new XSSFWorkbook(ExcelFile);
				System.out.println(ExcelWBook);
				ExcelWSheet = ExcelWBook.getSheet(utility.Constant.SheetName);
				System.out.println(ExcelWSheet);
  			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
  			String CellData = Cell.getStringCellValue();
  			return CellData;
  			}catch (Exception e){
				return"";
  			}

    }

	public static void Execute1(WebDriver driver2) throws Exception {
		// TODO Auto-generated method stub
			 
		for(int i=7;i<=31;i++) {
			//FileInputStream ExcelFile = new FileInputStream(utility.Constant.Path_TestData+utility.Constant.File_TestData);
			/*String uid = ExcelUtils.
			ExcelUtils.setExcelFile (Constant.Path_TestData,"Sheet1");*/
		String uid = getCellData(i,4);
		String pwd = getCellData(i,6);	
		
		//driver.get(utility.Constant.URL);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(LogInPage.username(driver))).clear();
		LogInPage.username(driver).sendKeys(uid);
		LogInPage.password(driver).clear();
		LogInPage.password(driver).sendKeys(pwd);
		LogInPage.remember_password(driver).click();
		wait.until(ExpectedConditions.elementToBeClickable(LogInPage.Submit(driver))).click();
		LeftFrameSwitch_Action.Execute(driver);
		  Menu_Action.Execute(driver,utility.Constant.Module10);
		  MainFrameSwitch_Action.Execute(driver);
		  pageObjects.MaintainUsernamesPage.LogOut(driver).click();
		}
	}
}
		
			
	//With Excel Sheet-->
	/*public static void Execute(WebDriver driver) throws Exception{
	
	driver.get("http://13.59.25.55:8888/chs/");
	
	String sUsername = ExcelUtils.getCellData(1,1);
	String sPassword = ExcelUtils.getCellData(1,2);
	LogInPage.username(driver).clear();
	LogInPage.username(driver).sendKeys(sUsername);
	LogInPage.password(driver).clear();
	LogInPage.password(driver).sendKeys(sPassword);
	LogInPage.remember_password(driver).click();
	LogInPage.Submit(driver).click();
	}*/
	

