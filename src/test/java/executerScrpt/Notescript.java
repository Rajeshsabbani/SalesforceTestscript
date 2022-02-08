package executerScrpt;

	import org.testng.annotations.Test;
	import genericScrpt.BaseLibray;
	import pom_sales.Home_Page;
	import pom_sales.LoginPom;
import pom_sales.NotesPOM;
	
	public class Notescript extends BaseLibray{
		@Test
		public void TasksFunc()
		{
			LoginPom obj1 = new LoginPom(driver);
			Home_Page obj2 = new Home_Page(driver);
			NotesPOM obj3 = new NotesPOM(driver);
			obj1.loginActivity();
			System.out.println("homepage opened");
		obj2.clickNotes();
		System.out.println("new note dropdown is opened");
		obj3.creatNewNotes();
		System.out.println("Notes is created");

		}
	}

	


