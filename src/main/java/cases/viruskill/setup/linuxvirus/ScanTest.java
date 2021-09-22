package cases.viruskill.setup.linuxvirus;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.linuxvirus.LinuxVirusPage;
import util.SeleniumTestCase;

public class ScanTest extends SeleniumTestCase {

	LinuxVirusPage linuxVirusPage;

	@Test(description = "定时扫描")
	public void scan(){

		linuxVirusPage = new LinuxVirusPage(driver);
		String time = param.getString("time");
		linuxVirusPage.scanUtil(time);

		Assert.assertTrue(linuxVirusPage.getStartScan().isSelected(),
				"启动定时扫描验证错误");
		Assert.assertTrue(linuxVirusPage.getSun().findElement(By.xpath("./input")).isSelected(),
				"周日点击验证错误");
		Assert.assertTrue(linuxVirusPage.getMon().findElement(By.xpath("./input")).isSelected(),
				"周一点击验证错误");
		Assert.assertTrue(linuxVirusPage.getTues().findElement(By.xpath("./input")).isSelected(),
				"周二点击验证错误");
		Assert.assertTrue(linuxVirusPage.getWed().findElement(By.xpath("./input")).isSelected(),
				"周三点击验证错误");
		Assert.assertTrue(linuxVirusPage.getThur().findElement(By.xpath("./input")).isSelected(),
				"周四点击验证错误");
		Assert.assertTrue(linuxVirusPage.getFri().findElement(By.xpath("./input")).isSelected(),
				"周五点击验证错误");
		Assert.assertTrue(linuxVirusPage.getSat().findElement(By.xpath("./input")).isSelected(),
				"周六点击验证错误");
		Assert.assertEquals(linuxVirusPage.getScanTime().getAttribute("value"),
				time,"开始时间验证错误");

	}
}
