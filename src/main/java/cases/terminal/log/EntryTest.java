package cases.terminal.log;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.log.LogPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class EntryTest extends SeleniumTestCase {

	LogPage logPage;

//	@Test(description = "病毒库日志")
//	public void virusBank(){
//
//		logPage = new LogPage(driver);
//		logPage.getCustomSearch().click();
//		logPage.singleClick(logPage.getEntryAll(),logPage.getVirusBank());
//		Assert.assertEquals(logPage.getWebDataTr().findElement(By.xpath("./td[1]"))
//				.getText().trim(),expect.getString("virusBankName"),"病毒库日志验证失败");
//		Assert.assertEquals(logPage.getWebDataTr().findElement(By.xpath("./td[5]"))
//				.getText().trim(),expect.getString("virusBankEntry"),"病毒库日志验证失败");
//	}
//
//	@Test(dependsOnMethods = "virusBank",description = "恶意网址库日志")
//	public void badWebSite(){
//
//		logPage.singleClick(logPage.getEntryAll(),logPage.getBadWebSite());
//		Assert.assertEquals(logPage.getWebDataTr().findElement(By.xpath("./td[1]"))
//				.getText().trim(),expect.getString("badWebSiteName"),"恶意网址库日志验证失败");
//		Assert.assertEquals(logPage.getWebDataTr().findElement(By.xpath("./td[5]"))
//				.getText().trim(),expect.getString("badWebSiteEntry"),"恶意网址库日志验证失败");
//	}

	@Test(description = "安全云终端日志")
	public void safeCloud(){

		logPage = new LogPage(driver);
		logPage.getCustomSearch().click();
		logPage.singleClick(logPage.getEntryAll(),logPage.getSafeCloud(),7);

		Assert.assertTrue(TestUtil.getValueList(logPage.getClientNames())
						.containsAll(TestUtil.JsonToList(expect.getJSONArray("safeCloudName"),"name")),
				"安全云终端验证失败");
		Assert.assertTrue(logPage.checkItems(logPage.getWebEntrys(),
				expect.getString("safeCloudEntry")),"安全云终端验证失败");

	}

}
