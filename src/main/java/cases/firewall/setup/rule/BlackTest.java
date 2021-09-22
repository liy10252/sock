package cases.firewall.setup.rule;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.rule.RulePage;
import util.SeleniumTestCase;

public class BlackTest extends SeleniumTestCase {

	RulePage rulePage;

	@Test(description = "黑名单")
	public void blackSet(){

		rulePage = new RulePage(driver);
		String ip = param.getString("ip");
		rulePage.blackSet(ip);

		Assert.assertFalse(rulePage.getOpenBlack().isSelected(),"启用黑名单错误");
		Assert.assertFalse(rulePage.getBlackAlert().isSelected(),"黑名单通知用户错误");
		Assert.assertFalse(rulePage.getBlackLog().isSelected(),"黑名单日志错误");
		Assert.assertEquals(rulePage.getWebBlack().getText(),ip,"添加黑名单错误");
	}
}
