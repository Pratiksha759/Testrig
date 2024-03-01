package TestDataNeww;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ConstantReneww.ConstantRenew1;
import ConstantReneww.ConstantRenew1;
import Utilityy.utilityy;
import TestDataNeww.ElementSpecifyNew;
import Utilityy.utilityy;

public class TestRenew {
	
		
		public static void main(String[] args) throws IOException, ParseException  {
			// TODO Auto-generated method stub
			  
			JSONParser jsonParser =new JSONParser();
			FileReader reader =new FileReader( ConstantRenew1.Path_TestData + "userData.json");
			
			Object obj = jsonParser.parse(reader);
			
			JSONArray usersList = (JSONArray) obj;
	        for(int i=0; i<usersList.size(); i++) {
	        	
				WebDriver driver=new ChromeDriver();
				JavascriptExecutor js = (JavascriptExecutor)driver;
				driver.get(ConstantReneww.ConstantRenew1.URL);
				driver.manage().window().maximize();
				JSONObject users = (JSONObject) usersList.get(i);
	        ElementSpecifyNew e=new ElementSpecifyNew(driver);
	       utilityy.sendKeys(e.Fname, (String) users.get("Fname"));
	       utilityy.sendKeys(e.Lname, (String) users.get("Lname"));
	       utilityy.sendKeys(e.email, (String) users.get("email"));
	       utilityy.sendKeys(e.MobNo, (String) users.get("MobNo"));
	       utilityy.pClick(e.Gender);
	       utilityy.pClick(e.Hobby);
	       utilityy.sendKeys(e.Address, (String) users.get("Address"));
	       utilityy.scrollToElement(js, e.Submit);
	       utilityy.pClick(e.Submit);
	       
	     //  Thread.sleep(1000);
				driver.quit();
				System.out.println(users);
				System.out.println(i);
				
			}
}
		
}
