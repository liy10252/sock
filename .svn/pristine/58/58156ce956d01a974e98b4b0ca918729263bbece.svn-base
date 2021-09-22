package cases.viruskill.setup.filemonitor;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.filemonitor.FileMonitorPage;
import util.SeleniumTestCase;

public class FileTypeTest extends SeleniumTestCase {

	FileMonitorPage fileMonitorPage;

	@Test(description = "文件类型设置一")
	public void fileTypeOne(){

		fileMonitorPage = new FileMonitorPage(driver);
		fileMonitorPage.fileTypeOne(driver);

		Assert.assertTrue(fileMonitorPage.getAll().isSelected(),"文件类型所有验证错误");
		Assert.assertFalse(fileMonitorPage.getTrust().isSelected(),"监控加速验证错误");
		Assert.assertTrue(fileMonitorPage.getDriveCache().isSelected(),"驱动缓存验证错误");
		Assert.assertFalse(fileMonitorPage.getEmbedded().isSelected(),"嵌入查杀验证错误");
		Assert.assertTrue(fileMonitorPage.getFileServer().isSelected(),"共享文档验证错误");
	}

	@Test(dependsOnMethods = "fileTypeOne",description = "文件类型设置二")
	public void fileTypeTwo(){

		String type = param.getString("type");
		fileMonitorPage.fileTypeTwo(type);

		Assert.assertTrue(fileMonitorPage.getCustomFileType().isSelected(),"文件类型自定义验证错误");
		Assert.assertEquals(fileMonitorPage.getCustomFileTypeInput().
				getAttribute("value"),type,"文件类型自定义输入验证错误");
	}
}
