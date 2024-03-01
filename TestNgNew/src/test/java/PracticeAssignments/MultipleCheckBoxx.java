package PracticeAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBoxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium_WebDriver\\ChromeDriver\\chromedriver_win32.chromedrive.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.cssSelector("#content > ul > li:nth-child(6) > a"));
		ele.click();
		WebElement element=driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)"));
		element.click();
		if(element.isSelected()) {
			System.out.println("Checkbox checked");
		}
		
		else {
			System.out.println("Element is not checked");
		}
		
		
		
		

	}

}
