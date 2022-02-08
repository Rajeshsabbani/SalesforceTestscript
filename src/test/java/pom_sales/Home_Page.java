package pom_sales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	@FindBy(xpath = "//one-app-nav-bar-menu-button[1][@class='slds-dropdown-trigger slds-dropdown-trigger--click']")
	private WebElement accountsBtn;
	@FindBy (xpath = "//one-app-nav-bar-item-root[@data-id='Contact']//one-app-nav-bar-menu-button[@class='slds-dropdown-trigger slds-dropdown-trigger--click']")
	private WebElement contactsBtn;
	@FindBy(xpath = "//one-app-nav-bar-item-root[@data-id='Opportunity']//a[@role='button']//lightning-primitive-icon")
	private WebElement opportunitiesBtn;
	@FindBy (xpath = "//one-app-nav-bar-item-root[@class='navItem slds-context-bar__item slds-shrink-none slds-is-active']//a[@role='button']")
	private WebElement TasksBtn;
	@FindBy (xpath = "//one-app-nav-bar-menu-button[@class='slds-dropdown-trigger slds-dropdown-trigger--click slds-is-open']")
	private WebElement NotesBtn;
	
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickAccounts() 
	{
		accountsBtn.click();
		
		}
	
	public void clickContacts()
	{
		contactsBtn.click();
	}
	public void clickOpportunities()
	{
		opportunitiesBtn.click();
	}
	
	public void clickTasks()
	{
		TasksBtn.click();
	}
    public void clickNotes()
    {
    	NotesBtn.click();
    }
}
