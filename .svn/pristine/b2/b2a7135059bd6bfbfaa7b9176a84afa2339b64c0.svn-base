package cases.terminal.setup.centerser;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.setup.centerser.CenterSerPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class ButtonTest extends SeleniumTestCase {

	CenterSerPage centerSerPage;

	@Test(description = "按钮设置")
	public void button(){

		centerSerPage = new CenterSerPage(driver);
		centerSerPage.buttonUtil();
		TestUtil.seleniumWait();

		Assert.assertTrue(centerSerPage.getOpen().isSelected(),"中心发现代理开启验证错误");
		Assert.assertTrue(centerSerPage.getCheck().isSelected(),"中心发现代理检查验证错误");
		Assert.assertEquals(centerSerPage.getWebInterval().getText(),
				expect.getString("interval"),"间隔验证错误");
		Assert.assertEquals(centerSerPage.getWebBand().getText(),
				expect.getString("band"),"带宽限制验证错误");

	}
}
