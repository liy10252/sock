package cases.firewall.setup.rule;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.rule.RulePage;
import util.SeleniumTestCase;

public class WhiteTest extends SeleniumTestCase {

	RulePage rulePage;

	@Test(description = "白名单")
	public void whiteSet(){

		rulePage = new RulePage(driver);
		String ip = param.getString("ip");
		rulePage.whiteSet(ip);

		Assert.assertFalse(rulePage.getOpenWhite().isSelected(),"启用白名单错误");
		Assert.assertEquals(rulePage.getWebWhite().getText(),ip,"添加白名单错误");
	}
}
