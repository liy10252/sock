package cases.viruskill.setup.appstreng;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.appstreng.AppStrengPage;
import util.SeleniumTestCase;

public class ClickTest extends SeleniumTestCase {

	AppStrengPage appStrengPage;

	@Test(description = "点击操作一")
	public void clickOne(){

		appStrengPage = new AppStrengPage(driver);
		appStrengPage.clickOne();

		Assert.assertTrue(appStrengPage.getAllowRun().isSelected(),"发现威胁验证错误");
		Assert.assertTrue(appStrengPage.getAutoProcess().isSelected(),"处理方式验证错误");
		Assert.assertTrue(appStrengPage.getNoRecord().isSelected(),"拦截日志验证错误");
		Assert.assertTrue(appStrengPage.getNoPop().isSelected(),"被保护的软件启动验证错误");
	}

	@Test(dependsOnMethods = "clickOne",description = "点击操作二")
	public void clickTwo(){

		appStrengPage.clickTwo();

		Assert.assertFalse(appStrengPage.getOpen().isSelected(),"启用应用加固验证错误");
	}
}
