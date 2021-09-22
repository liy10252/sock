package cases.viruskill.overview;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.overview.OverViewPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class FileMonitorTest extends SeleniumTestCase {

	OverViewPage overViewPage;

	@Test(description = "已开启")
	public void open(){

		overViewPage = new OverViewPage(driver);
		overViewPage.getCustomSearch().click();
		overViewPage.singleClick(overViewPage.getFileAll(),overViewPage.getFileOpen(),8);
		Assert.assertTrue(TestUtil.getValueList(overViewPage.getClientNames())
						.containsAll(TestUtil.JsonToList(expect.getJSONArray("open"),"name")),
				"已开启验证失败");
		Assert.assertTrue(overViewPage.checkItems(overViewPage.getWebFiles(),
				expect.getString("openState")),"已开启验证失败");
	}

	@Test(dependsOnMethods = "open",description = "已关闭")
	public void close(){

		overViewPage.singleClick(overViewPage.getFileAll(),overViewPage.getFileClose());
		Assert.assertEquals(overViewPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("close"),"已关闭验证失败");
		Assert.assertTrue(overViewPage.getWebDataTr().findElement(By.xpath("./td[5]"))
				.getText().trim().equals(expect.getString("closeState")),"已关闭验证失败");
	}
}
