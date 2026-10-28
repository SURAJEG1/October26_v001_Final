package oct28_TestNG;

import org.testng.*;

public class Listener implements ITestListener{
	
	
	
	public void onTestStart(ITestContext context) 
	{
		System.out.println(context.getName() + "Test Case Start");
	}
	
	
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println(result.getName() + "Successfully Executed...");
	}
	
	
	public void onTestFailure(ITestResult result) 
	{
		System.out.println(result.getName() + "Got failed and screenshot captured..");
		System.out.println(result.getThrowable());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
