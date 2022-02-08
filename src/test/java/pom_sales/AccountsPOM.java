package pom_sales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsPOM {
	//@FindBy(xpath = "/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[2]/one-app-nav-bar-item-dropdown/div/one-app-nav-bar-menu-button")
	//private WebElement Accountsdropdown;
	@FindBy(xpath = "//one-app-nav-bar-menu-item[1]//a[@role='menuitem']")
	private WebElement newAccounts;
	@FindBy (xpath = "/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement accountNameTxtBox;
	@FindBy (xpath = "//a[@id='1:4993;a']")
	private WebElement selectByVisibleText;
	@FindBy (xpath = "//button[@title='Save']")
	private WebElement saveBtn;

	public AccountsPOM(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void creatNewAccount()
	{
	//	Accountsdropdown.click();
		newAccounts.click();	
		accountNameTxtBox.sendKeys("tata");
		selectByVisibleText.click();
		saveBtn.click();
	}


}
