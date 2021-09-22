package cases.viruskill.setup.timingscan;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.timingscan.TimingScanPage;
import util.SeleniumTestCase;

public class FastScanTest extends SeleniumTestCase {

	TimingScanPage timingScanPage;

	@Test(description = "快速扫描设置一")
	public void fastScanOne(){

		timingScanPage = new TimingScanPage(driver);
		String dayTime = param.getString("dayTime");
		String type = param.getString("type");
		timingScanPage.fastScanUtilOne(driver,dayTime,type);

		Assert.assertTrue(timingScanPage.getTypeFile().isSelected(),"扫描类型文件验证错误");
		Assert.assertEquals(timingScanPage.getTypeFileInput().getAttribute("value"),
				type,"扫描类型文件输入验证错误");
		Assert.assertTrue(timingScanPage.getFastScan().isSelected(),"快速扫描点击验证错误");
		Assert.assertEquals(timingScanPage.getEveryDayInputFast().getAttribute("value"),
				dayTime,"每天时间输入验证错误");
	}

	@Test(dependsOnMethods = "fastScanOne",description = "快速扫描设置二")
	public void fastScanTwo(){

		timingScanPage.fastScanUtilTwo();
		Assert.assertTrue(timingScanPage.getBootUpFast().isSelected(),"快速扫描开机验证错误");
	}

	@Test(dependsOnMethods = "fastScanOne",description = "快速扫描设置三")
	public void fastScanThree(){

		String weekTime = param.getString("weekTime");
		timingScanPage.fastScanUtilThree(weekTime);

		Assert.assertTrue(timingScanPage.getEveryWeekFast().isSelected(),"快速扫描每周点击验证错误");
		Assert.assertTrue(timingScanPage.getMonFast().findElement(By.xpath("./input")).isSelected(),"周一验证错误");
		Assert.assertTrue(timingScanPage.getTuesFast().findElement(By.xpath("./input")).isSelected(),"周二验证错误");
		Assert.assertTrue(timingScanPage.getWedFast().findElement(By.xpath("./input")).isSelected(),"周三验证错误");
		Assert.assertTrue(timingScanPage.getThurFast().findElement(By.xpath("./input")).isSelected(),"周四验证错误");
		Assert.assertTrue(timingScanPage.getFriFast().findElement(By.xpath("./input")).isSelected(),"周五验证错误");
		Assert.assertTrue(timingScanPage.getSatFast().findElement(By.xpath("./input")).isSelected(),"周六验证错误");
		Assert.assertTrue(timingScanPage.getSunFast().findElement(By.xpath("./input")).isSelected(),"周日验证错误");
		Assert.assertEquals(timingScanPage.getEveryWeekInputFast().getAttribute("value"),
				weekTime,"每周输入验证错误");
	}

	@Test(dependsOnMethods = "fastScanOne",description = "每月设置")
	public void fastScanFour(){

		String monTime = param.getString("monTime");
		timingScanPage.fastMonSet(monTime);

		Assert.assertEquals(timingScanPage.getMonButtonFast().getText(),expect.getString("mon"),"每月设置错误");
		Assert.assertEquals(timingScanPage.getMonInputFast().getAttribute("value"),monTime,"每月时间设置错误");
	}

	@Test(dependsOnMethods = "fastScanOne",description = "持续时间设置")
	public void fastScanFive(){

		String conTime = param.getString("conTime");
		timingScanPage.fastConSet(conTime);

		Assert.assertTrue(timingScanPage.getConButtonFast().isSelected(),"持续时间设置错误");
		Assert.assertEquals(timingScanPage.getConInputFast().getAttribute("value"),conTime,"持续时间设置错误");
	}
}
