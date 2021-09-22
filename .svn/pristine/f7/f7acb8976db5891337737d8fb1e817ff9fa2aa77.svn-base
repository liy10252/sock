package cases.firewall.log.hacker;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.hacker.HackerPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class StateTest extends SeleniumTestCase {

	HackerPage hackerPage;

	@Test(description = "放行")
	public void pass(){

		hackerPage = new HackerPage(driver);
		hackerPage.getCustomSearch().click();
		hackerPage.singleClick(hackerPage.getStateAll(),hackerPage.getPass(),2);

		Assert.assertTrue(TestUtil.getValueList(hackerPage.getClientNames())
						.containsAll(TestUtil.JsonToList(expect.getJSONArray("pass"),"name")),
				"放行验证失败");
		Assert.assertTrue(hackerPage.checkItems(hackerPage.getWebStates(),
				expect.getString("passState")),"放行验证失败");
	}

	@Test(dependsOnMethods = "pass",description = "阻止")
	public void prevent(){

		hackerPage.singleClick(hackerPage.getStateAll(),hackerPage.getPrevent());

		Assert.assertEquals(hackerPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("prevent"),"阻止验证失败");
		Assert.assertTrue(hackerPage.getWebDataTr().findElement(By.xpath("./td[6]"))
				.getText().trim().equals(expect.getString("preventState")),"阻止验证失败");

	}
}
