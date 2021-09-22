package cases.systemcenter.usermanage;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.systemcenter.usermanage.UserManagePage;
import util.SeleniumTestCase;
import java.util.Map;

public class UpdateUserTest extends SeleniumTestCase {

	UserManagePage userManagePage;

	@Test(description = "修改管理员")
	public void updateUser(){

		userManagePage = new UserManagePage(driver);
		Map<String, Object> params = param.getInnerMap();
		userManagePage.updateUser(driver,params);

		Assert.assertEquals(userManagePage.getPhoneVal().getAttribute("value"),
				params.get("phone").toString(),"修改手机号验证错误");
		Assert.assertEquals(userManagePage.getEmailVal().getAttribute("value"),
				params.get("email").toString(),"修改邮箱验证错误");
		Assert.assertEquals(userManagePage.getIpOne().getAttribute("value"),
				params.get("ipOne").toString(),"修改ip验证错误");
		Assert.assertEquals(userManagePage.getIpTwo().getAttribute("value"),
				params.get("ipTwo").toString(),"修改ip验证错误");
		Assert.assertEquals(userManagePage.getIpThree().getAttribute("value"),
				params.get("ipThree").toString(),"修改ip验证错误");
		Assert.assertEquals(userManagePage.getIpFour().getAttribute("value"),
				params.get("ipFour").toString(),"修改ip验证错误");

	}
}
