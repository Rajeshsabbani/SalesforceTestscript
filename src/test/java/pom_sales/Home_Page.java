package pom_sales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	@FindBy(xpath = "//a[@title='Accounts']//parent::a/..")//one-app-nav-bar-menu-button[1][@class='slds-dropdown-trigger slds-dropdown-trigger--click']
	private WebElement accountsBtn;
	@FindBy (xpath = "//span[text()='Contacts']//parent::a/..")
	private WebElement contactsBtn;
	@FindBy(xpath = "//span[text()='Opportunities']//parent::a/..")
	private WebElement opportunitiesBtn;
	@FindBy (xpath = "//span[text()='Tasks']//parent::a/..")//a[@role='button'])[6]//parent::one-app-nav-bar-menu-button/.")
	private WebElement TasksBtn;
	@FindBy (xpath = "//span[text()='Notes']//parent::a/..")
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
