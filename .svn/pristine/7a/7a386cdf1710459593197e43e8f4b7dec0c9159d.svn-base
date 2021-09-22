package cases.leakscan.overview;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.leakscan.overview.OverViewPage;
import util.SeleniumTestCase;

public class SearchTest extends SeleniumTestCase {

	OverViewPage overViewPage;

	@Test(description = "计算机名称")
	public void searchByName(){

		overViewPage = new OverViewPage(driver);
		overViewPage.getCustomSearch().click();
		String name = param.getString("name");
		overViewPage.search(overViewPage.getComputerName(),name);
		Assert.assertEquals(overViewPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),name,"计算机名称错误");
	}

	@Test(dependsOnMethods = "searchByName",description = "IP地址")
	public void searchByIp(){

		String ip = param.getString("ip");
		overViewPage.search(overViewPage.getIpaddr(),ip);
		Assert.assertEquals(overViewPage.getWebDataTr().findElement(By.xpath("./td[3]"))
				.getText().trim(),ip,"ip地址搜索错误");

	}
}
