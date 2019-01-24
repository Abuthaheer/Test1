package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import objects.LoginObjects;

public class LoginTests {

	public LoginObjects lg;

	public LoginTests() {
		lg = new LoginObjects();
	}

	@Test
	public void verifyUserName1() {
		lg.enterUserName("Abuthaheer");
		String value = lg.getEnteredUserName();
		Assert.assertTrue(value.equals("Abuthaheer"), "Failed: Login Failed");
	}

}
