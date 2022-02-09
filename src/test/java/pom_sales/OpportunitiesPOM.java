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
	@FindBy (xpath = "//ul[@aria-label='Recent Accounts']//child::li[2]")
	private WebElement selectByVisibleText;
	@FindBy (xpath = "(//input[@class='slds-input'])[3]")
	private WebElement closeDate;
	@FindBy (xpath = "(//input[@aria-haspopup='listbox'])[4]//parent::div/..")
	private WebElement stageDropdown;
	//@FindBy (id = "(//lightning-base-combobox-item[@role='option'])[1]//parent::div/..")
	//private WebElement selectByVisiblestage;
	@FindBy (xpath = "//button[@name='SaveEdit']")
	private WebElement saveBtn;

	public OpportunitiesPOM(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void creatNewopportunity()
	{
		newOpportunitie.click();
		opportunityName.sendKeys("Tata Service");
		accountNameTxtBox.sendKeys("Mi");
		selectByVisibleText.click();
		closeDate.sendKeys("2/3/2022");
		stageDropdown.click();
		//selectByVisiblestage.click();
		saveBtn.click();
		System.out.println("Saved");
	}

}
