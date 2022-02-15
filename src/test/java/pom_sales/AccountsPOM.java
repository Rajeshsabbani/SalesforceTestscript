package pom_sales;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AccountsPOM {
	
	@FindBy(xpath ="//div[@class='slds-col slds-no-flex slds-grid slds-align-top slds-p-bottom--xx-small test-lvmForceActionsContainer']//a[@title='New']")
	private WebElement newAccounts;
	@FindBy (xpath = "(//input[@role='combobox'])[3]/.")
	private WebElement accountNameTxtBox;
	@FindBy (xpath = "(//li[@role='presentation'][1])[2]")// ul[@data-aura-rendered-by='5212:0']//child::li[1]
	private WebElement selectByVisibleText;
	@FindBy (xpath = "//button[contains(@class,'slds-button slds-button--neutral uiButton--brand uiButton forceActionButton')]")
	private WebElement saveBtn;
	WebDriver driver;
 
	public AccountsPOM(WebDriver  driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	public void creatNewAccount()
	{
		newAccounts.click();	
		accountNameTxtBox.sendKeys("Tata Motors Ltd");
		accountNameTxtBox.sendKeys(Keys.RETURN);
		System.out.println("account form opened");
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.elementToBeClickable(selectByVisibleText));
		waitForElementToClickable(selectByVisibleText);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", selectByVisibleText);
		//selectByVisibleText.click();
		System.out.println("suggestion Text selected");
		saveBtn.click();
		System.out.println("saved");
	}

	

	private void waitForElementToClickable(WebElement selectByVisibleText2) {
		// TODO Auto-generated method stub
		
	}

	
}
