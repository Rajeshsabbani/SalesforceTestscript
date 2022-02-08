package executerScrpt;

import org.testng.annotations.Test;
import genericScrpt.BaseLibray;
import pom_sales.Home_Page;
import pom_sales.LoginPom;
import pom_sales.OpportunitiesPOM;
public class Opportunitiescript extends BaseLibray{
	@Test
	public void AccountFunc()
	{
		LoginPom obj1 = new LoginPom(driver);
		Home_Page obj2 = new Home_Page(driver);
		OpportunitiesPOM obj3 = new OpportunitiesPOM(driver);
		obj1.loginActivity();
		System.out.println("homepage opened");
	obj2.clickOpportunities();
	System.out.println("new opportunitie dropdown is opened");
	obj3.creatNewopportunity();
	System.out.println("opportinities is created");
	}
}
