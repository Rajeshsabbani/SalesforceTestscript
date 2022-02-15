package pom_sales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPOM {
	//@FindBy(xpath = "/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[3]/one-app-nav-bar-item-dropdown/div/one-app-nav-bar-menu-button/a")
	//private WebElement Accountsdropdown;
	@FindBy(xpath = "//a[@title='New']//parent::li/.")
	private WebElement newContact;
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lastName;
	@FindBy (xpath = "(//input[@aria-haspopup='listbox'])[2]")
	private WebElement accountNameTxtBox;
	@FindBy (xpath = "(//ul[@role='group'])//child::li[1]")
	private WebElement selectByVisibleText;
	@FindBy (xpath = "//button[@name='SaveEdit']")
	private WebElement saveBtn;

	public ContactsPOM(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void createNewContacts()
	{
		//Accountsdropdown.click();
		newContact.click();	
		lastName.sendKeys("Microsoft");
		accountNameTxtBox.sendKeys("Microsoft");
		selectByVisibleText.click();
		System.out.println("Visible text selected");
		saveBtn.click();
		System.out.println("saved");
	}

}
