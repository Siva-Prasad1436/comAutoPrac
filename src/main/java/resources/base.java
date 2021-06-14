package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver intializedriver() throws IOException{
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\prasad\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "D:\\satya\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}else if (browserName.equals("IE")){
			
			System.setProperty("webdriver.ie.driver", "D:\\satya\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			
		}else if (browserName.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", "D:\\satya\\geckodriver.exe");
			 driver = new FirefoxDriver();
		
		}
		
		System.out.println("Base Class");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		
	}
	
	public void takeScreenshot(String result) throws IOException{
		
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C://test//"+result+"screenshot.png"));
	}

}

