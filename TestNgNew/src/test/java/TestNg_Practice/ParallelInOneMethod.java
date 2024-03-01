package TestNg_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ParallelInOneMethod {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	@BeforeSuite
	public void Setup() {
		driver=new ChromeDriver();
		htmlReporter = new ExtentHtmlReporter("extent1.html");
		extent= new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	@Test
	public void test1() throws InterruptedException {
		driver.manage().window().maximize();
		ExtentTest test = extent.createTest("Open app");
		test.info("INFO:Verifies webpage dispayed");
		System.out.println("First Code is Running |"+Thread.currentThread().getId());
		WebDriver  driver=new ChromeDriver();
		
		try {
			driver.get("https://www.flipkart.com/");
		
			test.pass("Website is Displayed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			test.fail("Website is not displayed");
		}
		
		Thread.sleep(2000);
		driver.quit();
	}
 
	@Test
	public void test2() throws InterruptedException {
		driver.manage().window().maximize();
		ExtentTest test = extent.createTest("Open BookMyShow");
		test.info("INFO:Verifies site is displayed");
		System.out.println("Second Code is Running |"+Thread.currentThread().getId());
		WebDriver driver=new ChromeDriver();
	
		
		try {
			driver.get("https://in.bookmyshow.com/explore/home/pune");
		
			test.pass("Website is Displayed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			test.fail("Website is not displayed");
		}
		
		Thread.sleep(2000);
	
 
	}
	
	@AfterSuite	
	public void close() {
		extent.flush();
		driver.quit();
	}
}
