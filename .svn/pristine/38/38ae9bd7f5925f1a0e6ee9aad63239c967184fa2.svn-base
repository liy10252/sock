package cases.viruskill.log.virusdetail;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.log.virusdetail.VirusDetailPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class TimeFrameTest extends SeleniumTestCase {

	VirusDetailPage virusDetailPage;

	@Test(description = "时间范围本周")
	public void thisWeek(){

		virusDetailPage = new VirusDetailPage(driver);
		virusDetailPage.getCustomSearch().click();
		virusDetailPage.timeFrameTool(virusDetailPage.getWeek());
		Assert.assertTrue(TestUtil.getValueList(virusDetailPage.getClientNames()).contains(expect.getString("thisWeek")),"时间范围验证错误");
	}


	@Test(dependsOnMethods = "thisWeek",description = "时间范围本月")
	public void thisMonth(){
		virusDetailPage.timeFrameTool(virusDetailPage.getMonth());
		Assert.assertTrue(TestUtil.getValueList(virusDetailPage.getClientNames()).contains(expect.getString("thisMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围上月")
	public void lastMonth(){
		virusDetailPage.timeFrameTool(virusDetailPage.getLastMonth());
		Assert.assertTrue(TestUtil.getValueList(virusDetailPage.getClientNames()).contains(expect.getString("lastMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围指定")
	public void special(){

		virusDetailPage.specialTool(param.getString("start"),param.getString("end"));
		Assert.assertTrue(TestUtil.getValueList(virusDetailPage.getClientNames()).contains(expect.getString("special")),"时间范围验证错误");

	}


}
