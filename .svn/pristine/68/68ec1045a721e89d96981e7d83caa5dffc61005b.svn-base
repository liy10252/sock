package cases.firewall.log.url;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.url.UrlPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class ShowTest extends SeleniumTestCase {

	UrlPage urlPage;

	@Test(description = "按详情显示")
	public void showDetail(){

		urlPage = new UrlPage(driver);
		urlPage.getCustomSearch().click();
		urlPage.singleClick(urlPage.getStateAll(),urlPage.getRefuse());
		TestUtil.seleniumWait();

		Assert.assertEquals(urlPage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showDetail"),"按详情显示验证失败");

	}


	@Test(dependsOnMethods = "showDetail",description = "按终端显示")
	public void showEp(){

		urlPage.getBaseEp().click();
		TestUtil.seleniumWait();

		Assert.assertEquals(urlPage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showEp"),"按终端显示验证失败");

	}

}