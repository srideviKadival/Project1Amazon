package package1.AmazonProject;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)

public class TC2_LogintoAmazonandLogout extends BaseClass
{
	@Test(retryAnalyzer=RetryLogic.class)
	public void loginLogout()
	{
		
	HomePage homepage=new HomePage(driver);
	 homepage.hoverOverOnAccountandList(driver);
	 homepage.signinClick();
	 
	 LoginPage loginpage = new LoginPage(driver);
	 loginpage.enterUserName();
	 loginpage.continueClick();
	 loginpage.enterPassword();
	 loginpage.signIn();
	 
	 homepage.hoverOverOnAccountandList(driver);
     homepage.logOutClick();
	 
}
}
