package stepDefinations;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.Portalpage;
import resources.base;

public class simpleTeststepdef extends base {
	
	@Given("^Intialiaze the browser with Chrome$")
	public void intialiaze_the_browser_with_Chrome() throws Throwable {
		
		driver = intializedriver();
	    
	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
		driver.get(arg1);
		
	    
	}

	@Given("^Click on the Login Link in the Homepage to land in login page$")
	public void click_on_the_Login_Link_in_the_Homepage_to_land_in_login_page() throws Throwable {
		
		LandingPage lp = new LandingPage(driver);
		if (lp.getPopupSize()>0){
			lp.closepopup().click();
		}
		lp.getLogin().click();
		
	    
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\" $")
	public void user_enters_ps_gmail_com_and(String username, String password) throws Throwable {
		LoginPage lp1 = new LoginPage(driver);
		lp1.Email().sendKeys(username);
		lp1.Password().sendKeys(password);
		lp1.Login().click();
	    
	}

	@Then("^Verify Login Should be Successful$")
	public void verify_Login_Should_be_Successful() throws Throwable {
		Portalpage P = new Portalpage(driver);
		Assert.assertTrue(P.getCourse().isDisplayed());
	    
	}

	@Then("^Close the browser Successfully$")
	public void close_the_browser_Successfully() throws Throwable {
		driver.close();
	    
	}

	

}
