package cases.firewall.setup.flowmanage;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.flowmanage.FlowManagePage;
import util.SeleniumTestCase;

public class FlowManageTest extends SeleniumTestCase {

	FlowManagePage flowManagePage;

	@Test(description = "流量管理操作")
	public void flow(){

		flowManagePage = new FlowManagePage(driver);
		String min = param.getString("min");
		flowManagePage.flowManUtil(min);

		Assert.assertTrue(flowManagePage.getOpenNet().isSelected(),"开启联网管理验证错误");
		Assert.assertEquals(flowManagePage.getInterval().getAttribute("value"),
				min,"时间间隔验证错误");
	}
}
