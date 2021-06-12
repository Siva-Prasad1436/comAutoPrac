package Academy;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException{
		
		driver = intializedriver();
			
	}
	
	@Test(dataProvider="getdata")
	public void HomepageLoginValidation(String usernane,String Password,String text) throws IOException, InterruptedException{
		
	
		driver.get(prop.getProperty("url"));
		LandingPage LP = new LandingPage(driver);
		//Thread.sleep(10);
		//LP.closePopup().click();
		LP.getLogin().click();
		LoginPage lp = new LoginPage(driver);
		lp.Email().sendKeys(usernane);
		lp.Password().sendKeys(Password);
		lp.Login().click();
		log.info(text);
		
		}
	
	@AfterTest
	public void teardown(){
		driver.close();
		driver=null;
	}
	
	@DataProvider
	public Object[][] getdata(){
		
		Object[][] data = new Object [2][3];
		
		data[0][0] = "nonrest@test.com";
		data[0][1] = "1345";
		data[0][2] = "Non restricted";
		
		data[1][0] = "restrcte@test.com";
		data[1][1] = "1342";
		data[1][2] = "restricted";
		
		return data;
		
	}

	
}
