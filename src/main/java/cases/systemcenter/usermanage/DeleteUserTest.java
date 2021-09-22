package cases.systemcenter.usermanage;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.systemcenter.usermanage.UserManagePage;
import util.SeleniumTestCase;

public class DeleteUserTest extends SeleniumTestCase {

	UserManagePage userManagePage;

	@Test(description = "删除管理员")
	public void deleteUser(){

		userManagePage = new UserManagePage(driver);
		userManagePage.deleteUser();

		Assert.assertEquals(userManagePage.getCount().getText(),expect.getString("delNum")
		,"删除管理员验证错误");
	}
}
