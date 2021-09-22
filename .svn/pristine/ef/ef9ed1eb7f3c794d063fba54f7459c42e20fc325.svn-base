package cases.firewall.log.malice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.malice.MalicePage;
import util.SeleniumTestCase;

public class SearchTest extends SeleniumTestCase {

	MalicePage malicePage;

	@Test(description = "网址搜索")
	public void searchByWebSite(){

		malicePage = new MalicePage(driver);
		malicePage.getCustomSearch().click();
		String webSite = param.getString("webSite");
		malicePage.search(malicePage.getWebSite(),webSite);
		Assert.assertEquals(malicePage.getWebDataTr().findElement(By.xpath("./td[5]"))
				.getText().trim(),webSite,"网址搜索验证错误");
	}
}
