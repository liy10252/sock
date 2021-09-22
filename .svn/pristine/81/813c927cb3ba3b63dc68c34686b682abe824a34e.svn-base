package cases.firewall.log.network;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.network.NetWorkPage;
import util.SeleniumTestCase;

public class SearchTest extends SeleniumTestCase {

	NetWorkPage netWorkPage;

	@Test(description = "程序筛选")
	public void searchByProgram(){

		netWorkPage = new NetWorkPage(driver);
		netWorkPage.getCustomSearch().click();
		String program = param.getString("program");
		netWorkPage.search(netWorkPage.getProgram(),program);
		Assert.assertEquals(netWorkPage.getWebDataTr().findElement(By.xpath("./td[4]"))
				.getText().trim(),program,"程序筛选验证错误");
	}

	@Test(dependsOnMethods = "searchByProgram",description = "访问网址")
	public void searchByVisitURL(){

		String visitURL = param.getString("visitURL");
		netWorkPage.search(netWorkPage.getVisitURL(),visitURL);
		Assert.assertTrue(netWorkPage.getWebDataTr().findElement(By.xpath("./td[5]"))
				.getText().trim().contains(visitURL),"访问网址验证错误");
	}
}
