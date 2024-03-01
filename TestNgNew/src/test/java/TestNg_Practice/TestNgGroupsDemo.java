package TestNg_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestNgGroupsDemo {
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	WebDriver driver;
	
	@Parameters("bName")
	@BeforeTest
	public void Sett(String bName) {
		
		htmlReporter = new ExtentHtmlReporter("extentGrouping.html");
		extent= new ExtentReports();
		extent.attachReporter(htmlReporter);


	}
	
	@Test(groups= {"sanity"})
	public void mainTest() throws InterruptedException {
		System.out.println("This is test 1 method ");
		
		ExtentTest test = extent.createTest("Open app");
		test.info("INFO:Verifies webpage if webpage dispayed on deffrent browser");
		System.out.println(" Code is Running |");
	    driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
		
			
//		
		
//			test.pass("Website is Displayed");
//				// TODO Auto-generated catch block
//			test.fail("Website is not displayed");
//	
		
		
		

	}
	
	@Test(groups= {"sanity","smoke"})
	public void Mobiles() throws InterruptedException {
		System.out.println("The mobile option is working");
		ExtentTest test = extent.createTest("Open MobilePage");
		test.info("INFO:Verifies webpage if  Mobile webpage dispayed or not");
		System.out.println(" Code is Running |");
		//WebDriver  driver=new ChromeDriver();
		try {
			driver.findElement(By.cssSelector("#container > div > div.q8WwEU > div > div > div > div > div.css-1dbjc4n.r-13awgt0 > div > div > div > div.yAlKeh > div._2L0uxW > div > div:nth-child(1) > div > div > div > div > div._3sdu8W.emupdz > a:nth-child(2) > div > div > div > div > img")).click();
		
			test.pass(" Mobile Website is Displayed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			test.fail(" Mobile  is not displayed");
		}
		
		
		

	}
	
	
	@Test(groups= {"sanity","regression"})
	public void MobileSelect() throws InterruptedException {
		System.out.println("The mobile option is working");
		ExtentTest test = extent.createTest("Select Mobile");
		test.info("INFO:Verifies webpage if  Mobile is selected or not");
		System.out.println(" Code is Running |");
		//WebDriver  driver=new ChromeDriver();
		try {
			driver.findElement(By.cssSelector("#container > div > div._6t1WkM._3HqJxg > div:nth-child(23) > div > div:nth-child(2) > div > div > div._2hKRMr._2CfYpZ > div > div:nth-child(2) > div > div > a > div > div > div > img")).click();
		
			test.pass(" Mobile is selected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			test.fail(" Mobile  is not selected");
		}
		
	
		

	}
	
	
	@Test
	public void AddToCart() throws InterruptedException {
		System.out.println("The mobile is added to cart");
		ExtentTest test = extent.createTest("Select Mobile");
		test.info("INFO:Verifies webpage if  Mobile is added to cart or not");
		System.out.println(" Code is Running |");
		// WebDriver  driver=new ChromeDriver();
		try {
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		
			test.pass("Added to cart ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			test.fail(" Mobile is not added ");
		}
		
		Thread.sleep(4000);
		

	}
	
	@AfterTest
	public void Closee() {
		System.out.println("Closing browser and report");
		extent.flush();
		if(driver!=null) {
			driver.quit();
		}
		
	}
}
