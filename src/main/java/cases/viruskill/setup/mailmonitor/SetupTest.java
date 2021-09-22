package cases.viruskill.setup.mailmonitor;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.mailmonitor.MailMonitorPage;
import util.SeleniumTestCase;

public class SetupTest extends SeleniumTestCase {

	MailMonitorPage mailMonitorPage;

	@Test(description = "邮件监控设置一")
	public void setupOne(){

		mailMonitorPage = new MailMonitorPage(driver);
		String size = param.getString("size");
		String depth = param.getString("depth");
		mailMonitorPage.setupOne(size,depth);

		Assert.assertTrue(mailMonitorPage.getLockclose().isSelected(),"锁定终端验证错误");
		Assert.assertFalse(mailMonitorPage.getRunDisable().isSelected(),"开机启用验证错误");
		Assert.assertTrue(mailMonitorPage.getProgramFile().isSelected(),"程序及文档验证错误");
		Assert.assertTrue(mailMonitorPage.getHeuristics().isSelected(),"启发式验证错误");
		Assert.assertTrue(mailMonitorPage.getPopVirus().isSelected(),"流行病毒验证错误");
		Assert.assertEquals(mailMonitorPage.getFileSize().getAttribute("value"),
				size,"压缩包大小验证错误");
		Assert.assertEquals(mailMonitorPage.getFileDepth().getAttribute("value"),
		depth,"压缩包层数验证错误");
		Assert.assertTrue(mailMonitorPage.getNoHandle().isSelected(),"发现病毒验证错误");
		Assert.assertTrue(mailMonitorPage.getNoHandleDel().isSelected(),"清除失败验证错误");
	}

	@Test(dependsOnMethods = "setupOne",description = "邮件监控设置二")
	public void setupTwo(){

		String fileType = param.getString("fileType");
		mailMonitorPage.setupTwo(fileType);

		Assert.assertTrue(mailMonitorPage.getCustomFileBtn().isSelected(),"自定义文件验证错误");
		Assert.assertEquals(mailMonitorPage.getCustomFile().getAttribute("value"),
				fileType,"自定义文件验证错误");
	}
}
