package workingWithElementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Register")
	private WebElement registerLink;

	@FindBy(id = "gender-female")
	private WebElement femaleradioButton;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getFemaleradioButton() {
		return femaleradioButton;
	}

	public WebElement getFisrtName() {
		return fisrtName;
	}

	@FindBy(id = "FirstName")
	private WebElement fisrtName;

}
