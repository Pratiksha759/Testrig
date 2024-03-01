package PracticeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputFile {
	
	
	public static void main(String[] args) {
		
	       
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();

		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement sign= wait.until(ExpectedConditions.elementToBeClickable(By.id("btn2")));
		 sign.click();

       		WebElement fileInput = driver.findElement(By.id("imagesrc"));
          String filePath = "C:\\Users\\TESTRIG\\Documents\\Assignment_Testng.txt";
 
                  
        fileInput.sendKeys(filePath);
 		       
}


}
