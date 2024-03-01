package Assignments;
 
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class Implicit {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().window().maximize();
		WebElement element1 = driver.findElement(By.cssSelector("#post-body-7708391096228750161 > button"));
		element1.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String s1=driver.getWindowHandle();
		Set<String> s2=driver.getWindowHandles();
		for(String s: s2) {
			if(!(s.equals(s1))) {
				driver.switchTo().window(s);
			}
		}
		
		
		WebElement element2 = driver.findElement(By.cssSelector("#blog-pager > a"));
		element2.click();
	}
}