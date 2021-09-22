package cases.viruskill.log.virusdetail;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.log.virusdetail.VirusDetailPage;
import util.SeleniumTestCase;

public class SearchTest extends SeleniumTestCase {

	VirusDetailPage virusDetailPage;

	@Test(description = "病毒名搜索")
	public void searchByVirus(){

		virusDetailPage = new VirusDetailPage(driver);
		virusDetailPage.getCustomSearch().click();
		String virus = param.getString("virus");
		virusDetailPage.search(virusDetailPage.getVirusName(),virus);
		Assert.assertEquals(virusDetailPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),virus,"病毒名搜索验证错误");
	}

	@Test(dependsOnMethods = "searchByVirus",description = "终端名称搜索")
	public void searchByName(){

		virusDetailPage.search(virusDetailPage.getClientName(),param.getString("name"));
		Assert.assertEquals(virusDetailPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("name"),"终端名称搜索验证错误");
	}

	@Test(dependsOnMethods = "searchByVirus",description = "ip地址搜索")
	public void searchByIp(){

		virusDetailPage.search(virusDetailPage.getIpaddr(),param.getString("ip"));
		Assert.assertEquals(virusDetailPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("ip"),"ip地址搜索验证错误");
	}
}
