package cases.firewall.overview;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.overview.OverViewPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class UrlTest extends SeleniumTestCase {

	OverViewPage overViewPage;

	@Test(description = "已开启")
	public void open(){

		overViewPage = new OverViewPage(driver);
		overViewPage.getCustomSearch().click();
		overViewPage.singleClick(overViewPage.getUrlAll(),overViewPage.getUrlOpen());
		Assert.assertEquals(overViewPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("open"),"已开启验证失败");
		Assert.assertTrue(overViewPage.getWebDataTr().findElement(By.xpath("./td[4]"))
				.getText().trim().equals(expect.getString("openState")),"已开启验证失败");


	}

	@Test(dependsOnMethods = "open",description = "已关闭")
	public void close(){

		overViewPage.singleClick(overViewPage.getUrlAll(),overViewPage.getUrlClose(),4);

		Assert.assertTrue(TestUtil.getValueList(overViewPage.getClientNames())
						.containsAll(TestUtil.JsonToList(expect.getJSONArray("close"),"name")),
				"已关闭验证失败");
		Assert.assertTrue(overViewPage.checkItems(overViewPage.getWebUrls(),
				expect.getString("closeState")),"已关闭验证失败");
	}
}