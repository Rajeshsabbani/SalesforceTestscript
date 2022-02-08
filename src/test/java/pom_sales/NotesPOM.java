package pom_sales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotesPOM {
	//@FindBy(xpath = "/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[9]/one-app-nav-bar-item-dropdown/div/one-app-nav-bar-menu-button/a")
	//private WebElement notesdropdown;
	@FindBy(xpath = "/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[9]/one-app-nav-bar-item-dropdown/div/one-app-nav-bar-menu-button/div/div/slot/one-app-nav-bar-menu-item/a")
	private WebElement newContentNotes;
	@FindBy (xpath = "//input[@id='7:9950;a']")
	private WebElement untitledNoteTxtBox;
	@FindBy (xpath = "/html/body/div[4]/div[1]/section/div[2]/div[1]/div[6]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[4]/div[2]/div/div[2]/div[2]")
	private WebElement enterNoteText;
	@FindBy (xpath = "/html/body/div[4]/div[1]/section/div[2]/div[1]/div[6]/div/div/div/div/div/div[2]/div/div[2]/div[2]/button[3]")
	private WebElement DoneBtn;

	public NotesPOM(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void creatNewNotes()
	{
		//notesdropdown.click();
		newContentNotes.click();	
		untitledNoteTxtBox.sendKeys("Microsoft");
		enterNoteText.click();
		DoneBtn.click();
	}

}
