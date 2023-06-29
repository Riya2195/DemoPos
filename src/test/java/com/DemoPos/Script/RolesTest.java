package com.DemoPos.Script;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DemoPos.Base.TestBase;
import com.DemoPos.Constants.Constants;
import com.DemoPos.Pages.RolesPage;



public class RolesTest extends TestBase {
	
	
	RolesPage objRoles;

	
	@Test(priority = 7,description="Verify add New Role",groups = {"smoke"})
	public void verifyAddNewRole() {
		objRoles = new RolesPage(driver);
		objRoles.addNewRole();
		Assert.assertEquals(objRoles.roleAddMessage(), Constants.ROLESUCCESSMESSAGE);

	}
	
	@Test(priority = 8,description="Verify Delete Role",groups = {"smoke"},retryAnalyzer = com.DemoPos.Listeners.RetryAnalyzer.class)
	public void verifyDeleteRole() {
		
		objRoles = new RolesPage(driver);
		boolean assert8=objRoles.deleteRole();
		Assert.assertFalse(assert8);

	}
	
	
}
