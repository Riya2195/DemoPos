package com.DemoPos.Script;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemoPos.Base.TestBase;
import com.DemoPos.Constants.Constants;
import com.DemoPos.Pages.LoginPage;
import com.DemoPos.Utilities.ExcelRead;

public class LoginTest extends TestBase {
	LoginPage objLogin;

	@Test(dataProvider = "invalidUserInvalidPassword", priority = 1, description = "Verify  checking of invalid login Scenario", retryAnalyzer = com.DemoPos.Listeners.RetryAnalyzer.class)
	public void verifySigninInvalidUserInvalidpass(String userName, int password) {

		objLogin = new LoginPage(driver);
		objLogin.SetUserName(userName);

		String passwordString1 = String.valueOf(password);
		objLogin.SetPassword(passwordString1);
		objLogin.clickSignIn();
		Assert.assertEquals(objLogin.errorMessage(), Constants.ERRORMESSAGE);

	}

	@Test(dataProvider = "invalidUservalidPassword", priority = 2, description = "Verify checking invalid login Scenario")
	public void verifySigninInvalidUserValidpass(String userName, int password) {

		objLogin = new LoginPage(driver);

		objLogin.SetUserName(userName);
		String passwordString2 = String.valueOf(password);
		objLogin.SetPassword(passwordString2);
		objLogin.clickSignIn();
		Assert.assertEquals(objLogin.errorMessage(), Constants.ERRORMESSAGE);

	}

	@Test(dataProvider = "validUserInvalidPassword", priority = 3, description = "Verify checking invalid login Scenario")
	public void verifySigninValidUserInvalidpass(String userName, int password) {

		objLogin = new LoginPage(driver);
		objLogin.SetUserName(userName);
		String passwordString3 = String.valueOf(password);
		objLogin.SetPassword(passwordString3);
		objLogin.clickSignIn();

		Assert.assertEquals(objLogin.errorMessage(), Constants.ERRORMESSAGE);
	}

	@Test(dataProvider = "validUservalidPassword", priority = 4, groups = {"smoke"}, description = "Verify checking valid login Scenario")
	public void verifySigninValidUserValidpass(String userName, int password) throws IOException {

		objLogin = new LoginPage(driver);
		objLogin.SetUserName(userName);
		String passwordString4 = String.valueOf(password);
		objLogin.SetPassword(passwordString4);
		objLogin.clickSignIn();
		objLogin.clickEndTourBox();
		Assert.assertEquals(objLogin.welcomeMessage(), Constants.LOGINMESSAGE);

	}

	@DataProvider
	public Object[][] invalidUserInvalidPassword() {
		Object[][] data = new Object[1][2];
		data[0][0] = ExcelRead.getCellStringData(0, 0, Constants.Sheet1);
		data[0][1] = ExcelRead.getCellNumericData(0, 1, Constants.Sheet1);
		return data;
	}

	@DataProvider
	public Object[][] invalidUservalidPassword() {
		Object[][] data = new Object[1][2];
		data[0][0] = ExcelRead.getCellStringData(1, 0, Constants.Sheet1);
		data[0][1] = ExcelRead.getCellNumericData(1, 1, Constants.Sheet1);
		return data;
	}

	@DataProvider
	public Object[][] validUserInvalidPassword() {
		Object[][] data = new Object[1][2];
		data[0][0] = ExcelRead.getCellStringData(2, 0, Constants.Sheet1);
		data[0][1] = ExcelRead.getCellNumericData(2, 1, Constants.Sheet1);
		return data;
	}

	@DataProvider
	public Object[][] validUservalidPassword() {
		Object[][] data = new Object[1][2];
		data[0][0] = ExcelRead.getCellStringData(3, 0, Constants.Sheet1);
		data[0][1] = ExcelRead.getCellNumericData(3, 1, Constants.Sheet1);
		return data;
	}

}
