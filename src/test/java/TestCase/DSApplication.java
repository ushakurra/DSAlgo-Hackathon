package TestCase;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;

import ObjectRepository.DSIntro;
import ObjectRepository.Login;
import ObjectRepository.array;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class DSApplication {

@Test(priority = 1)	
@Description ("Base Testcase")
@Severity(SeverityLevel.BLOCKER)

 public void DSAlgo() throws InterruptedException {
 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
 WebDriver driver = new ChromeDriver ();
 driver.get("https://dsportalapp.herokuapp.com/login");
 
 Login lg = new Login(driver);
 DSIntro ds = new DSIntro(driver);
 array ar = new array(driver);
 
 lg.username().sendKeys("ushakurra");
 lg.password().sendKeys("Sleep2020");
 lg.login().click();
 
 Thread.sleep(3000);
 
 driver.get("https://dsportalapp.herokuapp.com/home");
 
 ds.DSIntroLink().click();
 Thread.sleep(3000);
 ds.TimeComplexity().click();
 Thread.sleep(3000);
 
 driver.get("https://dsportalapp.herokuapp.com/home");
 Thread.sleep(3000);
	ar.arrayGS().click();
	Thread.sleep(3000);
	driver.get("https://dsportalapp.herokuapp.com/array/");
	ar.arrayinPython().click();
	Thread.sleep(3000);
	driver.get("https://dsportalapp.herokuapp.com/array/");
	ar.arrayusinglist().click();
 
	}

@Test
public void itestlistener () {
	System.out.println("its in failed assertion");

	Assert.assertEquals("Usha","Kurra");
}

public static WebDriver getDriver() {
	// TODO Auto-generated method stub
	return null;
}

}
