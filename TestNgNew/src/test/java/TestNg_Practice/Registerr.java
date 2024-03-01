package TestNg_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerr {

	WebDriver driver=new ChromeDriver();
	  
	@FindBy(id="logo")
	private WebElement signIn;
	
	@FindBy(id="email")
	private WebElement fill;
	
	@FindBy(id="enterimg")
	private WebElement btn ;
	
	
	Registerr(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	void clickBtn() { 
		signIn.click();
		btn.click();
	}
	
	
	void fillField() {
		fill.sendKeys("karan@gmail.com");
	}
}
