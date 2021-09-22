package cases.firewall.safeshare;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.safeshare.SafeSharePage;
import util.SeleniumTestCase;

public class EpNameTest extends SeleniumTestCase {

	SafeSharePage safeSharePage;

	@Test(description = "终端名称搜索")
	public void searchByName(){

		safeSharePage = new SafeSharePage(driver);
		safeSharePage.getCustomSearch().click();
		String name = param.getString("name");
		safeSharePage.simpleSearch(safeSharePage.getEpName(),name);
		Assert.assertTrue(safeSharePage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim().contains(name),"终端名称验证错误");
	}

}
