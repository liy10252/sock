package cases.firewall.log.network;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.network.NetWorkPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class NetWorkTest extends SeleniumTestCase {

	NetWorkPage netWorkPage;

	@Test(description = "允许")
	public void allow(){

		netWorkPage = new NetWorkPage(driver);
		netWorkPage.getCustomSearch().click();
		netWorkPage.singleClick(netWorkPage.getNetWorkAll(),netWorkPage.getAllow(),2);

		Assert.assertTrue(TestUtil.getValueList(netWorkPage.getClientNames())
						.containsAll(TestUtil.JsonToList(expect.getJSONArray("allow"),"name")),
				"允许验证失败");
		Assert.assertTrue(netWorkPage.checkItems(netWorkPage.getWebNetWorks(),
				expect.getString("allowState")),"允许验证失败");
	}

	@Test(dependsOnMethods = "allow",description = "拒绝")
	public void refuse(){

		netWorkPage.singleClick(netWorkPage.getNetWorkAll(),netWorkPage.getRefuse());

		Assert.assertEquals(netWorkPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("refuse"),"拒绝验证失败");
		Assert.assertTrue(netWorkPage.getWebDataTr().findElement(By.xpath("./td[8]"))
				.getText().trim().equals(expect.getString("refuseState")),"拒绝验证失败");

	}
}