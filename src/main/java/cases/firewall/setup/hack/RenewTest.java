package cases.firewall.setup.hack;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.hack.HackPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	HackPage hackPage;

	@Test(description = "恢复默认")
	public void renew(){

		hackPage = new HackPage(driver);
		hackPage.renew();

		Assert.assertFalse(hackPage.getPromptUser().isSelected(),"恢复发现攻击提示用户验证错误");
		Assert.assertEquals(hackPage.getAttackSource().getAttribute("value"),
				expect.getString("min"),"恢复阻止攻击源验证错误");
//		Assert.assertTrue(hackPage.getWebButton().isSelected(),"恢复防护项验证错误");
		Assert.assertTrue(hackPage.getTrojan().isSelected(),"恢复防木马错误");
		Assert.assertTrue(hackPage.getSql().isSelected(),"恢复防SQL错误");
		Assert.assertTrue(hackPage.getLeak().isSelected(),"恢复防漏洞错误");
		Assert.assertTrue(hackPage.getSnort().isSelected(),"恢复SNORT错误");
	}
}
