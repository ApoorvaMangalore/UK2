package workingWithUnitTestNg;

import org.testng.annotations.Test;

public class UnderstandingAboutPriority {
//priority defalut value is "zero"
//if no priority the alphabetical order
	//try with positive value
	//try with negative value
	//try with zero (with out priority)
final int a=4;
	@Test(priority =-1 )
	public void register() {
		System.out.println("User is able to register");
	}

	@Test(priority =-2 )
	public void login() {
		System.out.println("User is able to login");
	}

	@Test(priority = a)
	public void signout() {
		System.out.println("User is able to signout");
	}

	@Test(priority = -4)
	public void addtocart() {
		System.out.println("User is able to addtocart");
	}

	@Test(priority = -3)
	public void wishlist() {
		System.out.println("User is able to wishlist");
	}

	@Test(priority = 5)
	public void vote() {
		System.out.println("User is able to vote");
	}
}
