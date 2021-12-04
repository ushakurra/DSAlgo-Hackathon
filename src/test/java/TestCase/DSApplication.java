package TestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.DSIntro;
import ObjectRepository.Login;
import ObjectRepository.array;

public class DSApplication {
@Test	
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


}
