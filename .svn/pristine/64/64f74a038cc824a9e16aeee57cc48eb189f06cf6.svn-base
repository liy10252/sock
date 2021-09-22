package cases.viruskill.overview;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.overview.OverViewPage;
import util.SeleniumTestCase;

public class SearchTest extends SeleniumTestCase {

	 OverViewPage overViewPage;

	@Test(description = "终端名称搜索")
	public void searchByName(){

		overViewPage = new OverViewPage(driver);
		overViewPage.getCustomSearch().click();
		String name = param.getString("name");
		overViewPage.search(overViewPage.getClientName(),name);
		Assert.assertEquals(overViewPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),name,"终端名称搜索验证错误");
	}

	@Test(dependsOnMethods = "searchByName",description = "ip地址搜索")
	public void searchByIp(){

		String ip = param.getString("ip");
		overViewPage.search(overViewPage.getIpaddr(),ip);
		Assert.assertEquals(overViewPage.getWebDataTr().findElement(By.xpath("./td[3]"))
				.getText().trim(),ip,"ip地址搜索验证错误");
	}

	@Test(dependsOnMethods = "searchByName",description = "病毒库版本")
	public void searchByVirus(){

		String virus = param.getString("virus");
		overViewPage.search(overViewPage.getVirusBank(),virus);
		Assert.assertEquals(overViewPage.getWebDataTr().findElement(By.xpath("./td[4]"))
				.getText().trim(),virus,"病毒库版本验证错误");
	}

}
