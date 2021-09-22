package cases.firewall.setup.limitapp;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.limitapp.LimitAppPage;
import util.SeleniumTestCase;

public class AddSlotTest extends SeleniumTestCase {

	LimitAppPage limitAppPage;

	@Test(description = "添加时间段受限")
	public void addSlot(){

		limitAppPage = new LimitAppPage(driver);
		String start = param.getString("start");
		String end = param.getString("end");
		String name = param.getString("name");
		String webRule = limitAppPage.slotAdd(start,end,name);

		Assert.assertEquals(webRule,expect.getString("webRule"),"受限程序验证错误");
		Assert.assertEquals(limitAppPage.getTds().get(0).getText().trim(),
				expect.getString("webSlot"),"添加时间段受限验证错误");
	}
}
