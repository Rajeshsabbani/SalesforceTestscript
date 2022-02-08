package pom_sales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPOM {
	//@FindBy(xpath = "/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[6]/one-app-nav-bar-item-dropdown/div/one-app-nav-bar-menu-button/a")
	//private WebElement tasksdropdown;
	@FindBy(xpath = "/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[6]/one-app-nav-bar-item-dropdown/div/one-app-nav-bar-menu-button/div/div/slot/one-app-nav-bar-menu-item/a")
	private WebElement newTasks;
	@FindBy (xpath = "//input[@id='input-1277']")
	private WebElement subjectTxtBox;
	@FindBy (id = "input-1277-3-1277")
	private WebElement selectByVisibleText;
	@FindBy (xpath = "//div[@id=\"content_9351:0\"]/div/div/div[2]/div/div/div[2]/button[3]")
	private WebElement saveBtn;

	public TasksPOM(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void creatNewTask()
	{
		//tasksdropdown.click();
		newTasks.click();	
		subjectTxtBox.click();
		selectByVisibleText.click();
		saveBtn.click();
	}

}
