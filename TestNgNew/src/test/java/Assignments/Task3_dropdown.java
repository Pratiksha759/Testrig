package Assignments;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task3_dropdown {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement select=driver.findElement(By.xpath("//select[@id='dropdown']"));

		
		Select down=new Select(select);
		int count=down.getOptions().size();
		Random random1=new Random();
		int index= random1.nextInt(1,3);
		down.selectByIndex(index);
		System.out.println("selected option is:"+ "Option "+index);
		//select.click();
		
		
		
		
		//driver.quit();
	
	}
}
