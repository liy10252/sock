package cases.viruskill.log.sysdef;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.log.sysdef.SysDefPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class ShowTest extends SeleniumTestCase {

	SysDefPage sysDefPage;

	@Test(description = "按终端显示")
	public void showEp(){

		sysDefPage = new SysDefPage(driver);
		sysDefPage.getCustomSearch().click();
		sysDefPage.singleClick(sysDefPage.getProtectAll(),sysDefPage.getFileProtect());

		TestUtil.seleniumWait();
		Assert.assertEquals(sysDefPage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showEp"),"按终端显示验证失败");
	}

	@Test(dependsOnMethods = "showEp",description = "按风险显示")
	public void showRisk(){

		sysDefPage.getBaseXav().click();
		TestUtil.seleniumWait();
		Assert.assertEquals(sysDefPage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showRisk"),"按风险显示验证失败");
	}

	@Test(dependsOnMethods = "showEp",description = "按详情显示")
	public void showDetail(){

		sysDefPage.getBaseDetail().click();
		TestUtil.seleniumWait();
		Assert.assertEquals(sysDefPage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showDetail"),"按详情显示验证失败");
	}
}


