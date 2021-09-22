package cases.viruskill.setup.linuxvirus;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.linuxvirus.LinuxVirusPage;
import util.SeleniumTestCase;

public class OptimizeTest extends SeleniumTestCase {

	LinuxVirusPage linuxVirusPage;

	@Test(description = "扫描优化")
	public void optimize(){

		linuxVirusPage = new LinuxVirusPage(driver);
		String day = param.getString("day");
		String size = param.getString("size");
		String path = param.getString("path");
		String ignorePath = param.getString("ignorePath");
		linuxVirusPage.optimizeUtil(day,size,path,ignorePath);

		Assert.assertTrue(linuxVirusPage.getKeepDayAble().isSelected(),
				"仅扫描验证错误");
		Assert.assertEquals(linuxVirusPage.getKeepDay().getAttribute("value"),
				day,"仅扫描天数验证错误");
		Assert.assertTrue(linuxVirusPage.getCompsAble().isSelected(),
				"压缩包文件验证错误");
		Assert.assertEquals(linuxVirusPage.getCompress().getAttribute("value"),
				size,"压缩包大小验证错误");
		Assert.assertEquals(linuxVirusPage.getScanPath().getAttribute("value"),
				path,"扫描路径验证错误");
		Assert.assertTrue(linuxVirusPage.getIgnPath().isSelected(),
				"忽略以下路径验证错误");
		Assert.assertEquals(linuxVirusPage.getWebIgnTr().findElement(By.xpath("./td[1]")).getText(),
				ignorePath,"添加忽略路径验证错误");
	}
}
