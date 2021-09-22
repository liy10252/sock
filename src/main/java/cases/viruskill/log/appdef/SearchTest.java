package cases.viruskill.log.appdef;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.log.appdef.AppDefPage;
import util.SeleniumTestCase;

public class SearchTest extends SeleniumTestCase {

	AppDefPage appDefPage;

	@Test(description = "终端名称搜索")
	public void searchByName(){

		appDefPage = new AppDefPage(driver);
		appDefPage.getCustomSearch().click();
		String name = param.getString("name");
		appDefPage.search(appDefPage.getClientName(),name);
		Assert.assertEquals(appDefPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),name,"终端名称搜索验证错误");
	}

	@Test(dependsOnMethods = "searchByName",description = "ip地址搜索")
	public void searchByIp(){

		String ip = param.getString("ip");
		appDefPage.search(appDefPage.getIpaddr(),ip);
		Assert.assertEquals(appDefPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),ip,"ip地址搜索验证错误");
	}
}