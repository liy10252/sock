package cases.terminal.setup.tersetup;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.setup.tersetup.TerSetUpPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	TerSetUpPage terSetUpPage;

	@Test(description = "恢复默认")
	public void renew(){

		terSetUpPage = new TerSetUpPage(driver);
		terSetUpPage.renew();

		Assert.assertFalse(terSetUpPage.getHide().isSelected(),"恢复托盘设置验证错误");
		Assert.assertTrue(terSetUpPage.getBombBox().isSelected(),"恢复客户端授权验证错误");
		Assert.assertFalse(terSetUpPage.getIdentity().isSelected(),"恢复锁定客户端身份验证错误");

		Assert.assertEquals(terSetUpPage.getPwd().getAttribute("value"),"","恢复管理员密码验证失败");
//		Assert.assertEquals(terSetUpPage.getMainTitle().getAttribute("value"),"","恢复主标题验证失败");
//		Assert.assertEquals(terSetUpPage.getSubHead().getAttribute("value"),"","恢复副标题验证失败");
	}
}
