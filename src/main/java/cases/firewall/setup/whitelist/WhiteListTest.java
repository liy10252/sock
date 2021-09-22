package cases.firewall.setup.whitelist;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.whitelist.WhiteListPage;
import util.SeleniumTestCase;

public class WhiteListTest extends SeleniumTestCase {

	WhiteListPage whiteListPage;

	@Test(description = "添加白名单")
	public void addList(){

		whiteListPage = new WhiteListPage(driver);
		String url = param.getString("url");
		whiteListPage.addList(url);

		Assert.assertFalse(whiteListPage.getOpen().isSelected(),"启用白名单验证错误");
		Assert.assertEquals(whiteListPage.getWebTable().findElement(By.xpath(".//tr[1]/td[1]")).getText(),
				url,"添加白名单验证错误");
	}
}
