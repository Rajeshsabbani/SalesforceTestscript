package executerScrpt;

import org.testng.annotations.Test;
import genericScrpt.BaseLibray;
import pom_sales.Home_Page;
import pom_sales.LoginPom;
import pom_sales.AccountsPOM;

public class Accountscript extends BaseLibray{
	@Test
	public void AccountFunc() throws InterruptedException
	{
		//DemoaccountPOM obj =new DemoaccountPOM(driver);
		LoginPom obj1 = new LoginPom(driver);
		Home_Page obj2 = new Home_Page(driver);
		AccountsPOM obj3 = new AccountsPOM(driver);
		obj1.loginActivity();
		//Thread.sleep(20000);
		//obj.DemoaccountActivity();
		System.out.println("homepage opened");
	obj2.clickAccounts();
	System.out.println("new account dropdown is opened");
	obj3.creatNewAccount();
	System.out.println("account is created");

	}
}
