package cases.viruskill.log.virusdetail;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.log.virusdetail.VirusDetailPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class ShowTest extends SeleniumTestCase {

	VirusDetailPage virusDetailPage;

	@Test(description = "按病毒显示")
	public void showVirus(){

		virusDetailPage = new VirusDetailPage(driver);
		virusDetailPage.getCustomSearch().click();
		virusDetailPage.singleClick(virusDetailPage.getSourceAll(),virusDetailPage.getQuickScan());

		TestUtil.seleniumWait();
		Assert.assertEquals(virusDetailPage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showVirus"),"按病毒显示验证失败");

	}

	@Test(dependsOnMethods = "showVirus",description = "按终端显示")
	public void showEp(){

		virusDetailPage.getBaseEp().click();
		TestUtil.seleniumWait();
		Assert.assertEquals(virusDetailPage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showEp"),"按终端显示验证失败");
	}

	@Test(dependsOnMethods = "showVirus",description = "按详情显示")
	public void showDetail(){

		virusDetailPage.getBaseDetail().click();
		TestUtil.seleniumWait();
		Assert.assertEquals(virusDetailPage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showDetail"),"按详情显示验证失败");
	}
}
