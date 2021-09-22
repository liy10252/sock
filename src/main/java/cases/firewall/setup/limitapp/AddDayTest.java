package cases.firewall.setup.limitapp;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.limitapp.LimitAppPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class AddDayTest extends SeleniumTestCase {

	LimitAppPage limitAppPage;

	@Test(description = "添加每天受限")
	public void addDay(){

		limitAppPage = new LimitAppPage(driver);
		String start = param.getString("start");
		String end = param.getString("end");
		String ruleStr = param.getString("ruleStr");
		String webRule = limitAppPage.everyDayAdd(start,end,ruleStr);

		Assert.assertEquals(webRule,expect.getString("webRule"),"受限程序验证错误");
		Assert.assertTrue(TestUtil.getValueList(limitAppPage.getTds())
				.contains(expect.getString("webDay")),"添加每天受限验证错误");
	}
}
