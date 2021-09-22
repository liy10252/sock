package cases.terminal.setup.keeplog;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.setup.keeplog.KeepLogPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	KeepLogPage keepLogPage;

	@Test(description = "恢复默认")
	public void renew(){

		keepLogPage = new KeepLogPage(driver);
		keepLogPage.renew();

		Assert.assertTrue(keepLogPage.getUpdateOr().isSelected(),"恢复客户端升级按钮验证错误");
		Assert.assertTrue(keepLogPage.getInstallOr().isSelected(),"恢复客户端安装按钮验证错误");
		Assert.assertTrue(keepLogPage.getEventOr().isSelected(),"恢复查杀事件按钮验证错误");
		Assert.assertTrue(keepLogPage.getNoteOr().isSelected(),"恢复查杀记录按钮验证错误");
		Assert.assertTrue(keepLogPage.getTrackOr().isSelected(),"恢复病毒跟踪按钮验证错误");
		Assert.assertTrue(keepLogPage.getSystemOr().isSelected(),"恢复系统加固按钮验证错误");
		Assert.assertTrue(keepLogPage.getAppOr().isSelected(),"恢复应用加固按钮验证错误");

		Assert.assertEquals(keepLogPage.getUpdateDay().getAttribute("value"),
				"","恢复客户端升级天数验证错误");
		Assert.assertEquals(keepLogPage.getUpdateRecord().getAttribute("value"),
				"","恢复客户端升级记录验证错误");
		Assert.assertEquals(keepLogPage.getInstallDay().getAttribute("value"),
				"","恢复客户端安装天数验证错误");
		Assert.assertEquals(keepLogPage.getInstallRecord().getAttribute("value"),
				"","恢复客户端安装记录验证错误");
		Assert.assertEquals(keepLogPage.getEventDay().getAttribute("value"),
				"","恢复查杀事件天数验证错误");
		Assert.assertEquals(keepLogPage.getEventRecord().getAttribute("value"),
				"","恢复查杀事件记录验证错误");
		Assert.assertEquals(keepLogPage.getNoteDay().getAttribute("value"),
				"","恢复查杀记录天数验证错误");
		Assert.assertEquals(keepLogPage.getNoteRecord().getAttribute("value"),
				"","恢复查杀记录验证错误");
		Assert.assertEquals(keepLogPage.getTrackDay().getAttribute("value"),
				"","恢复病毒跟踪天数验证错误");
		Assert.assertEquals(keepLogPage.getTrackRecord().getAttribute("value"),
				"","恢复病毒跟踪记录验证错误");
		Assert.assertEquals(keepLogPage.getSystemDay().getAttribute("value"),
				"","恢复系统加固天数验证错误");
		Assert.assertEquals(keepLogPage.getSystemRecord().getAttribute("value"),
				"","恢复系统加固记录验证错误");
		Assert.assertEquals(keepLogPage.getAppDay().getAttribute("value"),
				"","恢复应用加固天数验证错误");
		Assert.assertEquals(keepLogPage.getAppRecord().getAttribute("value"),
				"","恢复应用加固记录验证错误");
	}
}
