package executerScrpt;

import org.testng.annotations.Test;
import genericScrpt.BaseLibray;
import pom_sales.Home_Page;
import pom_sales.LoginPom;
import pom_sales.TasksPOM;
public class Taskscript extends BaseLibray{
	@Test
	public void TasksFunc()
	{
		LoginPom obj1 = new LoginPom(driver);
		Home_Page obj2 = new Home_Page(driver);
		TasksPOM obj3 = new TasksPOM(driver);
		obj1.loginActivity();
		System.out.println("homepage opened");
	obj2.clickTasks();
	System.out.println("new Task dropdown is opened");
	obj3.creatNewTask();
	System.out.println("Tasks is created");

	}
}

