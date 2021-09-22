package cases.viruskill.setup.sword;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.sword.SwordPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	SwordPage swordPage;

	@Test(description = "恢复默认")
	public void renew(){

		swordPage = new SwordPage(driver);
		swordPage.renew();

		Assert.assertFalse(swordPage.getProtect().isSelected(),"恢复开启防护错误");
		Assert.assertTrue(swordPage.getLog().isSelected(),"恢复日志错误");
		Assert.assertTrue(swordPage.getPromptUser().isSelected(),"恢复提示用户错误");
		Assert.assertTrue(swordPage.getAsk().isSelected(),"恢复处理方式错误");

	}
}
