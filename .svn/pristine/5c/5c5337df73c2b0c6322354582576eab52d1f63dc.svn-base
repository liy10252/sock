package cases.viruskill.setup.sword;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.sword.SwordPage;
import util.SeleniumTestCase;

public class SetupTest extends SeleniumTestCase {

	SwordPage swordPage;

	@Test(description = "设置一")
	public void setupOne(){

		swordPage = new SwordPage(driver);
		swordPage.setOne();

		Assert.assertTrue(swordPage.getProtect().isSelected(),"开启防护错误");
		Assert.assertFalse(swordPage.getLog().isSelected(),"记录日志错误");
		Assert.assertFalse(swordPage.getPromptUser().isSelected(),"提示用户错误");
		Assert.assertTrue(swordPage.getLetGo().isSelected(),"处理方式错误");
	}

	@Test(dependsOnMethods = "setupOne",description = "设置二")
	public void setupTwo(){

		swordPage.setTwo();

		Assert.assertTrue(swordPage.getRefuse().isSelected(),"处理方式验证错误");
	}
}
