package TestDataNeww;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ConstantReneww.ConstantRenew1;
import Utilityy.excelUtils;

public class excelRegistration {
	
	static String excelFilePath = ConstantRenew1.Path_TestData + ConstantRenew1.File_TestData;
	 
	public static void main(String[] args) throws IOException, InterruptedException {
 
		excelUtils eu=new excelUtils();
		eu.setExcelFile(excelFilePath, "Sheet1");
 
		for(int i=0; i<eu.getRowCountInSheet(); i++) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		ElementSpecifyNew ele=new ElementSpecifyNew(driver);
		ele.Fname.sendKeys(eu.getCellData(0,0));
		ele.Lname.sendKeys(eu.getCellData(0,1));
		ele.email.sendKeys(eu.getCellData(0,2));
		ele.MobNo.sendKeys(eu.getCellData(0,3));
		ele.Address.sendKeys(eu.getCellData(0,4));
		
        System.out.println(i);
		Thread.sleep(5000);
		driver.quit();
		
	}
 

}
}