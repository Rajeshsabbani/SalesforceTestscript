package pom_sales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {
	@FindBy (id = "username")
	private WebElement userNameTxtBox;
	@FindBy (xpath = "//input[@id=\'password\']")
	private WebElement passwordTxtBox;
	@FindBy (name = "Login")
	private WebElement loginBtn;
	/*@FindBy (name = "emc")
	private WebElement verifiecode;
	@FindBy (name = "save")
	private WebElement SaveBtn;*/
	
	public LoginPom(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void loginActivity()
	{
		userNameTxtBox.sendKeys("rajeshsabbani44-hcdg@force.com");	
		passwordTxtBox.sendKeys("Rajesh@123");
		loginBtn.click();
		//verifiecode.sendKeys("392993");
		//SaveBtn.click();
	}
}
