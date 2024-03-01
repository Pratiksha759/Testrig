package TestNg_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.HomePage;

public class flipcart_dataProvider {
	
	@Test(groups = {"Smoke","Regression"})
		void buyABook() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://practice.automationtesting.in/");

			HomePage hp=new HomePage(driver);
			hp.clickAddBasketBtn();
		}
		@Test(groups = "Regression")
		void LikeaProduct() {
		}
		@Test(groups = "Regression")
		void clickOnHelp() {
		}
		@Test(groups = {"Smoke","Regression"},dataProvider = "userdetails")
		void Login(String username,String password) {
			System.out.println("user: "+username);
			System.out.println("password: "+password);
		}
		@DataProvider(name="userdetails")
		Object[][] TestData() {
			Object arr[][]= {{"Username1","Password1"},{"Username2","Password2"},
					{"Username3","Password3"},{"Username4","Password4"}};
			return arr;
		}public flipcart_dataProvider() {
			// TODO Auto-generated constructor stub
		}
}
