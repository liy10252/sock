package cases.firewall.log.advert;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.advert.AdvertPage;
import util.SeleniumTestCase;

public class SearchTest extends SeleniumTestCase {

	AdvertPage advertPage;

	@Test(description = "网址搜索")
	public void searchByWebSite(){

		advertPage = new AdvertPage(driver);
		advertPage.getCustomSearch().click();
		String webSite = param.getString("webSite");
		advertPage.search(advertPage.getWebSite(),webSite);
		Assert.assertEquals(advertPage.getWebDataTr().findElement(By.xpath("./td[4]"))
				.getText().trim(),webSite,"网址搜索验证错误");
	}
}

