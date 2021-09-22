package cases.firewall.setup.limitapp;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.limitapp.LimitAppPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class UpdateTest extends SeleniumTestCase {

	LimitAppPage limitAppPage;

	@Test(description = "修改")
	public void update(){

		limitAppPage = new LimitAppPage(driver);
		String start = param.getString("start");
		String end = param.getString("end");
		limitAppPage.updateDay(start,end);

		Assert.assertTrue(TestUtil.getValueList(limitAppPage.getTds())
				.contains(expect.getString("webWeek")),"修改每天受限验证错误");
	}
}
