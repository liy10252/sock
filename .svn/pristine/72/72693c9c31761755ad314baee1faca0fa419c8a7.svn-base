package cases.systemcenter.usermanage;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.systemcenter.usermanage.UserManagePage;
import util.SeleniumTestCase;

public class UserSetTest extends SeleniumTestCase {

	UserManagePage userManagePage;

	@Test(description = "设置")
	public void userSet(){

		userManagePage = new UserManagePage(driver);
		String out = param.getString("out");
		String fail = param.getString("fail");
		String timeStr = param.getString("timeStr");
		userManagePage.userSet(out,fail,timeStr);

		Assert.assertEquals(userManagePage.getTimeOut().getAttribute("value"),
				out,"超时退出验证错误");
		Assert.assertEquals(new Select(userManagePage.getFailNum()).getFirstSelectedOption().getText(),
				fail,"错误次数验证错误");
		Assert.assertEquals(userManagePage.getTime().getAttribute("value"),
				timeStr,"自动解锁验证错误");

	}
}
