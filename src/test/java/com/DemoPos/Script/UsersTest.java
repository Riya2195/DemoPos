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

	@Test(priority = 6,description="Verify the User Management")
	public void verifyClickUserMnagement() throws IOException {
    objUsers = new UsersPage(driver);
    boolean assert6=objUsers.clickUserManagement();
    Assert.assertTrue(assert6);
    
    }
	
	@Test(priority = 7,description="Verify the Add button in User Management")
	public void verifyAddUser() {
    objUsers = new UsersPage(driver);
    objUsers.clickAdd();
    Assert.assertEquals(objUsers.addUser(), Constants.ADDUSER);
    }
	
	@Test(priority = 8,description="Verify user is able to first name")
	public void verifyenterFirstName() {
	    objUsers = new UsersPage(driver);
	    String firstName=RandomUtilities.getfName();
	    boolean assert8=objUsers.enterFirstName(firstName);
	    Assert.assertTrue(assert8);

	    }
	
	
	@Test(priority = 9,description="Verify user able to enter Role for the user")
	public void verifyRoleSelection() {
	    objUsers = new UsersPage(driver);
	    boolean assert9=objUsers.selectRole(4);
	    Assert.assertTrue(assert9);
	    }

	

}
