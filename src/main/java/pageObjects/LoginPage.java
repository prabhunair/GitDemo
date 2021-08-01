package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By oEmail=By.cssSelector("input[id='user_email']");
	By oPassword=By.cssSelector("input[id='user_password']");
	By oLogin=By.cssSelector("[value='Log In']");
	
	public WebElement setEmail() 
	{
		return driver.findElement(oEmail);
	}
	
	public WebElement setPassword() 
	{
		return driver.findElement(oPassword);
	}
	
	public WebElement setLogin() 
	{
		return driver.findElement(oLogin);
	}

}
