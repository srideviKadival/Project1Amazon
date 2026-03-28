package utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersLogic implements ITestListener
{
	public static WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
	ITestListener.super.onTestSuccess(result);
	Date d1=new Date();  
      System.out.println(d1.getTime());
      
      Date d2=new Date(d1.getTime());
      System.out.println(d2);       //Current Time
      String format1=d2.toString();
      String date=format1.substring(8, 10);
      System.out.println(date);
      String month=format1.substring(4,7);
      System.out.println(month);
      String year=format1.substring(format1.length()-4);
      System.out.println(year);
      String hour=format1.substring(11,13);
      System.out.println(hour);
      String minute=format1.substring(14,16);
      System.out.println(minute);
      String second=format1.substring(17,19);
      System.out.println(second);

      String format2=date.concat(" ").concat(month).concat(" ").concat(year).concat(" ").concat(hour).concat("-").concat(minute).concat("-").concat(second);
      System.out.println(format2);
      TakesScreenshot ts=(TakesScreenshot) driver;
	     File Source=ts.getScreenshotAs(OutputType.FILE);
	     File Destination=new File("C:\\Users\\SURYA\\eclipse-workspace\\JavaCode\\screenshotpassfail\\Pass\\Pass"+format2+".png");
	     try 
	     {
			FileHandler.copy(Source, Destination);
		 } 
	     catch (IOException e) 
	     {
			e.printStackTrace();
		 }    
	}


@Override
public void onTestFailure(ITestResult result) {
	ITestListener.super.onTestFailure(result);
	Date d1=new Date();  
      System.out.println(d1.getTime());
      
      Date d2=new Date(d1.getTime());
      System.out.println(d2);       //Current Time
      String format1=d2.toString();
      String date=format1.substring(8, 10);
      System.out.println(date);
      String month=format1.substring(4,7);
      System.out.println(month);
      String year=format1.substring(format1.length()-4);
      System.out.println(year);
      String hour=format1.substring(11,13);
      System.out.println(hour);
      String minute=format1.substring(14,16);
      System.out.println(minute);
      String second=format1.substring(17,19);
      System.out.println(second);

      String format2=date.concat(" ").concat(month).concat(" ").concat(year).concat(" ").concat(hour).concat("-").concat(minute).concat("-").concat(second);
      System.out.println(format2);
      TakesScreenshot ts=(TakesScreenshot) driver;
	     File Source=ts.getScreenshotAs(OutputType.FILE);
	     File Destination=new File("C:\\Users\\SURYA\\eclipse-workspace\\JavaCode\\screenshotpassfail\\Fail\\Fail"+format2+".png");
	     try 
	     {
			FileHandler.copy(Source, Destination);
		 }
	     catch (IOException e) 
	     {
			e.printStackTrace();
		 }    

}
}


