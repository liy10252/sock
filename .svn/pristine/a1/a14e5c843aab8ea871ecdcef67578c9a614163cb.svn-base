package cases.viruskill.setup.ftpmonitor;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.ftpmonitor.FtpMonitorPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	FtpMonitorPage ftpMonitorPage;

	@Test(description = "恢复默认")
	public void renew(){

		ftpMonitorPage = new FtpMonitorPage(driver);
		ftpMonitorPage.renew();

		Assert.assertTrue(ftpMonitorPage.getRunDisable().isSelected(),"恢复开机启用验证错误");
		Assert.assertTrue(ftpMonitorPage.getCustomSize().getAttribute("value").isEmpty(),
				"恢复缓存类型验证错误");
		Assert.assertTrue(ftpMonitorPage.getFileSize().getAttribute("value").isEmpty(),
				"恢复文件大小验证错误");
	}
}
