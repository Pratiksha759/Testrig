package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsak2_Rows {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		
		
				List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
		 
		
				for (WebElement row : allRows) {
					List<WebElement> cells = row.findElements(By.tagName("td"));

					
					for (WebElement cell : cells) {         
						System.out.print(cell.getText()+"    ");
					}
					System.out.println();
				}
			}

}
