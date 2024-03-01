package PracticeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.automationtesting.in/Index.html");
			driver.manage().window().maximize();

			WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
			
			 WebElement sign= wait.until(ExpectedConditions.elementToBeClickable(By.id("btn2")));
			 sign.click();
			 
			 WebElement signb = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#header > nav > div > div.navbar-collapse.navbar-right.collapse.in > ul > li:nth-child(4) > a")));
			 signb.click();
			 
		driver.findElement(By.cssSelector("body > div.container.center > div > div > div > div.tabpane.pullleft > ul > li:nth-child(3) > a")).click();
		driver.findElement(By.cssSelector("#Textbox > button")).click();
		driver.switchTo().alert().sendKeys("I have sent keys");

	}
}
