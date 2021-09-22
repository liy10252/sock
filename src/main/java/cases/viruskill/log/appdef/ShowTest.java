package cases.viruskill.log.appdef;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.log.appdef.AppDefPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class ShowTest extends SeleniumTestCase {

	AppDefPage appDefPage;

	@Test(description = "按终端显示")
	public void showEp(){

		appDefPage = new AppDefPage(driver);
		appDefPage.getCustomSearch().click();
		appDefPage.singleClick(appDefPage.getAppAll(),appDefPage.getSoftware());
		TestUtil.seleniumWait();

		Assert.assertEquals(appDefPage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showEp"),"按终端显示验证失败");
	}

	@Test(dependsOnMethods = "showEp",description = "按风险显示")
	public void showRisk(){

		appDefPage.getBaseXav().click();
		TestUtil.seleniumWait();

		Assert.assertEquals(appDefPage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showRisk"),"按风险显示验证失败");
	}

	@Test(dependsOnMethods = "showEp",description = "按详情显示")
	public void showDetail(){

		appDefPage.getBaseDetail().click();
		TestUtil.seleniumWait();

		Assert.assertEquals(appDefPage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showDetail"),"按详情显示验证失败");
	}
}



