package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	
	By Email = By.xpath("//input[@id='user_email']");
	By Pswd = By.xpath("//input[@id='user_password']");
	By Login = By.xpath("//input[@value='Log In']");
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public WebElement Email(){
		
		return driver.findElement(Email);
	}
	
	public WebElement Password(){
		
		return driver.findElement(Pswd);
	}

	public WebElement Login(){
		
		return driver.findElement(Login);
	}
	
}
