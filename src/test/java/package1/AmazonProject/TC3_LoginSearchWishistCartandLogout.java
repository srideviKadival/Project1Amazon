package package1.AmazonProject;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)

public class TC3_LoginSearchWishistCartandLogout extends BaseClass
{
   @Test(retryAnalyzer=RetryLogic.class)
   public void searchingTheProduct_WL_Crt_Lgout() throws InterruptedException
   {
	   HomePage homepage=new HomePage(driver);
  	 homepage.hoverOverOnAccountandList(driver);
  	 homepage.signinClick();
  	 
  	 LoginPage loginpage = new LoginPage(driver);
  	 loginpage.enterUserName();
  	 loginpage.continueClick();
  	 loginpage.enterPassword();
  	 loginpage.signIn();
  	 
  	 homepage.searchingProduct();
  	SearchResultPage searchresultpage=new SearchResultPage(driver);
  	searchresultpage.clickFirstProduct_movingControl(driver);
  	
  	ProductPage productpage=new ProductPage(driver);
  	productpage.wishListAddition(driver);
  	productpage.addToCart(driver);
  	
  	homepage.hoverOverOnAccountandList(driver);
  	homepage.logOutClick();
  	
   }
}
