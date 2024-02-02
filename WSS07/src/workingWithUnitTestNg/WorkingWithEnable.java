package workingWithUnitTestNg;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class WorkingWithEnable {
//to skip the test case enabled=false
//default value true
	
	@Test(priority = 1)
	public void openbrowser() {
		System.out.println("user is able to openbrowser");
	}

	@Test(priority = 2)
	public void enterurl() {
		System.out.println("user is able to enter url ");
	}

	@Test(priority = 3)
	public void register() {
		System.out.println("user is able to register ");
	}

	@Test(enabled = false)
	public void logout() {
		System.out.println("user is able to logout ");
	}
}
