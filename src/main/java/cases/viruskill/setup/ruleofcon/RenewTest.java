package cases.viruskill.setup.ruleofcon;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.ruleofcon.RuleOfConPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	RuleOfConPage ruleOfConPage;

	@Test(description = "恢复默认")
	public void renew(){

		ruleOfConPage = new RuleOfConPage(driver);
		ruleOfConPage.renew();

		Assert.assertFalse(ruleOfConPage.getOpenRule().isSelected(),"恢复文件启用规则验证错误");
		Assert.assertTrue(ruleOfConPage.getNotifyUser().isSelected(),"恢复文件通知用户验证错误");
		Assert.assertTrue(ruleOfConPage.getInterceptLog().isSelected(),"恢复文件记录拦截日志验证错误");
		Assert.assertFalse(ruleOfConPage.getOpenRuleSys().isSelected(), "恢复系统启用规则验证错误");
		Assert.assertTrue(ruleOfConPage.getNotifyUserSys().isSelected(),"恢复系统通知用户验证错误");
		Assert.assertTrue(ruleOfConPage.getInterceptLogSys().isSelected(),"恢复系统记录拦截日志验证错误");
	}
}
