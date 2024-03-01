package TestDataNeww;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementSpecifyNew {
private WebDriver driver;
	
	
public WebElement Fname,Lname,email,MobNo,Gender,Subject,DOB,Hobby,Address,State,Drp,City,Drp2,Submit;

                   public ElementSpecifyNew(WebDriver driver) {
       this.driver=driver;
       Fname=driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
       Lname=driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
	email=driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
	MobNo=driver.findElement(By.xpath("//*[@id=\"userNumber\"]"));
  Gender=driver.findElement(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(2)"));

        Hobby=driver.findElement(By.cssSelector("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(1)"));
 Address=driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
////  State=driver.findElement(By.cssSelector("#state > div > div.css-1wy0on6 > div"));
////  Drp=driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]"));
////  City=driver.findElement(By.cssSelector("#state > div > div.css-1wy0on6 > div > svg"));
////  Drp2=driver.findElement(By.cssSelector("#city > div > div.css-1hwfws3 > div.css-1uccc91-singleValue"));
//
       Submit=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
       }


}
