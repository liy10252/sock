package cases.viruskill.log.scanevent;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.log.scanevent.ScanEventPage;
import util.SeleniumTestCase;

public class ScanTypeTest extends SeleniumTestCase {

	ScanEventPage scanEventPage;

	@Test(description = "快速查杀")
	public void quickScan(){

		scanEventPage = new ScanEventPage(driver);
		scanEventPage.getCustomSearch().click();
		scanEventPage.singleClick(scanEventPage.getScanAll(),scanEventPage.getQuickScan());
		Assert.assertEquals(scanEventPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("quickScan"),"快速查杀验证失败");
		Assert.assertEquals(scanEventPage.getWebDataTr().findElement(By.xpath("./td[5]"))
				.getText().trim(),expect.getString("quickScanState"),"快速查杀验证失败");
	}

	@Test(dependsOnMethods = "quickScan",description = "全盘查杀")
	public void allScan(){

		scanEventPage.singleClick(scanEventPage.getScanAll(),scanEventPage.getAllScan());
		Assert.assertEquals(scanEventPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("allScan"),"全盘查杀验证失败");
		Assert.assertEquals(scanEventPage.getWebDataTr().findElement(By.xpath("./td[5]"))
				.getText().trim(),expect.getString("allScanState"),"全盘查杀验证失败");
	}

	@Test(dependsOnMethods = "quickScan",description = "自定义")
	public void customScan(){

		scanEventPage.singleClick(scanEventPage.getScanAll(),scanEventPage.getCustomScan());
		Assert.assertEquals(scanEventPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("customScan"),"自定义验证失败");
		Assert.assertEquals(scanEventPage.getWebDataTr().findElement(By.xpath("./td[5]"))
				.getText().trim(),expect.getString("customScanState"),"自定义验证失败");
	}
}
