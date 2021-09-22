package cases.viruskill.setup.sharemonitor;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.sharemonitor.ShareMonitorPage;
import util.SeleniumTestCase;

public class SetupTest extends SeleniumTestCase {

	ShareMonitorPage shareMonitorPage;

	@Test(description = "共享监控设置一")
	public void setupOne(){

		shareMonitorPage = new ShareMonitorPage(driver);
		String size = param.getString("size");
		String depth = param.getString("depth");
		shareMonitorPage.setupOne(size,depth);

		Assert.assertFalse(shareMonitorPage.getRunDisable().isSelected(),"开机启用验证错误");
		Assert.assertTrue(shareMonitorPage.getProgramFile().isSelected(),"文件类型验证错误");
		Assert.assertTrue(shareMonitorPage.getPopVirus().isSelected(),"查杀引擎验证错误");
		Assert.assertFalse(shareMonitorPage.getHeuristics().isSelected(),"查杀引擎验证错误");
		Assert.assertEquals(shareMonitorPage.getFileSize().getAttribute("value"),
				size,"查杀引擎验证错误");
		Assert.assertEquals(shareMonitorPage.getFileDepth().getAttribute("value"),
				depth,"查杀引擎验证错误");
		Assert.assertTrue(shareMonitorPage.getManualHandle().isSelected(),"发现病毒验证错误");
		Assert.assertTrue(shareMonitorPage.getNoHandleClean().isSelected(),"清除失败验证错误");
		Assert.assertTrue(shareMonitorPage.getNoPrompt().isSelected(),"扫描结果验证错误");
	}

	@Test(dependsOnMethods = "setupOne",description = "共享监控设置二")
	public void setupTwo(){

		String fileType = param.getString("fileType");
		shareMonitorPage.setupTwo(fileType);

		Assert.assertTrue(shareMonitorPage.getCustomFileBtn().isSelected(),"文件类型验证错误");
		Assert.assertEquals(shareMonitorPage.getCustomFile().getAttribute("value"),
				fileType,"文件类型验证错误");
		Assert.assertTrue(shareMonitorPage.getNoHandleVirus().isSelected(),"发现病毒验证错误");
		Assert.assertTrue(shareMonitorPage.getResult().isSelected(),"扫描结果验证错误");
	}

	@Test(dependsOnMethods = "setupOne",description = "共享监控设置三")
	public void setupThree(){

		shareMonitorPage.setupThree(driver);

		Assert.assertTrue(shareMonitorPage.getSuccess().isSelected(),"扫描结果验证错误");
//		Assert.assertFalse(shareMonitorPage.getOpenCloud().isSelected(),"云扫描引擎验证错误");
	}
}
