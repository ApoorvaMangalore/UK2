package workingWithUnitTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToUnderStandChronologicalOrder {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println(" I am before suite");
	}

	@Test
	public void test() {
		System.out.println("Hello testNg");
	}

	@Test
	public void run() {
		System.out.println("Hello run");
	}

	@Test
	public void apoorva() {
		System.out.println("Hello apoorva");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am before Test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println(" I am after suite");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("I am after test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am before classs");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am after class");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am  after method");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am  before method");
	}

}
