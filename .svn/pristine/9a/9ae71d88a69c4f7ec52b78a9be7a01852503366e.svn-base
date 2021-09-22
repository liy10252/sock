package cases.terminal.setup.keeplog;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.setup.keeplog.KeepLogPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class ButtonTest extends SeleniumTestCase {

	KeepLogPage keepLogPage;

	@Test(description = "按钮设置")
	public void button(){

		keepLogPage = new KeepLogPage(driver);
		keepLogPage.buttonUtil();
		TestUtil.seleniumWait();

		Assert.assertTrue(keepLogPage.getUpdateAnd().isSelected(),"客户端升级按钮验证错误");
		Assert.assertTrue(keepLogPage.getInstallAnd().isSelected(),"客户端安装按钮验证错误");
		Assert.assertTrue(keepLogPage.getEventAnd().isSelected(),"病毒查杀事件按钮验证错误");
		Assert.assertTrue(keepLogPage.getNoteAnd().isSelected(),"病毒查杀记录按钮验证错误");
		Assert.assertTrue(keepLogPage.getTrackAnd().isSelected(),"病毒跟踪按钮验证错误");
		Assert.assertTrue(keepLogPage.getSystemAnd().isSelected(),"系统加固按钮验证错误");
		Assert.assertTrue(keepLogPage.getAppAnd().isSelected(),"应用加固按钮验证错误");
	}
}
