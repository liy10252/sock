package cases.firewall.safeshare;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.safeshare.SafeSharePage;
import util.SeleniumTestCase;

public class SearchTest extends SeleniumTestCase {

	SafeSharePage safeSharePage;

	@Test(description = "共享名称")
	public void searchByName(){

		safeSharePage = new SafeSharePage(driver);
		safeSharePage.getCustomSearch().click();
		String name = param.getString("name");
		safeSharePage.search(safeSharePage.getShareName(),name);
		safeSharePage.getDetailButton().click();
		Assert.assertEquals(safeSharePage.getWebDetailTr().findElement(By.xpath("./td[2]/span"))
				.getText().trim(),name,"共享名称验证错误");
	}

	@Test(dependsOnMethods = "searchByName",description = "物理路径")
	public void searchByPath(){

		String path = param.getString("path");
		safeSharePage.search(safeSharePage.getPath(),path);
		safeSharePage.getDetailButton().click();
		Assert.assertEquals(safeSharePage.getWebDetailTr().findElement(By.xpath("./td[3]"))
				.getText().trim(),path,"物理路径验证错误");
	}
}
