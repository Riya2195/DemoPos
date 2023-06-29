package com.DemoPos.Script;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DemoPos.Base.TestBase;
import com.DemoPos.Constants.Constants;
import com.DemoPos.Pages.LoginPage;
import com.DemoPos.Pages.UsersPage;
import com.DemoPos.Utilities.RandomUtilities;

public class UsersTest extends TestBase {

	UsersPage objUsers;

	@Test(priority = 6, description = "Verify user is able add details", groups = { "smoke" })
	public void verifyenterFirstName() {
		objUsers = new UsersPage(driver);
		String firstName = RandomUtilities.getfName();
		String email = RandomUtilities.getRandomEmail();
		RandomUtilities.getusername();
		String testPassword = RandomUtilities.getpassword();
		int role = 4;
		boolean assert6 = objUsers.enterFirstName(firstName, email, testPassword, role);
		Assert.assertEquals(objUsers.userAddMessage(), Constants.USERSUCCESSMESSAGE);

	}

}
