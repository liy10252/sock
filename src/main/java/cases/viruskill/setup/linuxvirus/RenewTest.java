package cases.viruskill.setup.linuxvirus;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.linuxvirus.LinuxVirusPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	LinuxVirusPage linuxVirusPage;

	@Test(description = "恢复默认")
	public void renew(){

		linuxVirusPage = new LinuxVirusPage(driver);
		linuxVirusPage.renew();

		Assert.assertFalse(linuxVirusPage.getKeepDayAble().isSelected(),
				"恢复仅扫描验证错误");
		Assert.assertTrue(linuxVirusPage.getKeepDay().getAttribute("value").isEmpty(),
				"恢复仅扫描天数验证错误");
		Assert.assertFalse(linuxVirusPage.getCompsAble().isSelected(),
				"恢复压缩包验证错误");
		Assert.assertTrue(linuxVirusPage.getCompress().getAttribute("value").isEmpty(),
				"恢复压缩包大小验证错误");
		Assert.assertEquals(linuxVirusPage.getScanPath().getAttribute("value"),
				expect.getString("path"),"恢复扫描路径验证错误");
		Assert.assertFalse(linuxVirusPage.getIgnPath().isSelected(),
				"恢复忽略以下路径验证错误");
		Assert.assertTrue(linuxVirusPage.getWebTable().getText().isEmpty(),
				"恢复忽略路径验证错误");
		Assert.assertFalse(linuxVirusPage.getStartScan().isSelected(),
				"恢复启动定时扫描验证错误");
		Assert.assertFalse(linuxVirusPage.getSun().findElement(By.xpath("./input")).isSelected(),
				"恢复周日验证错误");
		Assert.assertFalse(linuxVirusPage.getMon().findElement(By.xpath("./input")).isSelected(),
				"恢复周一验证错误");
		Assert.assertFalse(linuxVirusPage.getTues().findElement(By.xpath("./input")).isSelected(),
				"恢复周二验证错误");
		Assert.assertFalse(linuxVirusPage.getWed().findElement(By.xpath("./input")).isSelected(),
				"恢复周三验证错误");
		Assert.assertFalse(linuxVirusPage.getThur().findElement(By.xpath("./input")).isSelected(),
				"恢复周四验证错误");
		Assert.assertFalse(linuxVirusPage.getFri().findElement(By.xpath("./input")).isSelected(),
				"恢复周五验证错误");
		Assert.assertFalse(linuxVirusPage.getSat().findElement(By.xpath("./input")).isSelected(),
				"恢复周六验证错误");
		Assert.assertTrue(linuxVirusPage.getScanTime().getAttribute("value").isEmpty(),
				"恢复开始时间验证错误");
		Assert.assertTrue(linuxVirusPage.getVirusCleanFind().isSelected(),
				"恢复发现病毒验证错误");
		Assert.assertTrue(linuxVirusPage.getPoisonFile().isSelected(),
				"恢复清除失败验证错误");
		Assert.assertTrue(linuxVirusPage.getVirusCleanDivide().isSelected(),
				"恢复隔离失败验证错误");

	}
}
