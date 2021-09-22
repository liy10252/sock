package cases.terminal.setup.tersetup;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.setup.tersetup.TerSetUpPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class ButtonTest extends SeleniumTestCase {

	TerSetUpPage terSetUpPage;

	@Test(description = "按钮设置")
	public void button(){

		terSetUpPage = new TerSetUpPage(driver);
		terSetUpPage.buttonUtil();
		TestUtil.seleniumWait();
		Assert.assertTrue(terSetUpPage.getHide().isSelected(),"托盘设置验证错误");
		Assert.assertTrue(terSetUpPage.getNoBombBox().isSelected(),"客户端授权验证错误");
		Assert.assertTrue(terSetUpPage.getIdentity().isSelected(),"锁定客户端身份验证错误");
	}
}
