package workingWithElementRepo;

import org.testng.annotations.Test;

public class ToregisterForDemoWebShop extends baseClass {

	@Test
	public void run() {
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.getRegisterLink().click();
		registerPage.getFemaleradioButton().click();
		registerPage.getFisrtName().sendKeys("apoorva");
	}

}
