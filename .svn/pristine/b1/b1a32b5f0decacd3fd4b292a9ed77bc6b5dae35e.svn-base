package cases.terminal.log;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.log.LogPage;
import util.SeleniumTestCase;

public class SearchTest extends SeleniumTestCase {

	LogPage logPage;

	@Test(description = "终端名称搜索")
	public void searchByName(){

		logPage = new LogPage(driver);
		logPage.getCustomSearch().click();
		String name = param.getString("name");
		logPage.search(logPage.getClientName(),name);
		Assert.assertEquals(logPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),name,"终端名称搜索验证错误");

	}

	@Test(dependsOnMethods = "searchByName",description = "终端ip地址搜索")
	public void searchByIp(){

		String ip = param.getString("ip");
		logPage.search(logPage.getIpaddr(),ip);
		Assert.assertEquals(logPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),ip,"终端ip地址搜索验证错误");

	}

	@Test(dependsOnMethods = "searchByName",description = "终端新版本搜索")
	public void searchByNewVersion(){

		String newVersion = param.getString("newVersion");
		logPage.search(logPage.getNewVersion(),newVersion);
		Assert.assertEquals(logPage.getWebDataTr().findElement(By.xpath("./td[7]"))
				.getText().trim(),newVersion,"终端新版本搜索验证错误");

	}
}
