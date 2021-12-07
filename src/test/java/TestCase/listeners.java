package TestCase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class listeners extends TestListenerAdapter{
	public void onTestStart(ITestResult tr) {
		System.out.println("Test Started");
	}	
	
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test passed");
	}
	
	public void onTestFailure(ITestResult tr) {
		public static void takeSnapShot(String fileName) throws Exception{

		      //Convert web driver object to TakeScreenshot

		      TakesScreenshot scrShot =((TakesScreenshot)driver);

		      //Call getScreenshotAs method to create image file

		              File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

		          //Move image file to new destination

		              File DestFile=new File("C:\\Users\\apoth\\eclipse-workspace\\SeleniumAutomation\\test-output\\screenshot\\"+fileName+".png");

		              //Copy file at destination
		              FileUtils.copyFile(SrcFile, DestFile);

		  }
		  
		
	}
		  
	  
	public void onTestSkipped(ITestResult tr) {
		System.out.println("Test Skipped");
	}
	
}
