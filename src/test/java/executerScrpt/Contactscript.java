package executerScrpt;

import org.testng.annotations.Test;
import genericScrpt.BaseLibray;
import pom_sales.ContactsPOM;
import pom_sales.Home_Page;
import pom_sales.LoginPom;

public class Contactscript extends BaseLibray{
		@Test
		public void ContactsFunc()
		{
			LoginPom obj1 = new LoginPom(driver);
			Home_Page obj2 = new Home_Page(driver);
			ContactsPOM obj3 = new ContactsPOM(driver);
			obj1.loginActivity();
			System.out.println("homepage opened");
		obj2.clickContacts();
		System.out.println("new contact dropdown is opened");
		obj3.createNewContacts();
		System.out.println("contact is created");
		}
}
