package PracticeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Address1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.automationtesting.in/Index.html");
			driver.manage().window().maximize();

			WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement sign= wait.until(ExpectedConditions.elementToBeClickable(By.id("btn2")));
			 sign.click();
			 
			 	WebElement name= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(2) > input")));
			 name.sendKeys("ppathare759@gmail.com");
			 WebElement lname= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input")));
			 lname.sendKeys("Pass@123");
			 WebElement address= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#basicBootstrapForm > div:nth-child(2) > div > textarea")));
			 address.sendKeys("at post pune");

	}
}
