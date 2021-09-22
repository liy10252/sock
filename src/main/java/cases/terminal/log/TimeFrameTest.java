package cases.terminal.log;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.log.LogPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class TimeFrameTest extends SeleniumTestCase {

	LogPage logPage;

	@Test(description = "时间范围本周")
	public void thisWeek(){

		logPage = new LogPage(driver);
		logPage.getCustomSearch().click();
		logPage.timeFrameTool(logPage.getWeek());
		Assert.assertTrue(TestUtil.getValueList(logPage.getClientNames()).contains(expect.getString("thisWeek")),"时间范围验证错误");
	}


	@Test(dependsOnMethods = "thisWeek",description = "时间范围本月")
	public void thisMonth(){
		logPage.timeFrameTool(logPage.getMonth());
		Assert.assertTrue(TestUtil.getValueList(logPage.getClientNames()).contains(expect.getString("thisMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围上月")
	public void lastMonth(){
		logPage.timeFrameTool(logPage.getLastMonth());
		Assert.assertTrue(TestUtil.getValueList(logPage.getClientNames()).contains(expect.getString("lastMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围指定")
	public void special(){

		logPage.specialTool(param.getString("start"),param.getString("end"));
		Assert.assertTrue(TestUtil.getValueList(logPage.getClientNames()).contains(expect.getString("special")),"时间范围验证错误");

	}


}