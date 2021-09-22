package cases.firewall.setup.flowmanage;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.flowmanage.FlowManagePage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	FlowManagePage flowManagePage;

	@Test(description = "恢复默认")
	public void renew(){

		flowManagePage = new FlowManagePage(driver);
		flowManagePage.renew();

		Assert.assertFalse(flowManagePage.getOpenNet().isSelected(),"恢复开启联网管理验证错误");
		Assert.assertEquals(flowManagePage.getInterval().getAttribute("value"),
				expect.getString("min"),"恢复时间间隔验证错误");
	}
}
