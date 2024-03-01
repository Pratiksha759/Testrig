package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Wait<WebDriver>wait = new WebDriverWait(driver,Duration.ofSeconds(150));
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		driver.manage().window().maximize();
		
		List<WebElement> element= driver.findElements(By.cssSelector("#countries > tbody > tr"));
		
		System.out.println(" Row count is: "+element.size());
		

		List<WebElement> element1= driver.findElements(By.cssSelector("#countries > tbody > tr:nth-child(1)>td>h3"));
		
		System.out.println(" column count is: "+element1.size());
		
		List<WebElement> element2=driver.findElements(By.cssSelector("#countries > tbody > tr:nth-child(1)>td>h3"));
		
		for(WebElement elements: element2) {
			System.out.println(elements.getText());
		}

	}
}
