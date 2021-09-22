package cases.viruskill.setup.mailmonitor;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.mailmonitor.MailMonitorPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class SetPortTest extends SeleniumTestCase {

	MailMonitorPage mailMonitorPage;
	String port;

	@Test(description = "添加端口策略")
	public void addPort(){

		mailMonitorPage = new MailMonitorPage(driver);
		port = param.getString("port");
		mailMonitorPage.addPort(driver,port);

		Assert.assertTrue(mailMonitorPage.getNoPrompt().isSelected(),"扫描结果验证错误");
//		Assert.assertFalse(mailMonitorPage.getOpenCloud().isSelected(),"云扫描引擎验证错误");
		Assert.assertEquals(mailMonitorPage.getPort().getAttribute("value"),
				port,"添加端口验证错误");
	}

	@Test(dependsOnMethods = "addPort",description = "删除端口策略")
	public void delPort(){

		mailMonitorPage.delPort();

		Assert.assertFalse(TestUtil.getValueList(mailMonitorPage.getWebPorts()).contains(port),
				"删除端口策略验证错误");
	}
}
