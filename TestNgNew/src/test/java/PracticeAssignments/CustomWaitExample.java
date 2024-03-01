package PracticeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWaitExample {
	public static void main(String[] args) {
		
		  WebDriver driver = new ChromeDriver();
		  driver.get("");
		  driver.manage().window().maximize();
	      try {
	       //   WebDriverWait customWait = new WebDriverWait(driver, 2);
	          boolean frameSwitched = false;

	         
	          int attempts = 0;
	          int maxAttempts = 5;

	          while (!frameSwitched && attempts < maxAttempts) {
	              try {
//	customWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("PegaGadget0Ifr")));
	                  frameSwitched = true; // Set to true if the frame switch is successful
	              } catch (Exception e) {
	                  System.out.println("Attempt #" + (attempts + 1) + ": " + e.toString());
	                  attempts++;
	              }
	          }

	                    if (frameSwitched) {
	              System.out.println("Frame switch successful!");
	                       } else {
	              System.out.println("Frame switch failed after " + maxAttempts + " attempts.");
	            
	          }

	      } catch (Exception e) {
	          System.out.println("Unexpected error: " + e.toString());
	      }
	  }{
			// TODO Auto-generated method stub

		}
}
