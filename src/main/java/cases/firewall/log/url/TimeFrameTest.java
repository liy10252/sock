package cases.firewall.log.url;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.url.UrlPage;
import util.SeleniumTestCase;

public class TimeFrameTest extends SeleniumTestCase {

	UrlPage urlPage;

	@Test(description = "时间范围本周")
	public void thisWeek(){

		urlPage = new UrlPage(driver);
		urlPage.getCustomSearch().click();
		urlPage.timeFrameTool(urlPage.getWeek());
		Assert.assertTrue(urlPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("thisWeek")),"时间范围验证错误");
	}


	@Test(dependsOnMethods = "thisWeek",description = "时间范围本月")
	public void thisMonth(){
		urlPage.timeFrameTool(urlPage.getMonth());
		Assert.assertTrue(urlPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("thisMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围上月")
	public void lastMonth(){
		urlPage.timeFrameTool(urlPage.getLastMonth());
		Assert.assertTrue(urlPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("lastMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围指定")
	public void special(){

		urlPage.specialTool(param.getString("start"),param.getString("end"),"noButton");
		Assert.assertTrue(urlPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("special")),"时间范围验证错误");

	}

}