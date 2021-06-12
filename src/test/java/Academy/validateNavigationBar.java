package Academy;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class validateNavigationBar extends base {
	
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException{
		
		driver = intializedriver();
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	@Test
	public void NavBarValidation() throws IOException {
		
		LandingPage LP = new LandingPage(driver);
		AssertJUnit.assertTrue(LP.getNavBar().isDisplayed());
		log.info("Navigation Bar displyed");
		
		
	}
	
	@AfterTest
	public void teardown(){
		driver.close();
		driver=null;
	}
	
	
}
