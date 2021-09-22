package cases.viruskill.setup.sharemonitor;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.sharemonitor.ShareMonitorPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	ShareMonitorPage shareMonitorPage;

	@Test(description = "恢复默认")
	public void renew(){

		shareMonitorPage = new ShareMonitorPage(driver);
		shareMonitorPage.renew();

		Assert.assertTrue(shareMonitorPage.getRunDisable().isSelected(),"恢复开机启用验证错误");
		Assert.assertTrue(shareMonitorPage.getFileAll().isSelected(),"恢复文件类型验证错误");
		Assert.assertFalse(shareMonitorPage.getPopVirus().isSelected(),"恢复查杀引擎验证错误");
		Assert.assertTrue(shareMonitorPage.getHeuristics().isSelected(),"恢复查杀引擎验证错误");
		Assert.assertTrue(shareMonitorPage.getScanZip().isSelected(),"恢复查杀引擎验证错误");
		Assert.assertEquals(shareMonitorPage.getFileSize().getAttribute("value"),
				expect.getString("size"),"恢复查杀引擎验证错误");
		Assert.assertEquals(shareMonitorPage.getFileDepth().getAttribute("value"),
				expect.getString("depth"),"恢复查杀引擎验证错误");
		Assert.assertTrue(shareMonitorPage.getAutoHandle().isSelected(),"恢复发现病毒验证错误");
		Assert.assertTrue(shareMonitorPage.getDelete().isSelected(),"恢复清除失败验证错误");
		Assert.assertTrue(shareMonitorPage.getPrompt().isSelected(),"恢复扫描结果验证错误");
//		Assert.assertTrue(shareMonitorPage.getOpenCloud().isSelected(),"恢复云扫描引擎验证错误");
	}
}
