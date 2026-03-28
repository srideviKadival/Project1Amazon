package package1.AmazonProject;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utility.BaseClass;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class TC1_LogintoAmazon extends BaseClass
   {
     @Test(retryAnalyzer=RetryLogic.class)
     public void withValidCredentials() 
     {
    	 Reporter.log("Browser and URL Launched Successfully");
    	 HomePage homepage=new HomePage(driver);
    	 homepage.hoverOverOnAccountandList(driver);
    	 homepage.signinClick();
    	 Reporter.log("Hoverover on Accounts & Lists and Signin click is successfull");

    	 LoginPage loginpage = new LoginPage(driver);
    	 loginpage.enterUserName();
    	 loginpage.continueClick();
    	 loginpage.enterPassword();
    	 loginpage.signIn();
    	 Reporter.log("Username and password entered successfully");
    	 
    	 SoftAssert s1=new SoftAssert();
    	 s1.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
         s1.assertAll();
    	 Reporter.log("Test Case is Pass as Assertion is Pass");

     }
   }
