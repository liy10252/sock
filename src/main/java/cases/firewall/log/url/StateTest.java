package cases.firewall.log.url;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.url.UrlPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class StateTest extends SeleniumTestCase {

	UrlPage urlPage;

	@Test(description = "允许")
	public void allow(){

		urlPage = new UrlPage(driver);
		urlPage.getCustomSearch().click();
		urlPage.singleClick(urlPage.getStateAll(),urlPage.getAllow(),2);

		Assert.assertTrue(TestUtil.getValueList(urlPage.getClientNames())
						.containsAll(TestUtil.JsonToList(expect.getJSONArray("allow"),"name")),
				"允许验证失败");
		Assert.assertTrue(urlPage.checkItems(urlPage.getWebStates(),
				expect.getString("allowState")),"允许验证失败");
	}

	@Test(dependsOnMethods = "allow",description = "拒绝")
	public void refuse(){

		urlPage.singleClick(urlPage.getStateAll(),urlPage.getRefuse());

		Assert.assertEquals(urlPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("refuse"),"拒绝验证失败");
		Assert.assertTrue(urlPage.getWebDataTr().findElement(By.xpath("./td[6]"))
				.getText().trim().equals(expect.getString("refuseState")),"拒绝验证失败");

	}
}