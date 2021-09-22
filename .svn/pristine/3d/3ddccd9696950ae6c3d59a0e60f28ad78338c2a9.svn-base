package cases.viruskill.overview;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.overview.OverViewPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class MailMonitorTest extends SeleniumTestCase {

	OverViewPage overViewPage;

	@Test(description = "已开启")
	public void open(){

		overViewPage = new OverViewPage(driver);
		overViewPage.getCustomSearch().click();
		overViewPage.singleClick(overViewPage.getMailAll(),overViewPage.getMailOpen(),5);

		Assert.assertTrue(TestUtil.getValueList(overViewPage.getClientNames())
						.containsAll(TestUtil.JsonToList(expect.getJSONArray("open"),"name")),
				"已开启验证失败");
		Assert.assertTrue(overViewPage.checkItems(overViewPage.getWebMails(),
				expect.getString("openState")),"已开启验证失败");

	}

	@Test(dependsOnMethods = "open",description = "已关闭")
	public void close(){

		overViewPage.singleClick(overViewPage.getMailAll(),overViewPage.getMailClose(),4);
		Assert.assertTrue(TestUtil.getValueList(overViewPage.getClientNames())
						.containsAll(TestUtil.JsonToList(expect.getJSONArray("close"),"name")),
				"已关闭验证失败");
		Assert.assertTrue(overViewPage.checkItems(overViewPage.getWebMails(),
				expect.getString("closeState")),"已关闭验证失败");
	}
}
