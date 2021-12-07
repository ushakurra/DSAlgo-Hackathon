package TestCase;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import TestCase.DSApplication;

import io.qameta.allure.Attachment;

public class TestExecutionListener implements ITestListener{
	
	private static String getTestMethodName(ITestResult iTestResult)
	{
		return iTestResult.getMethod().getConstructorOrMethod().getName();
		
	}
	
@Attachment
public byte[] saveFailureScreenShot(WebDriver driver) {
	return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
}
@Attachment(value = "{0}", type = "text/plain")
public static String saveTextLog(String message) {
	return message;
}
 
@Override
public void onTestFailure(ITestResult result) {
		System.out.println("I am in onTestFailure Method " + getTestMethodName(result) + "failed");
		WebDriver driver = DSApplication.getDriver();
		
		
		
		
		//Allure Screenshot and save Test log
		
		if (driver instanceof WebDriver) {
			System.out.println("Screenshot captured for Testcase :  " + getTestMethodName(result));
		    saveFailureScreenShot(driver);
		}
		
		saveTextLog(getTestMethodName(result) + "Failed and Screenshot Taken!");
	}

@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
}


public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}

public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}

public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

}
