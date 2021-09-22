package cases.firewall.log.malice;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.malice.MalicePage;
import util.SeleniumTestCase;
import util.TestUtil;

public class ShowTest extends SeleniumTestCase {

	MalicePage malicePage;

	@Test(description = "按详情显示")
	public void showDetail(){

		malicePage = new MalicePage(driver);
		malicePage.getCustomSearch().click();
		malicePage.singleClick(malicePage.getTypeAll(),malicePage.getSearch());
		TestUtil.seleniumWait();

		Assert.assertEquals(malicePage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showDetail"),"按详情显示验证失败");

	}


	@Test(dependsOnMethods = "showDetail",description = "按终端显示")
	public void showEp(){

		malicePage.getBaseEp().click();
		TestUtil.seleniumWait();

		Assert.assertEquals(malicePage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showEp"),"按终端显示验证失败");

	}

  }


