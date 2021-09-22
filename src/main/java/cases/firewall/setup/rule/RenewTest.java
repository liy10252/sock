package cases.firewall.setup.rule;

import model.esmlog.RUA_LOG;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.rule.RulePage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	RulePage rulePage;

	@Test(description = "恢复默认")
	public void renew(){

		rulePage = new RulePage(driver);

		rulePage.renew();

		Assert.assertTrue(rulePage.getOpenWhite().isSelected(),"恢复开启白名单错误");
		Assert.assertTrue(rulePage.getOpenBlack().isSelected(),"恢复开启黑名单错误");
		Assert.assertTrue(rulePage.getBlackAlert().isSelected(),"恢复黑名单通知错误");
		Assert.assertTrue(rulePage.getBlackLog().isSelected(),"恢复黑名单日志错误");
		Assert.assertTrue(rulePage.getOpenPort().isSelected(),"恢复端口开启错误");
		Assert.assertTrue(rulePage.getPortAlert().isSelected(),"恢复端口通知错误");
		Assert.assertTrue(rulePage.getOpenCustom().isSelected(),"恢复自定义开启错误");
	}
}
