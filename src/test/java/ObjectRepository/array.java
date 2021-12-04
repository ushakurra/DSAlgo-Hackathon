package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class array {

	WebDriver driver;
	
	public array(WebDriver driver) {
		this.driver = driver;
	}
	//usha changed
	By arrayGS = By.xpath("/html/body/div[2]/div[2]/div/div/a");
	By arrayinPython = By.xpath("/html/body/div[2]/ul[1]/a");
	By arrayusinglist = By.xpath("/html/body/div[2]/ul[2]/a");

 public WebElement arrayGS () {
	return driver.findElement(arrayGS) ;
	 
 }
	
 public WebElement arrayinPython () {
		return driver.findElement(arrayinPython) ;
		 
	 } 
 
 public WebElement arrayusinglist () {
		return driver.findElement(arrayusinglist) ;
		 
	 } 
	
}

