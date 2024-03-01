package PracticeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignIn {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();

		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement sign= wait.until(ExpectedConditions.elementToBeClickable(By.id("btn2")));
		 sign.click();
		 
		 
		 
			//WebDriver driver=new ChromeDriver();
//			WebDriver driver = new EdgeDriver();
//			driver.get("https://demo.automationtesting.in/Register.html");
//			driver.manage().window().maximize();
			
			//driver.manage()

	}
}
