package cases.viruskill.setup.appstreng;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.appstreng.AppStrengPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	AppStrengPage appStrengPage;

	@Test(description = "恢复默认")
	public void renew(){

		appStrengPage = new AppStrengPage(driver);
		appStrengPage.renew();

		Assert.assertTrue(appStrengPage.getOpen().isSelected(),"恢复启用应用加固验证错误");
		Assert.assertTrue(appStrengPage.getNoRun().isSelected(),"恢复发现威胁验证错误");
		Assert.assertTrue(appStrengPage.getNotice().isSelected(),"恢复处理方式验证错误");
		Assert.assertTrue(appStrengPage.getRecord().isSelected(),"恢复拦截日志验证错误");
		Assert.assertTrue(appStrengPage.getPop().isSelected(),"恢复被保护的软件启动验证错误");
	}
}
