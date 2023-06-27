package com.DemoPos.Script;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DemoPos.Base.TestBase;
import com.DemoPos.Pages.RolesPage;



public class RolesTest extends TestBase {
	
	
	RolesPage objRoles;

	@Test(priority = 9,description="Verify action move the cursor to role ,then do select and click")
	public void verifyMoveToRole() {
		objRoles = new RolesPage(driver);
		objRoles.moveToRole();
		objRoles.clickAdd();
		
		
    }
	
	@Test(priority = 10,description="Verify select User Permissions")
	public void verifyUserSelectionInRole() {
		objRoles = new RolesPage(driver);
		objRoles.clickUserSelectAll();
		
		
		
    }
	
	
}
