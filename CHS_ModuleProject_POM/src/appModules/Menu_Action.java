/**
 * 
 */
package appModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.HomePage;
/**
 * @author NX35WG
 *
 */
public class Menu_Action {
public static void Execute(WebDriver gdriver,String gModule) {
		
		WebDriverWait wait = new WebDriverWait(gdriver,10);
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("leftFrame"));
		
		if(gModule.equals("Inpatients")) {
			wait.until(ExpectedConditions.elementToBeClickable(HomePage.Inpatients(gdriver))).click();
			HomePage.Inpatients(gdriver).click();
		}
		else if(gModule.equals("Jobs List")) {
			wait.until(ExpectedConditions.elementToBeClickable(HomePage.Jobs_List(gdriver))).click();
			HomePage.Jobs_List(gdriver).click();
		}
		else if(gModule.equals("Ward Round Sheet")) {
			HomePage.Ward_Round_Sheet(gdriver).click();
		}
		else if(gModule.equals("Nurse Handover")) {
			HomePage.Nurse_Handover(gdriver).click();
		}
		
		else if(gModule.equals("Doctor Handover")) {
			HomePage.Doctor_Handover(gdriver).click();
		}
		else if(gModule.equals("Wards")) {
			HomePage.Wards(gdriver).click();
		}
		else if(gModule.equals("Consultants")) {
			HomePage.Consultants(gdriver).click();
		}
		else if(gModule.equals("Archived Patients")) {
			HomePage.Archived_Patients(gdriver).click();
		}
		else if(gModule.equals("Archived Jobs")) {
			HomePage.Archived_Jobs(gdriver).click();
		}
		else if(gModule.equals("Maintain Usernames")) {
			HomePage.Maintain_Usernames(gdriver).click();
		}
		
		gdriver.switchTo().defaultContent();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainFrame")); 
	}
}
