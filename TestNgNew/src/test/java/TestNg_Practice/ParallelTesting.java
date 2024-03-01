package TestNg_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ParallelTesting {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver=null;
	@Parameters("bName")
	@BeforeTest
	public void Sett(String bName) {
		System.out.println(bName +": Browser is running in The is test 1 method " );
		if(bName.equals("chrome")) {
			driver=new ChromeDriver();
		}
		
		else if(bName.equals("firefox")) {
			driver=new FirefoxDriver();
	    }
	   else if(bName.equals("Edge")) {
		driver=new EdgeDriver();
	   }
		
		htmlReporter = new ExtentHtmlReporter("extentPrallel.html");
		extent= new ExtentReports();
		extent.attachReporter(htmlReporter);

	}
	
	@Test
	public void mainTest() throws InterruptedException {
		System.out.println("This is test 1 method ");
		
		
		ExtentTest test = extent.createTest("Open app");
		test.info("INFO:Verifies webpage if webpage dispayed on deffrent browser");
		System.out.println(" Code is Running |"+Thread.currentThread().getId());
		WebDriver  driver=new ChromeDriver();
		
		try {
			driver.get("https://www.flipkart.com/");
		
			test.pass("Website is Displayed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			test.fail("Website is not displayed");
		}
		
		Thread.sleep(4000);
		driver.quit();

	}
	
	@AfterTest
	public void Closee() {
		System.out.println("This is test 1 method ");
		extent.flush();
		driver.quit();
	}
}





//<class name="TestNg_Practice.Sample_ExtentReport"/>
//<class name="TestNg_Practice.flipcart2"/>
//<class name="TestNg_Practice.ParallelTesting"/>
//<class name="TestNg_Practice.ParallelInOneMethod"/>