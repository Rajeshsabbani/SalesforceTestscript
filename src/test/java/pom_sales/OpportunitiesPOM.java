package pom_sales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPOM {
	
	//@FindBy(xpath = "/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[5]/one-app-nav-bar-item-dropdown/div/one-app-nav-bar-menu-button/a")
	//private WebElement opportunitiesdropdown;
	@FindBy(xpath = "/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[5]/one-app-nav-bar-item-dropdown/div/one-app-nav-bar-menu-button/div/div/slot/one-app-nav-bar-menu-item[1]/a")
	private WebElement newOpportunitie;
	@FindBy (xpath = "//input[@id='input-961']")
	private WebElement opportunityName;
	@FindBy (xpath = "//input[@id='input-1049']")
	private WebElement accountNameTxtBox;
	@FindBy (xpath = "//div[@id='dropdown-element-1049']/ul/li[1]")
	private WebElement selectByVisibleText;
	@FindBy (xpath = "//div[@id='sectionContent-957']/div/slot/force-record-layout-row[2]/slot/force-record-layout-item[2]/div/span/slot/slot/lightning-input/lightning-datepicker/div[1]/div/lightning-button-icon/button")
	private WebElement closeDate;
	@FindBy (xpath = "//input[@id='input-971']")
	private WebElement selectByVisibleDate;
	@FindBy (xpath = "//input[@id='input-989']")
	private WebElement stageDropdown;
	@FindBy (id = "input-989-1-989")
	private WebElement selectByVisiblestage;
	@FindBy (xpath = "//div[@id=\'content_8944:0\']/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/force-form-footer/div/div/div/runtime_platform_actions-actions-ribbon/ul/li[3]/runtime_platform_actions-action-renderer/runtime_platform_actions-executor-lwc-headless/slot[1]/slot/lightning-button/button")
	private WebElement saveBtn;

	public OpportunitiesPOM(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void creatNewopportunity()
	{
		//opportunitiesdropdown.click();
		newOpportunitie.sendKeys("Tata");	
		accountNameTxtBox.sendKeys("Tata");
		selectByVisibleText.click();
		closeDate.click();
		selectByVisibleDate.click();
		selectByVisibleText.click();
		stageDropdown.click();
		selectByVisiblestage.click();
		saveBtn.click();
	}

}
