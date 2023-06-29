package com.DemoPos.Script;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DemoPos.Base.TestBase;
import com.DemoPos.Constants.Constants;
import com.DemoPos.Pages.ContactsPage;

public class ContactsTest extends TestBase {

	ContactsPage objContacts;

	@Test(priority = 9, description = "Verify Edit Customer Group")
	public void verifyEditCostumerGroup() {
		objContacts = new ContactsPage(driver);
		objContacts.editCostumerGroup();
		Assert.assertEquals(objContacts.customerGroupUpdateMessage(), Constants.CUSTOMERGROUPUPDATEMESSAGE);

	}

	@Test(priority = 10, description = "Verify the File upload")
	public void verifyFileUpload() {
		objContacts = new ContactsPage(driver);
		Boolean result = objContacts.importContact();
		Assert.assertTrue(result);

	}

}