package cases.firewall.log.hacker;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.hacker.HackerPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class ShowTest extends SeleniumTestCase {

	HackerPage hackerPage;

	@Test(description = "按详情显示")
	public void showDetail(){

		hackerPage = new HackerPage(driver);
		hackerPage.getCustomSearch().click();
		hackerPage.singleClick(hackerPage.getStateAll(),hackerPage.getPrevent());
		TestUtil.seleniumWait();

		Assert.assertEquals(hackerPage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showDetail"),"按详情显示验证失败");

	}


	@Test(dependsOnMethods = "showDetail",description = "按终端显示")
	public void showEp(){

		hackerPage.getBaseEp().click();
		TestUtil.seleniumWait();

		Assert.assertEquals(hackerPage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showEp"),"按终端显示验证失败");

	}

}

