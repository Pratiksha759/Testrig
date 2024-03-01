package PracticeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try_Catch_custom {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.findElement(By.cssSelector("#display-other-button")).click();
		while(true) {
			try {
				boolean a=driver.findElement(By.cssSelector("#hidden")).isDisplayed();
				if(a) {
					System.out.println("Button is displayed");
					driver.quit();
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}


}
