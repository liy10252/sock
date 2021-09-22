package cases.firewall.log.share;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.share.SharePage;
import util.SeleniumTestCase;
import util.TestUtil;

public class ShowTest extends SeleniumTestCase {

	SharePage sharePage;

	@Test(description = "按详情显示")
	public void showDetail(){

		sharePage = new SharePage(driver);
		sharePage.getCustomSearch().click();
		sharePage.singleClick(sharePage.getOperateAll(), sharePage.getCreateFile());
		TestUtil.seleniumWait();

		Assert.assertEquals(sharePage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showDetail"),"按详情显示验证失败");

	}


	@Test(dependsOnMethods = "showDetail",description = "按终端显示")
	public void showEp(){

		sharePage.getBaseEp().click();
		TestUtil.seleniumWait();

		Assert.assertEquals(sharePage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showEp"),"按终端显示验证失败");

	}
}
