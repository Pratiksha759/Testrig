package TestNg_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class flipcart2 {
	@Test(groups = {"Smoke","Regression"})
	void buyABook() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.automationtesting.in/");
		Homepage2 hp=new Homepage2(driver);
		hp.clickAddBasketBtn();
		System.out.println(Thread.currentThread().getId());
	}
	@Test(groups = "Regression")
	void LikeaProduct() {
	}
	@Test(groups = "Regression")
	void clickOnHelp() {
	}
	@Test(groups = {"Smoke","Regression"})
	void Login() {
	}
}
