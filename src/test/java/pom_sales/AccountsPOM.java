package pom_sales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsPOM {
	
	@FindBy(xpath ="//div[@class='slds-col slds-no-flex slds-grid slds-align-top slds-p-bottom--xx-small test-lvmForceActionsContainer']//a[@title='New']")
	private WebElement newAccounts;
	@FindBy (xpath = "//input[@class=' default input uiInput uiInputTextForAutocomplete uiInput--default uiInput--input uiInput uiAutocomplete uiInput--default uiInput--lookup'][1]")
	private WebElement accountNameTxtBox;
	@FindBy (xpath = "(//ul[@role='presentation'])[4]//child::li[1]")
	private WebElement selectByVisibleText;
	@FindBy (xpath = "//button[contains(@class,'slds-button slds-button--neutral uiButton--brand uiButton forceActionButton')]")
	private WebElement saveBtn;

	public AccountsPOM(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void creatNewAccount()
	{
	//	Accountsdropdown.click();
		newAccounts.click();	
		accountNameTxtBox.sendKeys("mi");
		System.out.println("account form opened");
		//selectByVisibleText.click();
		saveBtn.click();
		System.out.println("saved");
	}


}
