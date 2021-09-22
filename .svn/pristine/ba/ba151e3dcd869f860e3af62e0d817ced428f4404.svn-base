package cases.firewall.log.network;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.network.NetWorkPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class TypeTest extends SeleniumTestCase {

	NetWorkPage netWorkPage;

	@Test(description = "监听")
	public void monitor(){

		netWorkPage = new NetWorkPage(driver);
		netWorkPage.getCustomSearch().click();
		netWorkPage.singleClick(netWorkPage.getTypeAll(),netWorkPage.getMonitor(),2);

		Assert.assertTrue(TestUtil.getValueList(netWorkPage.getClientNames())
						.containsAll(TestUtil.JsonToList(expect.getJSONArray("monitor"),"name")),
				"监听验证失败");
		Assert.assertTrue(netWorkPage.checkItems(netWorkPage.getWebTypes(),
				expect.getString("monitorState")),"监听验证失败");
	}

	@Test(dependsOnMethods = "monitor",description = "连接")
	public void connect(){

		netWorkPage.singleClick(netWorkPage.getTypeAll(),netWorkPage.getConnect());

		Assert.assertEquals(netWorkPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("connect"),"连接验证失败");
		Assert.assertTrue(netWorkPage.getWebDataTr().findElement(By.xpath("./td[7]"))
				.getText().trim().equals(expect.getString("connectState")),"连接验证失败");

	}
}