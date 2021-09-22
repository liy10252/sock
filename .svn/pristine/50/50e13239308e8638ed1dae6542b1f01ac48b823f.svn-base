package cases.firewall.log.network;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.network.NetWorkPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class ShowTest extends SeleniumTestCase {

	NetWorkPage netWorkPage;

	@Test(description = "按详情显示")
	public void showDetail(){

		netWorkPage = new NetWorkPage(driver);
		netWorkPage.getCustomSearch().click();
		netWorkPage.singleClick(netWorkPage.getTypeAll(),netWorkPage.getConnect());
		TestUtil.seleniumWait();

		Assert.assertEquals(netWorkPage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showDetail"),"按详情显示验证失败");

	}


	@Test(dependsOnMethods = "showDetail",description = "按终端显示")
	public void showEp(){

		netWorkPage.getBaseEp().click();
		TestUtil.seleniumWait();

		Assert.assertEquals(netWorkPage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showEp"),"按终端显示验证失败");

	}

}