package pom_sales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPOM {
	//@FindBy(xpath = "/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[3]/one-app-nav-bar-item-dropdown/div/one-app-nav-bar-menu-button/a")
	//private WebElement Accountsdropdown;
	@FindBy(xpath = "/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[3]/one-app-nav-bar-item-dropdown/div/one-app-nav-bar-menu-button/div/div/slot/one-app-nav-bar-menu-item[1]/a")
	private WebElement newContact;
	@FindBy(linkText = "//input[@id='input-469']")
	private WebElement lastName;
	@FindBy (xpath = "//input[@id='input-520']")
	private WebElement accountNameTxtBox;
	@FindBy (xpath = "//div[@id=\"dropdown-element-728\"]/ul/li[2]")
	private WebElement selectByVisibleText;
	@FindBy (xpath = "//div[@id=\"content_8673:0\"]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/force-form-footer/div/div/div/runtime_platform_actions-actions-ribbon/ul/li[3]/runtime_platform_actions-action-renderer/runtime_platform_actions-executor-lwc-headless/slot[1]/slot/lightning-button/button")
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
		saveBtn.click();
	}

}
