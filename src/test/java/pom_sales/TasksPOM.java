package pom_sales;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class TasksPOM {
	@FindBy(xpath = "//a[@title='Show one more action']//parent::div/..")
	private WebElement tasksdropdown;
	@FindBy(xpath = "//div[@role='menu']/ul/li/a/." )//div[@data-aura-class='uiPopupTarget uiMenuList forceActionsDropDownMenuList uiMenuList--left uiMenuList--default'])[2]")//a[@role='menuitem'])[2]//parent::one-app-nav-bar-menu-item/..")
	private WebElement newTasks;
	@FindBy (xpath = "(//input[@role='combobox'])[3]")
	private WebElement subjectTxtBox;
	//@FindBy (id = "(//lightning-base-combobox-item[@role='option'])[4]")
	//private WebElement selectByVisibleText;
	@FindBy (xpath = "(//button[@title='Save'])")
	private WebElement saveBtn;

	public TasksPOM(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void creatNewTask()
	{
		tasksdropdown.click();
		System.out.println("dropdown opened");
		newTasks.click();	
		System.out.println("new tassk is clicked");
		subjectTxtBox.sendKeys("Other");
		System.out.println("Subject is selected");
		//selectByVisibleText.click();
		saveBtn.click();
		System.out.println("saved");
	}

}
