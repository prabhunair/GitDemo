package Framework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base {
	
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String username,String paswd) throws Exception
	{
		driver=initializeDriver();
		driver.get("http://qaclickacademy.com");
		
		
		LandingPage lap=new LandingPage(driver);
		
		lap.getLogin().click();
		
		LoginPage lop=new LoginPage(driver);
		
		lop.setEmail().sendKeys(username);
		
		lop.setPassword().sendKeys(paswd);
		
		//lop.setLogin().click();
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="abc@qw.com";
		data[0][1]="1234";
		
		return data;
	}

}

