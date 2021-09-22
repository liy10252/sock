package cases.viruskill.setup.mailmonitor;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.mailmonitor.MailMonitorPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	MailMonitorPage mailMonitorPage;

	@Test(description = "恢复默认")
	public void renew(){

		mailMonitorPage = new MailMonitorPage(driver);
		mailMonitorPage.renew();

		Assert.assertFalse(mailMonitorPage.getLockclose().isSelected(),"恢复锁定终端验证错误");
		Assert.assertTrue(mailMonitorPage.getRunDisable().isSelected(),"恢复邮件监控验证错误");
		Assert.assertTrue(mailMonitorPage.getFileAll().isSelected(),"恢复文件类型验证错误");
		Assert.assertFalse(mailMonitorPage.getHeuristics().isSelected(),"恢复启发式扫描验证错误");
		Assert.assertFalse(mailMonitorPage.getPopVirus().isSelected(),"恢复扫描流行病毒验证错误");
		Assert.assertTrue(mailMonitorPage.getScanZip().isSelected(),"恢复查杀引擎验证错误");
		Assert.assertEquals(mailMonitorPage.getFileSize().getAttribute("value"),
				expect.getString("size"),"恢复压缩包大小验证错误");
		Assert.assertEquals(mailMonitorPage.getFileDepth().getAttribute("value"),
				expect.getString("depth"),"恢复压缩包层数验证错误");
		Assert.assertTrue(mailMonitorPage.getAutoHandle().isSelected(),"恢复发现病毒验证错误");
		Assert.assertTrue(mailMonitorPage.getDelete().isSelected(),"恢复清除失败验证错误");
		Assert.assertTrue(mailMonitorPage.getVirusPrompt().isSelected(),"恢复扫描结果验证错误");
//		Assert.assertTrue(mailMonitorPage.getOpenCloud().isSelected(),"恢复云扫描验证错误");
	}
}
