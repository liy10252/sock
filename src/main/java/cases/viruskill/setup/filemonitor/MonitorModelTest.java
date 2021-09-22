package cases.viruskill.setup.filemonitor;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.filemonitor.FileMonitorPage;
import util.SeleniumTestCase;

public class MonitorModelTest extends SeleniumTestCase {

	FileMonitorPage fileMonitorPage;

	@Test(description = "监控模式设置一")
	public void modelOne(){

		fileMonitorPage = new FileMonitorPage(driver);
		fileMonitorPage.monitorModelOne();

		Assert.assertTrue(fileMonitorPage.getLockClose().isSelected(),"锁定关闭监控验证错误");
		Assert.assertFalse(fileMonitorPage.getBootEnable().isSelected(),"文件监控验证错误");
		Assert.assertFalse(fileMonitorPage.getOpen().isSelected(),"智能黑名单验证错误");
		Assert.assertTrue(fileMonitorPage.getCoreMonitor().isSelected(),"监控设置验证错误");
		Assert.assertTrue(fileMonitorPage.getRapid().isSelected(),"极速验证错误");
	}

	@Test(dependsOnMethods = "modelOne",description = "监控模式设置二")
	public void modelTwo(){

		String fileType = param.getString("fileType");
		fileMonitorPage.monitorModelTwo(fileType);

		Assert.assertTrue(fileMonitorPage.getMajor().isSelected(),"专业验证错误");
		Assert.assertTrue(fileMonitorPage.getCustomFile().isSelected(),"自定义文件类型验证错误");
		Assert.assertEquals(fileMonitorPage.getCustomFileInput().getAttribute("value"),
				fileType,"自定义文件类型输入验证错误");
	}

	@Test(dependsOnMethods = "modelOne",description = "监控模式设置三")
	public void modelThree(){

		fileMonitorPage.monitorModelThree();

		Assert.assertTrue(fileMonitorPage.getEnhance().isSelected(),"增强验证错误");
	}
}
