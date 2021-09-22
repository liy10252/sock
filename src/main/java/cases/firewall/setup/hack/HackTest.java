package cases.firewall.setup.hack;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.hack.HackPage;
import util.SeleniumTestCase;

public class HackTest extends SeleniumTestCase {

	HackPage hackPage;

	@Test(description = "防黑客设置")
	public void hack(){

		hackPage = new HackPage(driver);
		String min = param.getString("min");
		hackPage.hackUtil(min);

		Assert.assertTrue(hackPage.getPromptUser().isSelected(),"发现攻击提示用户验证错误");
		Assert.assertEquals(hackPage.getAttackSource().getAttribute("value"),
				min,"阻止攻击源验证错误");
//		Assert.assertFalse(hackPage.getWebButton().isSelected(),"防护项操作验证错误");
		Assert.assertFalse(hackPage.getTrojan().isSelected(),"防木马错误");
		Assert.assertFalse(hackPage.getSql().isSelected(),"防sql错误");
		Assert.assertFalse(hackPage.getLeak().isSelected(),"防漏洞错误");
		Assert.assertFalse(hackPage.getSnort().isSelected(),"snort防攻击错误");
	}
}
