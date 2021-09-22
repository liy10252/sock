package cases.leakscan.log.notice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.leakscan.log.notice.NoticePage;
import util.SeleniumTestCase;

public class SearchTest extends SeleniumTestCase {

	NoticePage noticePage;

	@Test(description = "公告号")
	public void searchByPatch(){

		noticePage = new NoticePage(driver);
		noticePage.getCustomSearch().click();
		String notice = param.getString("notice");
		noticePage.search(noticePage.getNoticeName(),notice);
		Assert.assertEquals(noticePage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),notice,"公告号错误");
	}

	@Test(dependsOnMethods = "searchByPatch",description = "终端名称")
	public void searchByName(){

		String name = param.getString("name");
		noticePage.search(noticePage.getClientName(),name);
		Assert.assertEquals(noticePage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("name"),"终端名称错误");
	}


	@Test(dependsOnMethods = "searchByPatch",description = "IP地址")
	public void searchByIp(){

		String ip = param.getString("ip");
		noticePage.search(noticePage.getIpaddr(),ip);
		Assert.assertEquals(noticePage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("ip"),"ip地址搜索错误");

	}
}