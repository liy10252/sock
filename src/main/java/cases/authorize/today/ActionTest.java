package cases.authorize.today;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.authorize.today.TodayPage;
import util.SeleniumTestCase;

public class ActionTest extends SeleniumTestCase {

	TodayPage todayPage;

	@Test(description = "已授权")
	public void author(){

		todayPage = new TodayPage(driver);
		todayPage.getCustomSearch().click();
//		todayPage.author();

		Assert.assertEquals(todayPage.getWebName().getText().trim(),expect.getString("author"),
				"已授权验证错误");
	}

	@Test(dependsOnMethods = "author",description = "未授权")
	public void unAuthor(){

		todayPage.unAuthor();

		Assert.assertEquals(todayPage.getWebName().getText().trim(),expect.getString("unAuthor"),
				"未授权验证错误");
	}
}
