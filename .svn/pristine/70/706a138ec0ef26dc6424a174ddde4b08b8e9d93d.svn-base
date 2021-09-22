package cases.viruskill.setup.ftpmonitor;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.ftpmonitor.FtpMonitorPage;
import util.SeleniumTestCase;

public class SetupTest extends SeleniumTestCase {

	FtpMonitorPage ftpMonitorPage;

	@Test(description = "ftp监控设置一")
	public void setupOne(){

		ftpMonitorPage = new FtpMonitorPage(driver);
		String customSizeStr = param.getString("customSizeStr");
		String fileSizeStr = param.getString("fileSizeStr");
		String ipStr = param.getString("ipStr");
		String portStr = param.getString("portStr");
		ftpMonitorPage.setUpOne(customSizeStr,fileSizeStr,ipStr,portStr);

		Assert.assertFalse(ftpMonitorPage.getRunDisable().isSelected(),"开机启用验证错误");
		Assert.assertEquals(ftpMonitorPage.getCustomSize().getAttribute("value"),
				customSizeStr,"自定义大小验证错误");
		Assert.assertEquals(ftpMonitorPage.getFileSize().getAttribute("value"),
				fileSizeStr,"文件大小验证错误");
		Assert.assertEquals(ftpMonitorPage.getWebTr().findElement(By.xpath("./td[1]")).getText(),
				ipStr+":"+portStr,"监控列表验证错误");
	}

	@Test(dependsOnMethods = "setupOne",description = "ftp监控设置二")
	public void setupTwo(){

		ftpMonitorPage.setUpTwo();

		Assert.assertTrue(ftpMonitorPage.getAllCache().isSelected(),"缓存类型验证错误");
		Assert.assertTrue(ftpMonitorPage.getWebTable().getText().isEmpty(),"监控列表删除验证错误");
	}

	@Test(dependsOnMethods = "setupOne",description = "ftp监控设置三")
	public void setupThree(){

		ftpMonitorPage.setUpThree();

		Assert.assertTrue(ftpMonitorPage.getNoCache().isSelected(),"缓存类型验证错误");
	}
}
