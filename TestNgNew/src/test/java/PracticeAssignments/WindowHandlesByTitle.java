package PracticeAssignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesByTitle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.boat-lifestyle.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"shopify-section-footer\"]/footer/div[2]/div/div[3]/div[1]/div[1]/div/div/ul/li[5]/a")).click();
		
		String cid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		
		// Iterate through all handles
		Iterator<String> iterator = allid.iterator();
		while (iterator.hasNext()) {
		    String handle = iterator.next();
		    // Switch to the new window
		    if (!handle.equals(cid)) {
		        driver.switchTo().window(handle);
		        System.out.println(driver.getTitle()); // Print the title of the new window
		        driver.close();
		        break; // Exit the loop after closing the new window
		    }
		}
		 
		// Switch back to the main window
		driver.switchTo().window(cid);		
	//	driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/section/div/div[2]/div[1]/h1")).click();

	}
}
