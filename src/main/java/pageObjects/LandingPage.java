package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By closepoup = By.xpath("//button[contains(text(),'NO THANKS')]");
	By login = By.xpath("//span[text()='Login']");
	By Title = By.xpath("//h2[contains(text(),'Featured Courses')]");
	By NavBar =By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public WebElement getTilte(){
		
		return driver.findElement(Title);
	}
	public WebElement getNavBar(){
		
		return driver.findElement(NavBar);
	}

	public WebElement getLogin(){
		
		return driver.findElement(login);
	}
	public int getPopupSize(){
		
		return driver.findElements(closepoup).size();
		
	}
	public WebElement closepopup(){
		
		return driver.findElement(closepoup);
	}
	
}
