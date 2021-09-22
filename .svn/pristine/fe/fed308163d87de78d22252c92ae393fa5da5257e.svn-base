package cases.firewall.setup.rule;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.rule.RulePage;
import util.SeleniumTestCase;

public class PortTest extends SeleniumTestCase{

	RulePage rulePage;

	@Test(description = "端口")
	public void portSet(){

		rulePage = new RulePage(driver);
		String ip = param.getString("ip");
		rulePage.portSet(driver,ip);

		Assert.assertFalse(rulePage.getOpenPort().isSelected(),"启用端口错误");
		Assert.assertFalse(rulePage.getPortAlert().isSelected(),"通知用户错误");
		Assert.assertEquals(rulePage.getWebPort().getText(),ip,"添加端口错误");
	}
}
