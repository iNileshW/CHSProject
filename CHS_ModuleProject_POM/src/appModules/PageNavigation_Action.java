/**
 * 
 */
package appModules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * @author NX35WG
 *
 */
public class PageNavigation_Action {
public static void Execute(WebDriver driver, WebElement Rpp, String rcount) {
		
	 

	  int count = Integer.parseInt(rcount.substring(15,17));
	  System.out.println(count);
	  
	 /* @SuppressWarnings("unchecked")
	List<WebElement> drop = (List<WebElement>) (Rpp);*/
	  /*  @SuppressWarnings("unchecked")
	java.util.Iterator<WebElement> i = ((List<WebElement>) Rpp).iterator();
	  while(i.hasNext()) {
	      WebElement row = i.next();
	      System.out.println(row.getText());
	  }*/
	  
		  //new Select(pageObjects.WardRoundSheetPage.Recordpp(driver)).selectByIndex(i);
		  /*new Select (Rpp).selectByIndex(i);*/
		  
		  //String select1 = Rpp.getAttribute("value");
		  //System.out.println(Select (Rpp).getFirstSelectedOption().getText());
		  
		//  System.out.println(select11);
		  //String select1= ((WebElement) Select (Rpp)).getText();
		  //System.out.println(select1);
		  //String tmp = select.getFirstSelectedOption().getText();
		  
		  
		  
		  /*List<WebElement> drop = driver.findElements(By.name("customerId"));
		  java.util.Iterator<WebElement> i = drop.iterator();
		  while(i.hasNext()) {
		      WebElement row = i.next();
		      System.out.println(row.getText());
		  }*/ 
		  
		  /*public Boolean selectByText( String text ) {
			    WebElement dropDown = driver.findElement( By.xpath( ".//dropdown/path" ) );
			    dropDown.click();
			    List<WebElement> allOptions = dropDown.findElements(By.xpath(".//option"));
			    for ( WebElement we: allOptions) { 
			        dropDown.sendKeys( Keys.DOWN ); //simulate visual movement
			        sleep(250);       
			        if ( we.getText().contains( text ) ) select.selectByVisibleText("Value1");
			    }
			}*/
		  
		  //List <WebElement> select3 = (List<WebElement>) Select (Rpp).getFirstSelectedOption();
		  
		  //String s1 = ((WebElement) select).getText();
		  //new Select(Rpp).selectByIndex(i);
		  //String ddselection = (Rpp).getAttribute(arg0);
		  //String s1 = tmp.getText();
		  //System.out.println(tmp);
		  //System.out.println(s1);
		  //String ddselection = (Rpp).getCssValue("option value");
		  //String s1 = (Rpp).getText();
		//String s1 = (Rpp).getAttribute("value");
		  //System.out.println(s1);
		  //System.out.println(ddselection);
		  //int s2 = Integer.parseInt(s1);
		  //int s2 = Integer.parseInt(s1);
		  //int s2 = Integer.parseInt(tmp);
		  //System.out.println(s2);
		  
		  //int s2 = Integer.parseInt(select1);
		  int k=10;
		  for (int i=0;i<=5;i++) {//for records per page dropdown
			  if (i==0)
				  new Select (Rpp).selectByIndex(i);
			  else
				  Select (Rpp).selectByIndex(i);
		  int pagecount = (int) Math.ceil(count/k);
		  System.out.println(pagecount);
		  //Page navigation loop
		  if(pagecount >=3) {
		  for (int j=1;j<(pagecount);j++) { //for number of pages calculation
			  String jstring = String.valueOf(j);
			  //driver.findElement(By.linkText(jstring)).click();
			  driver.findElement(By.xpath("/html/body/table[3]/tbody/tr/td/a["+j+"]")).click();
			}
		  }
		  else if(pagecount ==2) {
			  	  driver.findElement(By.xpath("html/body/table[3]/tbody/tr/td/a")).click();
			 }
		  else {
			  
		  }
					  /*10 - 2 - /html/body/table[3]/tbody/tr/td/a[1]
					  10 - 3 - /html/body/table[3]/tbody/tr/td/a[2]
					  
					  20 - 2-html/body/table[3]/tbody/tr/td/a
					  30 - 0
					  50 - 0
					  100 - 0
					  500 - 0*/
			  
		  if (i<3) {
			  k = k+10;
		  }
		  else if (i==3) {
			  k = k+20;
		  }
		  else if (i==4) {
			  k = k+50;
		  }
		  else {
			  k = k+400;
		  }
	  
	  }
	}

private static Select Select(WebElement rpp) {
	// TODO Auto-generated method stub
	return null;
}

/*private static Select Select(WebElement rpp) {
	// TODO Auto-generated method stub
	return null;
}*/

public static void Execute1(WebDriver driver, int gcount, String rpp, WebElement Rpp) {
	new Select (Rpp).selectByValue(rpp);
	 if(gcount >=3) {
		  for (int j=1;j<gcount;j++) { //for number of pages calculation
			  String jstring = String.valueOf(j);
			  //driver.findElement(By.linkText(jstring)).click();
			  driver.findElement(By.xpath("/html/body/table[3]/tbody/tr/td/a["+j+"]")).click();
			}
		  }
		  else if(gcount ==2) {
			  	  driver.findElement(By.xpath("html/body/table[3]/tbody/tr/td/a")).click();
			 }
		  else {
			  System.out.println("Last Page");
		  }
	
	
}

}
