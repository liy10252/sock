package cases.viruskill.setup.virusscan;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.virusscan.VirusScanPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	VirusScanPage virusScanPage;

	@Test(description = "恢复默认")
	public void renew(){

		virusScanPage = new VirusScanPage(driver);
		virusScanPage.renew();

		Assert.assertTrue(virusScanPage.getAllFile().isSelected(),"恢复文件类型验证错误");
		Assert.assertTrue(virusScanPage.getScanZip().isSelected(),"恢复查杀引擎验证错误");
//		Assert.assertTrue(virusScanPage.getCloudScan().isSelected(),"恢复云扫描引擎验证错误");
		Assert.assertTrue(virusScanPage.getAutoHandle().isSelected(),"恢复发现病毒验证错误");
		Assert.assertTrue(virusScanPage.getDelete().isSelected(),"恢复清除失败验证错误");
		Assert.assertTrue(virusScanPage.getNoLock().isSelected(),"恢复锁定管理员扫描任务验证错误");
		Assert.assertEquals(virusScanPage.getFileTypeInput().getAttribute("value"),
				"","恢复自定义文件类型验证错误");
		Assert.assertEquals(virusScanPage.getFileSize().getAttribute("value"),
				expect.getString("fileSize"),"恢复压缩包扫描验证错误");
		Assert.assertEquals(virusScanPage.getFiledepth().getAttribute("value"),
				expect.getString("filedepth"),"恢复压缩包扫描验证错误");
	}
}
