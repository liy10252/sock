package cases.viruskill.setup.sysstreng;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.sysstreng.SysStrengPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	SysStrengPage sysStrengPage;

	@Test(description = "恢复默认")
	public void renew(){

		sysStrengPage = new SysStrengPage(driver);
		sysStrengPage.renew();

		Assert.assertTrue(sysStrengPage.getBootStart().isSelected(),"恢复系统加固验证错误");
		Assert.assertTrue(sysStrengPage.getNotice().isSelected(),"恢复发现威胁验证错误");
		Assert.assertTrue(sysStrengPage.getInterceptLog().isSelected(),"恢复拦截日志验证错误");
		Assert.assertTrue(sysStrengPage.getLow().isSelected(),"恢复监控灵敏度验证错误");
		Assert.assertFalse(sysStrengPage.getOpen().isSelected(),"恢复审计模式验证错误");
		Assert.assertTrue(sysStrengPage.getDigitalSignature().isSelected(),"恢复其他验证错误");
	}
}
