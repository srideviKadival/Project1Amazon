package package1.AmazonProject;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
  WebDriver driver;
  public HomePage(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
	
  @FindBy(xpath="//span[@class='nav-line-2 ']")
  private WebElement accountAndList;
  
  @FindBy(xpath="//a[@class='nav-action-signin-button']")
  private WebElement signIn;
  
  @FindBy(xpath="//a[@id='nav-item-signout']")
  private WebElement logOut;
  
  @FindBy(id="twotabsearchtextbox")
  private WebElement searchProduct;
  
  public void hoverOverOnAccountandList(WebDriver driver)
  {
	  Actions a1=new Actions(driver);
	  a1.moveToElement(accountAndList).perform();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    WebElement account = wait.until(
	        ExpectedConditions.visibilityOf(accountAndList));
  }
  public void signinClick()
  {
	  signIn.click();
  }

  public void logOutClick() 
  {
	  new WebDriverWait(driver, Duration.ofSeconds(10))
	    .until(ExpectedConditions.urlContains("amazon"));
	  logOut.click();
	
  }
  
  public void searchingProduct()
  {
	  searchProduct.sendKeys("laptop"+Keys.ENTER);
  }
  
}
