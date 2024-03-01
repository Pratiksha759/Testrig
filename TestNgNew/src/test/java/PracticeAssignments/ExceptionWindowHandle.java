package PracticeAssignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExceptionWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.testrigtechnologies.com/");
		driver.findElement(By.xpath("//*[@id=\"copyright\"]/div/div[2]/ul/li[4]/a/i")).click();
		String cid=driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Set<String> allid=driver.getWindowHandles();//*[@id="copyright"]/div/div[2]/ul/li[4]/a/i
		
		
		for(String i:allid)
		{
			if(!(i.equals(cid))){
				driver.switchTo().window(i);
			}
		}
		//driver.switchTo().window(cid);
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
		
//		WebElement button = driver.findElement(By.xpath(cid));
//		button.click();
//		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement uname= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#organization_guest_contextual-sign-in_sign-in-modal_session_key")));
		 uname.sendKeys("pratiksha@gmail.com");
		 WebElement pword= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#organization_guest_contextual-sign-in_sign-in-modal_session_password")));
		 pword.sendKeys("123");
		 WebElement sign= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#organization_guest_contextual-sign-in_sign-in-modal > div > section > div > div > form > div.flex.justify-between.sign-in-form__footer--full-width > button")));
		 sign.click();
		 String verificationCode = fetchVerificationCodeFromEmail("com");
		 
	        WebElement vcode = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#input__email_verification_pin")));
	        vcode.sendKeys(verificationCode);
	        
	        WebElement verify= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#email-pin-submit-button")));
			 sign.click();
	    }
	 

	    private static String fetchVerificationCodeFromEmail(String email) {
	        
	        return "123456";	       
		    
	    }

	

}
