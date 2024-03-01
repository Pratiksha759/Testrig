package Assignments;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4_checkboxx {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
		Random random=new Random();
		int index=random.nextInt(2,198);
		 
		WebElement checkbox= allRows.get(index).findElement(By.className("hasVisited"));
		checkbox.click();
		
		String content= allRows.get(index).getText();
		System.out.println(" Content of the row :"+ index+" "+content);
		
		Thread.sleep(1000);
		
		driver.quit();

	}

}
