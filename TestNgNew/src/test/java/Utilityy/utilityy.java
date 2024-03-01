package Utilityy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class utilityy {
	
	public static void pClick( WebElement element) {
		element.click();
		    }
		 
     public static void scrollToElement(JavascriptExecutor js, WebElement element) {
		        js.executeScript("arguments[0].scrollIntoView(true);", element);
		    }
		 
    public static void sendKeys(WebElement element, String value) {
		        element.sendKeys(value);
		    }

}
