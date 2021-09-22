package cases.terminal.setup.keeplog;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.setup.keeplog.KeepLogPage;
import util.SeleniumTestCase;

public class InputTest extends SeleniumTestCase {

	KeepLogPage keepLogPage;

	@Test(description = "输入框设置")
	public void input(){

		keepLogPage = new KeepLogPage(driver);
		String day = param.getString("day");
		String record = param.getString("record");
		keepLogPage.inputUtil(day,record);

		Assert.assertEquals(keepLogPage.getUpdateDay().getAttribute("value"),
				day,"客户端升级天数验证错误");
		Assert.assertEquals(keepLogPage.getUpdateRecord().getAttribute("value"),
				record,"客户端升级记录验证错误");
		Assert.assertEquals(keepLogPage.getInstallDay().getAttribute("value"),
				day,"客户端安装天数验证错误");
		Assert.assertEquals(keepLogPage.getInstallRecord().getAttribute("value"),
				record,"客户端安装记录验证错误");
		Assert.assertEquals(keepLogPage.getEventDay().getAttribute("value"),
				day,"查杀事件天数验证错误");
		Assert.assertEquals(keepLogPage.getEventRecord().getAttribute("value"),
				record,"查杀事件记录验证错误");
		Assert.assertEquals(keepLogPage.getNoteDay().getAttribute("value"),
				day,"查杀记录天数验证错误");
		Assert.assertEquals(keepLogPage.getNoteRecord().getAttribute("value"),
				record,"查杀记录验证错误");
		Assert.assertEquals(keepLogPage.getTrackDay().getAttribute("value"),
				day,"病毒跟踪天数验证错误");
		Assert.assertEquals(keepLogPage.getTrackRecord().getAttribute("value"),
				record,"病毒跟踪记录验证错误");
		Assert.assertEquals(keepLogPage.getSystemDay().getAttribute("value"),
				day,"系统加固天数验证错误");
		Assert.assertEquals(keepLogPage.getSystemRecord().getAttribute("value"),
				record,"系统加固记录验证错误");
		Assert.assertEquals(keepLogPage.getAppDay().getAttribute("value"),
				day,"应用加固天数验证错误");
		Assert.assertEquals(keepLogPage.getAppRecord().getAttribute("value"),
				record,"应用加固记录验证错误");

	}
}
