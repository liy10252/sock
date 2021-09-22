package cases.viruskill.setup.blackmail;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.blackmail.BlackMailPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase{

	BlackMailPage blackMailPage;

	@Test(description = "恢复默认")
	public void renew(){

		blackMailPage = new BlackMailPage(driver);
		blackMailPage.renew();

		Assert.assertFalse(blackMailPage.getProtect().isSelected(),"恢复启用保护验证错误");
		Assert.assertTrue(blackMailPage.getStandardMode().isSelected(),"恢复保护模式验证错误");
		Assert.assertFalse(blackMailPage.getModify().isSelected(),"恢复拦截文件操作验证错误");
		Assert.assertFalse(blackMailPage.getDelete().isSelected(),"恢复拦截文件操作验证错误");
		Assert.assertTrue(blackMailPage.getAsk().isSelected(),"恢复拦截后操作验证错误");
		Assert.assertFalse(blackMailPage.getPromptUser().isSelected(),"恢复提示用户验证错误");
		Assert.assertFalse(blackMailPage.getLog().isSelected(),"恢复记录日志验证错误");
//		Assert.assertFalse(blackMailPage.getSign().isSelected(),"恢复自动放过签名程序验证错误");
		Assert.assertTrue(blackMailPage.getFileExtension().getAttribute("value").isEmpty(),
				"恢复文件后缀验证错误");
	}
}
