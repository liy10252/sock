package cases.terminal.overview;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.overview.OverviewPage;
import util.SeleniumTestCase;

public class SearchTest extends SeleniumTestCase {

	OverviewPage overviewPage;

	@Test(description = "终端名称搜索")
	public void searchByName(){

		overviewPage = new OverviewPage(driver);
		overviewPage.getCustomSearch().click();
		String name = param.getString("name");
		overviewPage.search(overviewPage.getClientName(),name);
		Assert.assertEquals(overviewPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),name,"终端名称搜索验证错误");
	}

	@Test(dependsOnMethods = "searchByName",description = "终端ip地址搜索")
	public void searchByIp(){

		String ip = param.getString("ip");
		overviewPage.search(overviewPage.getIpaddr(),ip);
		Assert.assertEquals(overviewPage.getWebDataTr().findElement(By.xpath("./td[3]"))
				.getText().trim(),ip,"终端ip地址搜索验证错误");

	}

	@Test(dependsOnMethods = "searchByName",description = "终端mac搜索")
	public void searchByMac(){

		String mac = param.getString("mac");
		overviewPage.search(overviewPage.getMac(),mac);
		Assert.assertEquals(overviewPage.getWebDataTr().findElement(By.xpath("./td[5]"))
				.getText().trim(),mac,"终端mac搜索验证错误");
	}

	@Test(dependsOnMethods = "searchByName",description = "终端版本搜索")
	public void searchByVersion(){

		String version = param.getString("version");
		overviewPage.search(overviewPage.getVersion(),version);
		Assert.assertEquals(overviewPage.getWebDataTr().findElement(By.xpath("./td[6]"))
				.getText().trim(),version,"终端版本搜索验证错误");
	}

	@Test(dependsOnMethods = "searchByName",description = "终端系统搜索")
	public void searchBySystem(){

		String system = param.getString("system");
		overviewPage.search(overviewPage.getSystem(),system);
		Assert.assertEquals(overviewPage.getWebDataTr().findElement(By.xpath("./td[7]"))
				.getText().trim(),system,"终端系统搜索验证错误");
	}
}
