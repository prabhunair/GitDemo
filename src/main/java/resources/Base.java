package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public  WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws Exception
	{
		 prop=new Properties();
		FileInputStream fils=new FileInputStream("C:\\Softwares\\Work\\E2EFramework\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fils);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Work\\Selenium\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();	
		}
		else if(browserName.equalsIgnoreCase("fireFox"))
		{
			
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}

}
