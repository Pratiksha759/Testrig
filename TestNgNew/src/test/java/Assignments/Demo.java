package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		driver.manage().window().maximize();
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[1]"));
		element1.click();
		
		
		
		WebElement radio2=driver.findElement(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(4) > div.panel-body > label:nth-child(2) > input[type=radio]"));
		radio2.click();
		
		WebElement radio1=driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input"));
	//	radio1.click();
		
		
//		System.out.println(radio1.isSelected());
//		System.out.println(radio2.isSelected());
//		
		if(radio1.isSelected()) {
		System.out.println("Checkbox  is checked");
	}
		
		else {
		System.out.println("Element is not checked");
		}
		
//		WebElement element3 = driver.findElement(By.xpath("//button[@id='buttoncheck']"));
//		element3.click();
		
		
		WebElement msg=driver.findElement(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(4) > div.panel-body > p.radiobutton"));
		String txt= msg.getText();
		System.out.println("the given text is:" + txt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().back();
	}
}
