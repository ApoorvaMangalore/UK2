package workingWithUnitTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToWorkWithTestNg {//test case id

	@Test
	public void b() {// testcase
		System.out.println("i am b");// test step
		//Reporter.log("i am b",true);
	}
	@Test
	public void B() {
		System.out.println("i am B");
		//Reporter.log("i am B",true);
	}
	@Test
	public void c() {
		System.out.println("i am c");
	}
	@Test
	public void C() {
		System.out.println("i am C");
	}

	@Test
	public void a() {
		System.out.println("i am a");
	}
	@Test
	public void A() {
		System.out.println("i am A");
	}
	@Test
	public void d() {
		System.out.println("i am d");
	}
}
