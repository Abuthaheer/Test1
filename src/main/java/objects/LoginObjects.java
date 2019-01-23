package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common.BasePage;

public class LoginObjects extends BasePage {

	@FindBy(id = "username")
	private WebElement name;

	@FindBy(id = "username")
	private WebElement passWord;

	@FindBy(id = "login")
	private WebElement btnLogin;

	public LoginObjects() {
		PageFactory.initElements(driver, this);
	}

	public void enterUserName(String input) {
		setText(name, input);
	}

	public String getEnteredUserName() {
		return getTxtAttribute(name);
	}

}
