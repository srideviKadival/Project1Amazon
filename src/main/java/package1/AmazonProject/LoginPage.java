package package1.AmazonProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage
{
  WebDriver driver;
  public LoginPage(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
  @FindBy(name="email")
  private WebElement username;
  
  @FindBy(id="continue")
  private WebElement continuebutton;
  
  @FindBy(name="password")
  private WebElement pwd;
  
  @FindBy(id="signInSubmit")
  private WebElement signIn;
  
  public void enterUserName()
  {
	username.sendKeys("9964330859");  
  }
  
  public void continueClick() 
  {
	  continuebutton.click();
  }
  
  public void enterPassword()
  {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    WebElement pwd = wait.until(
	        ExpectedConditions.visibilityOfElementLocated(By.name("password"))
	    );
	  pwd.sendKeys("Sridevi@2026");
  }
  
  public void signIn()
  {
	  signIn.click();
  }
}
