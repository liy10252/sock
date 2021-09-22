package cases.viruskill.log.sysdef;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.log.sysdef.SysDefPage;
import util.SeleniumTestCase;

public class SearchTest extends SeleniumTestCase {

	SysDefPage sysDefPage;

	@Test(description = "终端名称搜索")
	public void searchByName(){

		sysDefPage = new SysDefPage(driver);
		sysDefPage.getCustomSearch().click();
		String name = param.getString("name");
		sysDefPage.search(sysDefPage.getClientName(),name);
		Assert.assertEquals(sysDefPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),name,"终端名称搜索验证错误");
	}

	@Test(dependsOnMethods = "searchByName",description = "ip地址搜索")
	public void searchByIp(){

		String ip = param.getString("ip");
		sysDefPage.search(sysDefPage.getIpaddr(),ip);
		Assert.assertEquals(sysDefPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),ip,"ip地址搜索验证错误");
	}
}
