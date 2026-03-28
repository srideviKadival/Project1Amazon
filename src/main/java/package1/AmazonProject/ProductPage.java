package package1.AmazonProject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage 
{
	WebDriver driver;
	  public ProductPage(WebDriver driver)
	  {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);
	  }
	  
	  @FindBy(xpath=("//input[@aria-label='Add to Wish List']"))
	  private WebElement wishListButton;
	  
	  @FindBy(xpath=("//input[@aria-label='Continue shopping']"))
	  private WebElement continueButton;
	  
	  @FindBy(xpath=("(//input[@value='Add to cart'])[2]"))
	  private WebElement addToCartButton;
	  
	  @FindBy(xpath=("//span[@class='a-button a-button-primary attach-button-large attach-primary-cart-button']"))
	  private WebElement cartButton;
	  
	  public void wishListAddition(WebDriver driver) throws InterruptedException
	  {
		  wishListButton.click();
		  Thread.sleep(2000);
		  continueButton.click();
	  }
	  
	  public void addToCart(WebDriver driver) throws InterruptedException
	  {
		  addToCartButton.click();
		  Thread.sleep(2000);
		  cartButton.click();
	  }
}
