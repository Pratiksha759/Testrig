package PracticeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllLocators {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
         driver.manage().window().maximize();
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      //   driver.findElement(By.id("footer"));
     	
     	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement uname= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[placeholder='First Name']")));
		 uname.sendKeys("karan@gmail.com");
		 WebElement pword= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[placeholder='Last Name']")));
		 pword.sendKeys("karan123");
       
		 WebElement address= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")));
		 address.sendKeys("at post pune 412707");
       
        // driver.findElement(By.cssSelector(".form-control.ng-pristine.ng-valid.ng-touched")).sendKeys("at post pune");

	//  driver.close();

	}

}
