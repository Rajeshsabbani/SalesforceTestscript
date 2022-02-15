package pom_sales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPOM {
	
	@FindBy(xpath = "//a[@title='New']//parent::li/..")
	private WebElement newOpportunitie;
	@FindBy (xpath = "//input[@name='Name']//parent::div/..")
	private WebElement opportunityName;
	@FindBy (xpath = "(//input[@aria-haspopup='listbox'])[2]")
	private WebElement accountNameTxtBox;
	@FindBy (xpath = "(//ul[@role='group'])//child::li[1]")
	private WebElement selectByVisibleText;
	@FindBy (xpath = "(//input[@class='slds-input'])[3]")
	private WebElement closeDate;
	@FindBy (xpath = "//label[text()='Stage']/..//button")
	private WebElement stageDropdown;
	@FindBy (xpath = "//span[@title='Qualification']/../..")
	private WebElement selectByVisiblestage;
	@FindBy (xpath = "//button[@name='SaveEdit']")
	private WebElement saveBtn;

	public OpportunitiesPOM(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void creatNewopportunity() 
	{
		newOpportunitie.click();
		opportunityName.sendKeys("Microsoft");
		accountNameTxtBox.sendKeys("Microsoft");
		selectByVisibleText.click();
		System.out.println("suggestion text selected");
		closeDate.sendKeys("2/3/2022");
		stageDropdown.click();
		System.out.println("stage dropdown clicked");
		selectByVisiblestage.click();
		saveBtn.click();
		System.out.println("Saved");
	}

}
