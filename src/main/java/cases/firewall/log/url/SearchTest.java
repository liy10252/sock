package cases.firewall.log.url;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.url.UrlPage;
import util.SeleniumTestCase;

public class SearchTest extends SeleniumTestCase {

	UrlPage urlPage;

	@Test(description = "网址搜索")
	public void searchByWebSite(){

		urlPage = new UrlPage(driver);
		urlPage.getCustomSearch().click();
		String webSite = param.getString("webSite");
		urlPage.search(urlPage.getWebSite(),webSite);
		Assert.assertEquals(urlPage.getWebDataTr().findElement(By.xpath("./td[5]"))
				.getText().trim(),webSite,"网址搜索验证错误");
	}

	@Test(dependsOnMethods = "searchByWebSite",description = "终端搜索")
	public void searchByName(){

		String name = param.getString("name");
		urlPage.search(urlPage.getClientName(),name);
		Assert.assertEquals(urlPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),name,"终端搜索验证错误");
	}

	@Test(dependsOnMethods = "searchByWebSite",description = "ip搜索")
	public void searchByIp(){

		String ip = param.getString("ip");
		urlPage.search(urlPage.getIpaddr(),ip);
		Assert.assertEquals(urlPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),ip,"ip搜索验证错误");
	}
}
