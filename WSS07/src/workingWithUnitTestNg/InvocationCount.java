package workingWithUnitTestNg;

import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class InvocationCount {
	
//n number of times if you want to run testcase
//invocationCount default value will be 1
	public static void main(String[] args) {
		System.out.println("main");
	}
	@Test(priority = 1)
	public void openbrowser() {
		System.out.println("user is able to openbrowser");
	}

	@Test(priority = 2)
	public void enterurl() {
		System.out.println("user is able to enter url ");
	}

	@Test(priority = 3,invocationCount =3)
	public void register() {
		System.out.println("user is able to register ");
	}

	@Test(enabled = false)
	public void logout() {
		System.out.println("user is able to logout ");
	}
}
