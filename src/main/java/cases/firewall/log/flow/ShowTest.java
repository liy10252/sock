package cases.firewall.log.flow;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.flow.FlowPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class ShowTest extends SeleniumTestCase {

	FlowPage flowPage;

	@Test(description = "按详情显示")
	public void showDetail(){

		flowPage = new FlowPage(driver);
		flowPage.getCustomSearch().click();
		flowPage.specialTool(param.getString("start"),param.getString("end"),"noButton");
		TestUtil.seleniumWait();

		Assert.assertEquals(flowPage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showDetail"),"按详情显示验证失败");
	}


	@Test(dependsOnMethods = "showDetail",description = "按终端显示")
	public void showEp(){

		flowPage.getBaseEp().click();
		TestUtil.seleniumWait();

		Assert.assertEquals(flowPage.getWebDataTr().getText().trim()
						.replaceAll("\r|\n","")
				,expect.getString("showEp"),"按终端显示验证失败");
	}
}
