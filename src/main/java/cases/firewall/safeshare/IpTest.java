package cases.firewall.safeshare;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.safeshare.SafeSharePage;
import util.SeleniumTestCase;

public class IpTest extends SeleniumTestCase {

	SafeSharePage safeSharePage;

	@Test(description = "ip地址搜索")
	public void searchByIp(){

		safeSharePage = new SafeSharePage(driver);
		safeSharePage.getCustomSearch().click();
		String ip = param.getString("ip");
		safeSharePage.simpleSearch(safeSharePage.getIp(),ip);
		Assert.assertTrue(safeSharePage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim().contains(expect.getString("name")),"ip地址搜索验证错误");
	}

}
