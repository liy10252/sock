package cases.firewall.log.share;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.share.SharePage;
import util.SeleniumTestCase;

public class SearchTest extends SeleniumTestCase {

	SharePage sharePage;

	@Test(description = "共享文件筛选")
	public void searchByShareFile(){

		sharePage = new SharePage(driver);
		sharePage.getCustomSearch().click();
		String shareFile = param.getString("shareFile");
		sharePage.search(sharePage.getShareFile(),shareFile);
		Assert.assertEquals(sharePage.getWebDataTr().findElement(By.xpath("./td[6]"))
				.getText().trim(),shareFile,"共享文件筛选验证错误");
	}
}
