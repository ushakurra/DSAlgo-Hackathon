package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	WebDriver driver;
	
public Login(WebDriver driver) {
	 
	 this.driver = driver;
 }
 
By username = By.xpath("/html/body/div[2]/div/div[2]/form/input[2]");
By password = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/form[1]/input[3]");
By login = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/form[1]/input[4]");

public WebElement username () {	
	return driver.findElement(username);	
}

public WebElement password () {	
	return driver.findElement(password);
}
			
public WebElement login () {	
	return driver.findElement(login);	
}
}
