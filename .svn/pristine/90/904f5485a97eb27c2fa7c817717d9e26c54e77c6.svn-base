package cases.firewall.setup.limitweb;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.limitweb.LimitWebPage;
import util.SeleniumTestCase;

public class AddSlotTest extends SeleniumTestCase {

	LimitWebPage limitWebPage;

	@Test(description = "添加时间段")
	public void slotAdd(){

		String start = param.getString("start");
		String end = param.getString("end");
		String web = param.getString("web");
		String redStr = param.getString("redStr");

		limitWebPage = new LimitWebPage(driver);
		limitWebPage.timeSlotAdd(start,end,web,redStr);

		Assert.assertEquals(limitWebPage.getTds().get(0).getText().trim(),
						expect.getString("webSlot"),"添加时间段受限验证错误");
	}
}
