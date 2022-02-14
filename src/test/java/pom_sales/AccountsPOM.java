package pom_sales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountsPOM {
	
	@FindBy(xpath ="//div[@class='slds-col slds-no-flex slds-grid slds-align-top slds-p-bottom--xx-small test-lvmForceActionsContainer']//a[@title='New']")
	private WebElement newAccounts;
	@FindBy (xpath = "//span[text()='Account Name']/ancestor::label/..//input")
	private WebElement accountNameTxtBox;
	@FindBy (xpath = "(//li[@role='presentation'][1])[2]//child::a/.")// ul[@data-aura-rendered-by='5212:0']//child::li[1]
	private WebElement selectByVisibleText;
	@FindBy (xpath = "//button[contains(@class,'slds-button slds-button--neutral uiButton--brand uiButton forceActionButton')]")
	private WebElement saveBtn;
	WebDriver driver;
 
	public AccountsPOM(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);

	}

	public void creatNewAccount()
	{
	//	Accountsdropdown.click();
		newAccounts.click();	
		accountNameTxtBox.sendKeys("Microsoft ");
		System.out.println("account form opened");
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.elementToBeClickable(selectByVisibleText));
		//selectByVisibleText.click();
		System.out.println("suggestion Text selected");
		saveBtn.click();
		System.out.println("saved");
	}

	
}
