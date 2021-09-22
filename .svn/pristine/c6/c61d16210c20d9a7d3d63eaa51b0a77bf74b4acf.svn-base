package cases.viruskill.setup.sysstreng;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.sysstreng.SysStrengPage;
import util.SeleniumTestCase;

public class ClickTest extends SeleniumTestCase {

	SysStrengPage sysStrengPage;

	@Test(description = "点击操作一")
	public void clickOne(){

		sysStrengPage = new SysStrengPage(driver);
		sysStrengPage.clickOne();

		Assert.assertTrue(sysStrengPage.getAutoHandle().isSelected(),"发现威胁验证错误");
		Assert.assertFalse(sysStrengPage.getInterceptLog().isSelected(),"拦截日志验证错误");
		Assert.assertTrue(sysStrengPage.getMiddle().isSelected(),"监控灵敏度验证错误");
		Assert.assertTrue(sysStrengPage.getOpen().isSelected(),"审计模式验证错误");
		Assert.assertFalse(sysStrengPage.getDigitalSignature().isSelected(),"其他验证错误");
	}

	@Test(dependsOnMethods = "clickOne",description = "点击操作二")
	public void clickTwo(){

		sysStrengPage.clickTwo();

		Assert.assertFalse(sysStrengPage.getBootStart().isSelected(),"系统加固验证错误");
		Assert.assertTrue(sysStrengPage.getHigh().isSelected(),"监控灵敏度验证错误");
	}
}
