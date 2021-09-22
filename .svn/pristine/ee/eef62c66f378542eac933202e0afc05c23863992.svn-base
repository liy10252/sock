package cases.leakscan.log.patch;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.leakscan.log.patch.PatchPage;
import util.SeleniumTestCase;

public class SearchTest extends SeleniumTestCase {

	PatchPage patchPage;

	@Test(description = "补丁名称")
	public void searchByPatch(){

		patchPage = new PatchPage(driver);
		patchPage.getCustomSearch().click();
		String patch = param.getString("patch");
		patchPage.search(patchPage.getPatchName(),patch);
		Assert.assertEquals(patchPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),patch,"补丁名称错误");
	}

	@Test(dependsOnMethods = "searchByPatch",description = "终端名称")
	public void searchByName(){

		String name = param.getString("name");
		patchPage.search(patchPage.getClientName(),name);
		Assert.assertEquals(patchPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("name"),"终端名称错误");
	}


	@Test(dependsOnMethods = "searchByPatch",description = "IP地址")
	public void searchByIp(){

		String ip = param.getString("ip");
		patchPage.search(patchPage.getIpaddr(),ip);
		Assert.assertEquals(patchPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("ip"),"ip地址搜索错误");

	}
}
