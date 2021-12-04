package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DSIntro {
	
	WebDriver driver;
	
public DSIntro(WebDriver driver) {
	this.driver = driver;
	
}

By DSIntroLink = By.linkText("Get Started");

By TimeComplexity = By.xpath("/html/body/div[2]/ul/a");

public WebElement DSIntroLink() {

return driver.findElement(DSIntroLink); 

}

public WebElement TimeComplexity() {
	return driver.findElement(TimeComplexity);	
}



}
