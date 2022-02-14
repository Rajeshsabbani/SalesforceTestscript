package pom_sales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {
	@FindBy (linkText="Login")
	private WebElement Login;
	@FindBy (id = "username")
	private WebElement userNameTxtBox;
	@FindBy (xpath = "//input[@id=\'password\']")
	private WebElement passwordTxtBox;
	@FindBy (name = "Login")
	private WebElement loginBtn;
	
	public LoginPom(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void loginActivity()
	{ 
		Login.click();;
		userNameTxtBox.sendKeys("rajeshsabbani44-tjcm@force.com");	
		passwordTxtBox.sendKeys("Rajesh@123");
		loginBtn.click();
		
	}
}
