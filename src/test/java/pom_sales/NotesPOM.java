package pom_sales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotesPOM {
	//@FindBy(xpath = "(//a[@data-aura-class='forceActionLink'])[2]//child::div/.")
	//private WebElement newContentNotes;
	@FindBy (xpath = "//input[@placeholder='Untitled Note']")
	private WebElement untitledNoteTxtBox;
	@FindBy (xpath = "//div[@data-placeholder='Enter a note...']")
	private WebElement enterNoteText;
	//@FindBy (xpath = "(//span[@class=' label bBody'])[4]//parent::button/..")
	//private WebElement AddtorecordBtn;

	public NotesPOM(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void creatNewNotes()
	{
		//newContentNotes.click();	
		System.out.println("new notes opened");
		untitledNoteTxtBox.click();
		untitledNoteTxtBox.clear();
		untitledNoteTxtBox.sendKeys("Microsoft");
		System.out.println(" notes opened");
		enterNoteText.sendKeys("This is Automation Test Case");;
		//AddtorecordBtn.click();
		System.out.println("Notes successfully added");
	}

}
