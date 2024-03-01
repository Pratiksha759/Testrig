package PracticeAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.test.HomePage;

public class flipcart1 {
	@Test
	void buyABook() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.automationtesting.in/");
		
		HomePage hp=new HomePage(driver);
		hp.clickAddBasketBtn();
		
	}
}
