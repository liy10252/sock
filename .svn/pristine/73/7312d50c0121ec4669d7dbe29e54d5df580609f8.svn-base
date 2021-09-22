package cases.viruskill.log.scanevent;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.log.scanevent.ScanEventPage;
import util.SeleniumTestCase;

public class SearchTest extends SeleniumTestCase {

	ScanEventPage scanEventPage;

	@Test(description = "终端名称搜索")
	public void searchByName(){

		scanEventPage = new ScanEventPage(driver);
		scanEventPage.getCustomSearch().click();
		String name = param.getString("name");
		scanEventPage.search(scanEventPage.getClientName(),name);
		Assert.assertEquals(scanEventPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),name,"终端名称搜索验证错误");
	}

	@Test(dependsOnMethods = "searchByName",description = "ip地址搜索")
	public void searchByIp(){

		String ip = param.getString("ip");
		scanEventPage.search(scanEventPage.getIpaddr(),ip);
		Assert.assertEquals(scanEventPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),ip,"ip地址搜索验证错误");
	}
}
