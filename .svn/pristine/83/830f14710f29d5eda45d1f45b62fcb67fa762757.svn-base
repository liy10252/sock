package cases.viruskill.setup.blackmail;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.blackmail.BlackMailPage;
import util.SeleniumTestCase;

public class BlackMailTest extends SeleniumTestCase {

	BlackMailPage blackMailPage;

	@Test(description = "防勒索文件保护操作一")
	public void blackMailOne(){

		blackMailPage = new BlackMailPage(driver);
		blackMailPage.blackMailOne();

		Assert.assertTrue(blackMailPage.getProtect().isSelected(),"启用保护验证错误");
		Assert.assertTrue(blackMailPage.getLearningMode().isSelected(),"保护模式验证错误");
		Assert.assertTrue(blackMailPage.getModify().isSelected(),"拦截文件操作验证错误");
		Assert.assertTrue(blackMailPage.getDelete().isSelected(),"拦截文件操作验证错误");
		Assert.assertTrue(blackMailPage.getRefuse().isSelected(),"拦截后操作验证错误");
		Assert.assertTrue(blackMailPage.getPromptUser().isSelected(),"提示用户验证错误");
		Assert.assertTrue(blackMailPage.getLog().isSelected(),"记录日志验证错误");
	}

	@Test(dependsOnMethods = "blackMailOne",description = "防勒索文件保护操作二")
	public void blackMailTwo(){

		blackMailPage.blackMailTwo();

		Assert.assertTrue(blackMailPage.getEndProcess().isSelected(),"拦截后操作验证错误");
	}

	@Test(dependsOnMethods = "blackMailOne",description = "防勒索文件保护操作三")
	public void blackMailThree(){

		blackMailPage.blackMailThree();

		Assert.assertTrue(blackMailPage.getProgramRerun().isSelected(),"拦截后操作验证错误");
	}
}
