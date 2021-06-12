package Academy;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;
import org.apache.logging.log4j.*;

public class ValidateTitle extends base {
	
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException{
		
		driver = intializedriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to HomePage");
	}
	
	
	@Test
	public void TitleValidation() throws IOException {
		
		LandingPage LP = new LandingPage(driver);
		AssertJUnit.assertEquals(LP.getTilte().getText(), "FEATURED COURSES123");
		log.info("Successfully Validated the Text");
		
		
	}
	@AfterTest
	public void teardown(){
		driver.close();
		driver=null;
	}
	

}
