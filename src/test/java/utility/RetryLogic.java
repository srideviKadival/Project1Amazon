package utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer
{
	int initialcount=0;
    int retrycount=2;
	@Override
	public boolean retry(ITestResult result) 
	{
     if(initialcount<retrycount)
     {
    	 initialcount++; 
    	 return true;  //now retry
     }
		
		
		return false;
}
}
