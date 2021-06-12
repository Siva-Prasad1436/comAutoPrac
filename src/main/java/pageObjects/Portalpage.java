package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Portalpage {
	
	public WebDriver driver;
	
	
	By Course = By.name("query");
	
	public Portalpage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public WebElement getCourse(){
		
		return driver.findElement(Course);
	}
	
	
	
}
