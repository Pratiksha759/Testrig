package TestNg_Practice;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.Response.OutputType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Flipcart1 {
	public WebDriver driver;
//	public String url ="https://www.lambdatest.com/";
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent2;
	public ExtentTest test ;
	
 
	
	@BeforeSuite
	void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		htmlReporter = new ExtentHtmlReporter("extent2.html");
		extent2 = new ExtentReports();
		extent2.attachReporter(htmlReporter);
//		extent2.createTest("Open Swaglab","to verify that user can navigates on Swaglab homepage");
//		test.info("INFO:verifies that Swaglab's window opens");
		//driver.manage().timeouts().implicitlyWait( 20,TimeUnit.SECONDS);
		System.out.println(" setup process is completed");
		
		}
	
//	
//	@BeforeTest
//	public void profilestup()
//	{
//		
//		System.out.println("profile setup is completed");
//		test.log(Status.INFO,"profile setup is completed");
//	}
	
	@BeforeClass
	public void appsetUp()
	{
	driver.get("https://www.saucedemo.com/v1/index.html");
	driver.manage().window().maximize();
	test.info("INFO:verifies that Swaglab's window opens");
		
		//driver.get(url);
		System.out.println("app setUP process completed");
		//test.log(Status.INFO,"app setUP process completed");
	}
	
	@BeforeMethod
	public void checklogin()
	{
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		test.log(Status.INFO,"user entered username");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		test.log(Status.INFO,"user entered password");
		driver.findElement(By.id("login-button")).click();
		System.out.println("login process completed");
//		test.log(Status.INFO,"login process completed");
		}
	
	@Test
	public void testCurrentUrl() throws InterruptedException{
		//driver.findElement(By.xpath("//*[@id='app']/header/aside/ul/li[4]/a")).click();
		//String currenturl = driver.getCurrentUrl();
//		assertEquals(currenturl,"https://automation.lambdatest.com/timeline/?viewType=build&page=1","url did not matched");
//		System.out.println("url validation completed");
//		test.log(Status.INFO,"Landed on orangeHRM HomePage");
		WebElement image = driver.findElement(By.cssSelector("#header_container > div.header_label > div"));
		 if(image.isDisplayed())
		 {
			 test.pass("Image is Displayed");
			 } else {
			  test.fail("Image is not displayed");
			  }
//		 test.log(Status.INFO,"Landed on OrangeHRM's HomePage");
	}
	
	@AfterMethod
	public void screenshot()throws IOException
	{
		TakesScreenshot scr =((TakesScreenshot)driver);
		File file1 = scr.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file1, new File("C:\\Users\\TESTRIG\\eclipse-workspace\\QA Practices\\test_output\\test1.PNG"));
		System.out.println("ScreenShot of the test id taken");
//		test.log(Status.INFO,"user took Screenshot");
		
 
	}
	
	@AfterClass
	public void closeUP()
	{
		driver.close();
		System.out.println("closeUP processes completed ");
//		test.log(Status.INFO,"users closeUP processis completed");
	}
 
//	@AfterTest
//	public void reportready()
//	{
//		driver.close();
//		System.out.println("Report is ready to be shared, with screenshots of the tests");
//		test.log(Status.INFO,"User's Report is ready to be shared, with screenshots of the tests");
//	}
	
	@AfterSuite
	public void cleanUp() {
		System.out.println("All closeUp activites are completed");
//		test.log(Status.INFO,"User's All closeUp activites are completed");
		extent2.flush();
		driver.quit();
	}
	
	
	
	
}
