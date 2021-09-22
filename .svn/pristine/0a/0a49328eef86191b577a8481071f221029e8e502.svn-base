package cases.firewall.log.advert;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.advert.AdvertPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class ShowTest extends SeleniumTestCase {

	AdvertPage advertPage;

	@Test(description = "按详情显示")
	public void showDetail(){

		advertPage = new AdvertPage(driver);
		advertPage.getCustomSearch().click();
		advertPage.specialTool(param.getString("start"),param.getString("end"),"noButton");
		TestUtil.seleniumWait();

		Assert.assertEquals(advertPage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showDetail"),"按详情显示验证失败");

	}


	@Test(dependsOnMethods = "showDetail",description = "按终端显示")
	public void showEp(){

		advertPage.getBaseEp().click();
		TestUtil.seleniumWait();

		Assert.assertEquals(advertPage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showEp"),"按终端显示验证失败");

	}

}