/**
 * 
 */
package appModules;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

/**
 * @author NX35WG
 *
 */
public class WindowResize_Action {
public static void Execute(WebDriver driver) {
		
	//System.out.println(driver.manage().window().getSize());
	Dimension d = new Dimension(620,650);
	//Resize the current window to the given dimension
	driver.manage().window().setSize(d);
	driver.manage().window().setPosition(new Point(0,0));
	
	}
}
