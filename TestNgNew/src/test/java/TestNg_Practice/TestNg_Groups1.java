package TestNg_Practice;

import org.testng.annotations.Test;

public class TestNg_Groups1 {
	@Test(groups="Smoke")  
	 public void WebLoginPersonalLoan()  
	 {  
	     System.out.println("Web Login Personal Loan");  
	 }  
	 @Test  
	 public void MobileLoginPersonalLoan()  
	 {  
	     System.out.println("Mobile Login Personal Loan");  
	 }  
	 @Test  
	 public void APILoginPersonalLoan()  
	 {  
	     System.out.println("API Login Personal Loan");  
	 }  
}
