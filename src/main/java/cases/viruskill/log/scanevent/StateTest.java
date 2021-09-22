package cases.viruskill.log.scanevent;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.log.scanevent.ScanEventPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class StateTest extends SeleniumTestCase {

	ScanEventPage scanEventPage;

	@Test(description = "扫描中")
	public void scanning(){

		scanEventPage = new ScanEventPage(driver);
		scanEventPage.getCustomSearch().click();
		scanEventPage.singleClick(scanEventPage.getStateAll(),scanEventPage.getScanning());
		Assert.assertEquals(scanEventPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("scanning"),"扫描中验证失败");
		Assert.assertEquals(scanEventPage.getWebDataTr().findElement(By.xpath("./td[6]"))
				.getText().trim(),expect.getString("scanningState"),"扫描中验证失败");
	}

	@Test(dependsOnMethods = "scanning",description = "扫描完成")
	public void scanComplete(){

		scanEventPage.singleClick(scanEventPage.getStateAll(),scanEventPage.getScanComplete(),2);
		Assert.assertTrue(TestUtil.getValueList(scanEventPage.getClientNames())
				.containsAll(TestUtil.JsonToList(expect.getJSONArray("scanComplete"),"name")),"扫描完成验证失败");

		Assert.assertTrue(scanEventPage.checkItems(scanEventPage.getStates(),
				expect.getString("scanCompleteState")),"扫描完成验证失败");

	}
}
